package com.inti.formation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.inti.formation.imetier.IPersonneMetier;
import com.inti.formation.model.Personne;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;




@SpringBootApplication
@EnableSwagger2
public class BootExampleApplication implements CommandLineRunner{ 
	

	
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.inti.formation")).build();


	}
	@Autowired
	private IPersonneMetier metier;
	
	public static void main(String[] args) {
		SpringApplication.run(BootExampleApplication.class, args);
	}

	// Methode de test implementer par commandLineRunner
	// pour le web service on commente
	@Override
	public void run(String... args) throws Exception {
		
		Personne p = new Personne(1, "royer", "nana", 12);
		Personne p1 = new Personne(2, "roy", "tim", 16);
		Personne p2 = new Personne(3, "roy", "zoe", 6, "roi", "123", "ADMIN");
		Personne p3 = new Personne(4, "roy", "emily", 6, "enfant", "123", "FORMATEUR");

//		metier.ajouter(p);
		System.out.println(metier.ajouter(p));
		System.out.println(metier.ajouter(p1));
		System.out.println(metier.ajouter(p2));
		System.out.println(metier.ajouter(p3));
//		p1.setAge(40);
//		System.out.println(metier.update(p1));
//		
//		System.out.println(metier.findOne(1));
//		
//		List<Personne> personnes = metier.findAll();
//		for (Personne personne : personnes) {
//			System.out.println(personne);
			
	
//	metier.delete(2);
	
//	Personne p2 = new Personne(3, "toto", "tt", 12);
//	Personne p3 = new Personne(4, "titi", "ii", 17);
////	System.out.println(metier.ajouter(p3));
////	System.out.println(metier.rechercheParAgetNom(12, "toto"));
//	System.out.println(metier.getByName("toto"));
//	


		}
}

