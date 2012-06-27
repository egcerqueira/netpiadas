package controllers;

import play.*;
import play.db.jpa.JPABase;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
    	List<JPABase> humoristas = Humorista.findAll();
        render(humoristas);
    }

    public static void deletar(Long id) {
    	Piada piada = Piada.findById(id);
    	piada.delete();
    	index();
    }
    
    public static void editar(Long id) {
    	List<Humorista> humoristas = Humorista.findAll();
    	Piada piada = Piada.findById(id);
    	render(piada, humoristas);
    }
    
    public static void salvar(Piada piada) {
    	piada.save();
    	index();
    }
    
    public static void adicionar() {
    	List<JPABase> humoristas = Humorista.findAll();
    	render(humoristas);
    }
    
    public static void mostrar(Long id){
    	Piada piada = Piada.findById(id);
    	render(piada);
    }
}