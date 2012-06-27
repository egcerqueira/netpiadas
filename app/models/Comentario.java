package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Comentario extends Model {

	public String nome;
	
	public String email;
	
	public String comentario;
	
	@Override
	public String toString() {
		return comentario;
	}
	
}