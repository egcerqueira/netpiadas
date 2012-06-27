package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class Humorista extends Model {

	public String nome;
	
	public String email;

	@OneToMany(mappedBy="humorista")
	public List<Piada> piadas;
	
	@Override
	public String toString() {
		return nome;
	}
	
}
