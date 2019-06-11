package com.inti.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inti.formation.model.Personne;

@Repository("prepo")
public interface IPersonneRepository extends JpaRepository<Personne, Integer>{

	
	public Personne findByAgeAndNom(int age, String nom);
	
//	@Query("select p from Personne p where p.nom=:x")
//	public Personne getByName(@Param("x")String nom);
	
	// requete sql
	@Query(value="select * from personne where nom=:x", nativeQuery=true) // = true = cette request est une requete SQL
	public Personne getByName(@Param("x")String nom);
}
