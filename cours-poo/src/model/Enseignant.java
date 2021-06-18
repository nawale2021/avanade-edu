package model;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Enseignant extends Personne {

	private int salaire;
	
	
	public Enseignant(int num, String nom, String prenom, Adresse[] adresse, int salaire) {
		super(num, nom, prenom, adresse);
		this.salaire = salaire;
	}

	public Enseignant(int salaire) {
		this.salaire = salaire;
	}

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Enseignant [salaire=" + salaire + ", toString()=" + super.toString() + "]";
	}
	
		
	
	
}
