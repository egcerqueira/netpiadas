package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class Piada extends Model {

	public String descricao;
	
	@ManyToOne
	@JoinColumn(name="humorista_id")
	public Humorista humorista;
	
	@OneToMany
	public List<Comentario> comentarios;
	
	@Override
	public String toString() {
		return descricao;
	}
	
}
