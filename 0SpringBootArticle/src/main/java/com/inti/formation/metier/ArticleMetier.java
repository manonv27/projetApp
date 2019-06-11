package com.inti.formation.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.formation.entities.Article;
import com.inti.formation.imetier.IArticleMetier;

import com.inti.formation.repository.IArticleRepository;


@Service
public class ArticleMetier implements IArticleMetier{

	@Autowired
	private IArticleRepository repo;
	
	
	@Override
	public Article ajouter(Article a) {
		return repo.save(a);
	}

	@Override
	public Article update(Article a) {
		return repo.save(a);
	}

	@Override
	public void delete(Integer id) {
		repo.deleteById(id);
		
	}

	@Override
	public Article findOne(Integer id) {
		return repo.getOne(id);
	}

	@Override
	public List<Article> findAll() {
		return repo.findAll();
	}

	public IArticleRepository getRepo() {
		return repo;
	}

	public void setRepo(IArticleRepository repo) {
		this.repo = repo;
	}





}
