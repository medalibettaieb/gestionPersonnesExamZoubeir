package tn.edu.esprit.zoubaExam.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tn.edu.esprit.zoubaExam.domain.Personne;

@ManagedBean
@SessionScoped
public class CreatePersonne implements Serializable {

	private static final long serialVersionUID = 1L;
	// model
	private Personne personne = new Personne();
	private List<Personne> personnes = new ArrayList<Personne>();
	private int id = 1;

	// methodes
	public String doAddPersonne() {
		personne.setId(id);
		personnes.add(personne);
		personne = new Personne();
		System.out.println(personnes.size());
		id++;
		return "gestionPersonne?faces-redirect=true";
	}

	public CreatePersonne() {
		// TODO Auto-generated constructor stub
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public List<Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}

}
