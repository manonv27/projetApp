package com.inti.formation.imetier;


import com.inti.formation.model.Personne;

public interface IPersonneMetier extends IGenericMetier <Personne, Integer>{

	public Personne rechercheParAgetNom(int age, String nom);
	
	public Personne getByName(String nom);

}
