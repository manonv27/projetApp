package com.inti.formation.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.inti.formation.entities.Article;
import com.inti.formation.imetier.IArticleMetier;


@RestController
@RequestMapping(value="/apiArticle")
public class ArticleRestController {
	
	@Autowired
	private IArticleMetier metier;
	
	@RequestMapping(value="/articles", method=RequestMethod.GET)
	public List <Article> findAll(){
		return metier.findAll();
	}
	
	@RequestMapping(value="/article/{id}", method=RequestMethod.GET)
	public Article findOne(@PathVariable("id") int id){
		return metier.findOne(id);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") int id){
		metier.delete(id);
	}
	
	@RequestMapping(value="/ajouterAr", method=RequestMethod.POST)
	public Article ajouter(@RequestBody Article a){
		return metier.ajouter(a);
	}
	
	@RequestMapping(value="/updateAr", method=RequestMethod.PUT)
	public Article update(@RequestBody Article a){
		return metier.update(a);
	}

	public IArticleMetier getMetier() {
		return metier;
	}

	public void setMetier(IArticleMetier metier) {
		this.metier = metier;
	}

}
