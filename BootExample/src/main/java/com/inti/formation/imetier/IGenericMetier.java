package com.inti.formation.imetier;

import java.util.List;

import com.inti.formation.model.Personne;

public interface IGenericMetier <P, I>{
	
	public P ajouter(P p);
	public P update (P p);
	public void delete(int id);
	public P findOne(int id); 
	public List<P> findAll ();

}
