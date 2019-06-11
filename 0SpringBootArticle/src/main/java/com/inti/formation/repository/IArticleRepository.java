package com.inti.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.inti.formation.entities.Article;
import java.lang.String;

@Repository
public interface IArticleRepository extends JpaRepository<Article, Integer>  {



}
