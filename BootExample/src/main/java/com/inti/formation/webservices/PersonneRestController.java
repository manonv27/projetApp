package com.inti.formation.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.imetier.IPersonneMetier;
import com.inti.formation.model.Personne;

@RestController
@RequestMapping("/apiPersonne")
public class PersonneRestController {

	@Autowired
	private IPersonneMetier metier;
	
	@RequestMapping(value="/personnes", method=RequestMethod.GET)
	@Secured(value={"ROLE_ADMIN"})
	public List<Personne> findAll(){
		return metier.findAll();
	}
	
	@RequestMapping(value="/personne/{id}", method=RequestMethod.GET)
	@Secured(value={"ROLE_FORMATEUR"})
	public Personne findOne(@PathVariable("id") int id ) {
		return metier.findOne(id);
	}
	
	@RequestMapping(value="deleteP/{id}", method=RequestMethod.DELETE)
	public void delete (@PathVariable("id") int id) {
		metier.delete(id);
	}

	@RequestMapping(value="/ajouterP", method=RequestMethod.POST)
	public Personne ajouter(@RequestBody Personne p) {
		return metier.ajouter(p);
	}
	
	@RequestMapping(value="/updateP", method=RequestMethod.PUT)
	public Personne update(@RequestBody Personne p) {
		
		return metier.update(p);
		
	}
	public IPersonneMetier getMetier() {
		return metier;
	}

	public void setMetier(IPersonneMetier metier) {
		this.metier = metier;
	} 
}
