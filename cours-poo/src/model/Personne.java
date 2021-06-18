package model;

import java.util.Arrays;

public class Personne implements Consultation {
	private int num;
	private String nom;
	private String prenom;
	private Adresse[] adresse;
	
	
	public Personne() {
		super();
	}
	
	
	
	public Personne(int num, String nom, String prenom, Adresse[] adresse) {
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}



	public Personne(int num, String nom, String prenom) {
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		if (num >= 0) {
			this.num = num;
		}else {
			this.num = 0;
		}
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	

	public Adresse[] getAdresse() {
		return adresse;
	}



	public void setAdresse(Adresse[] adresse) {
		this.adresse = adresse;
	}



	@Override
	public String toString() {
		return "Personne [num=" + num + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + Arrays.toString(adresse)
				+ "]";
	}



	@Override
	public void doSomething() {
		
			System.out.println("yes");
			
		
		
	}



	
	
	

	
}
