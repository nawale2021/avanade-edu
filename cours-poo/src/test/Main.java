package test;

import model.Adresse;
import model.Enseignant;
import model.Etudiant;
import model.Personne;


public class Main {

	public static void main(String[] args) {
		int i = 0;
//		Personne personne = new Personne();
//		personne.setNom("wick");
//		personne.setPrenom("john");
//		personne.setNum(-100);
		
		Personne personne2= new Personne(200,"dalton","jack");
		
		System.out.println(personne2);
		
		Adresse adresse = new Adresse();
		adresse.setRue("Ask");
		adresse.setCodePostal("95100");
		adresse.setVille("Argenteuil");
		
		Adresse adresse2 = new Adresse("rethondes","1200","marseille");
		Adresse adresse3 = new Adresse("marcelCachin","75016","paris");
		
		System.out.println(adresse);
		
		//Personne personne3= new Personne(300,"maggion","ryan", adresse);
		
		Adresse[] adresses = new Adresse[] {adresse,adresse2,adresse3};
		Personne personne3= new Personne(300,"maggion","ryan", adresses);
		
		System.out.println(personne3);
		
		for (i=0; i < adresses.length; i++) {
			System.out.println(adresses[i].getVille());
		}
		
		Etudiant etudiant = new Etudiant(400,"Nawale","Hayoun",adresses,"master");
		System.out.println(etudiant);
		
		Enseignant enseignant = new Enseignant(500, "setraji", "ryan", adresses, 3600);
		System.out.println(enseignant);
		
		System.out.println(enseignant instanceof Personne);
		System.out.println(personne2 instanceof Enseignant);
		Personne[] personnes = new Personne[] {etudiant, personne2, enseignant};
		
		for(Personne p: personnes){
			
			if (p instanceof Enseignant) {
				System.out.println(((Enseignant) p).getSalaire());
			} else if(p instanceof Etudiant) {
				System.out.println(((Etudiant) p).getNiveau());
				
			} else {
				System.out.println(p.getNum());
			}
		
		}
		
		
		System.out.println(doSomething());
				
	}

}
