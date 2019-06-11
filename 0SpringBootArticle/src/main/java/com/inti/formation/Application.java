package com.inti.formation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.inti.formation.entities.Article;
import com.inti.formation.imetier.IArticleMetier;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
@SpringBootApplication
public class Application implements CommandLineRunner{
	
//	@Bean
//	public Docket productApi() {
//		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.inti.formation")).build();
//	}
//	
	@Autowired
	private IArticleMetier metier;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	public void run(String... args) throws Exception {
		
		Article a1 = new Article(2, "stp", "le serveur", "ajoute", "mon article");
		Article a2 = new Article(3, "chance", "espoir", "vie", "bonne humeur");
		Article a3 = new Article(3, "merci", "continue", "comme", "ça");
//		metier.ajouter(a3);
		
//		System.out.println(metier.ajouter(p2));		
//		System.out.println(metier.update(p2));
//		metier.delete(3);
		
		System.out.println(metier.findOne(2));
		
//		List<Article> articles = metier.findAll();
//		for  (Article article : articles) {
//			System.out.println(article);	
//		}
	}


}
