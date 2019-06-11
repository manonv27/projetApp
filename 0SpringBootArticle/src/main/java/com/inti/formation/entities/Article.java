package com.inti.formation.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@SuppressWarnings("serial")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Article implements Serializable{

	@Id
	private int id;
	private String titre;
	private String contenu;
	private String url;
	private String parution;
	
	public Article(int id, String titre, String contenu, String url, String parution) {
		super();
		this.id = id;
		this.titre = titre;
		this.contenu = contenu;
		this.url = url;
		this.parution = parution;
	}
	public Article() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getParution() {
		return parution;
	}
	public void setParution(String parution) {
		this.parution = parution;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", titre=" + titre + ", contenu=" + contenu + ", url=" + url + ", parution="
				+ parution + "]";
	}

}
