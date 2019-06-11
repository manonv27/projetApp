package com.inti.formation.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.inti.formation.imetier.IPersonneMetier;
import com.inti.formation.model.Personne;
import com.inti.formation.repository.IPersonneRepository;

@Service 
public class PersonneMetier implements IPersonneMetier {

	@Autowired
	@Qualifier("prepo")
	private IPersonneRepository repo; 
	
	@Override
	public Personne ajouter(Personne p) {
		
		return repo.save(p); // methode qui permet de sauver l'objet et le retourne directiement donc on met dans return
	}

	@Override
	public Personne update(Personne p) {
		
		return repo.save(p); // idem car quand trouve pas l'objet le créer, sinon le ressort
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);
		
	}

	@Override
	public Personne findOne(int id) {
		
		return repo.getOne(id);
	}

	@Override
	public List<Personne> findAll() {
		
		return repo.findAll();
	}
	public Personne rechercheParAgetNom(int age, String nom)
	{
		return repo.findByAgeAndNom(age, nom);
	}

	public Personne getByName(@Param("x")String nom) {
	
		return repo.getByName(nom);
	}
	

}
