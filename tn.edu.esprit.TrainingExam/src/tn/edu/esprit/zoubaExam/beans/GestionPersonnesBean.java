package tn.edu.esprit.zoubaExam.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import tn.edu.esprit.zoubaExam.domain.Personne;

@ManagedBean
@ViewScoped
public class GestionPersonnesBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ManagedProperty("#{createPersonne.personnes}")
	private List<Personne> personnes;
	private List<Personne> filtredPersonnes;
	private Personne personne = new Personne();

	public GestionPersonnesBean() {
	}

	public String doUpdatePersonne() {
		personnes.remove(personne);
		personnes.add(personne);
		personne = new Personne();
		return "";
	}

	public String doDelete() {
		System.out.println(personne.getId());
		personnes.remove(personne);
		personne = new Personne();
		return "";
	}

	public List<Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}

	public List<Personne> getFiltredPersonnes() {
		return filtredPersonnes;
	}

	public void setFiltredPersonnes(List<Personne> filtredPersonnes) {
		this.filtredPersonnes = filtredPersonnes;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

}
