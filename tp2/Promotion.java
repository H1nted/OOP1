package tp2;

import java.util.ArrayList;

public class Promotion {

	//Attributes
	private String yname ="Pas de promos";
	private int year = 0;
	private  ArrayList<Etudiant> students = new ArrayList<Etudiant>();
	
	
	//constructors
	
	public Promotion() {
	}
	
	public Promotion(String promo,int annee ) {
		this.yname = promo;
		this.year = annee;
		this.students = new ArrayList<Etudiant>();
	}
	
	//Accesseurs 
	
	public int getYear() {
		return this.year;
	}
	
	public void setYear(int y) {
		this.year = y;
	}
	
	public String getPromo() {
		return this.yname;
	}
	
	public void setPromo(String p) {
		this.yname = p ;
	}
	
	//methods on the arraylist
	
	public void inscrire(Etudiant etud) {
		if (this.students.contains(etud) != true) {
			this.students.add(etud);}
		else {
			System.out.println("Etudiant existant !!");
			}
	}
	
	
	public int nbEtudiants() {
			return this.students.size();
	}
	
	
	
	public String afficheEtudiant() {
		
		int cond = this.students.size();
		String s ="";
		
		if (cond != 0) {
			for (int i = 0 ; i < cond; i++) {
				s += "\n Etudiant numéro : "+ i + " est : "+this.students.get(i);
			}
		}
		else {
				s +="Pas d'étudiants";
			}
		return s;
		}
	
	
	public Etudiant getEtudiant(int i) {
		if (this.nbEtudiants() > 0 ) {
			if (i > 0 && i <= this.nbEtudiants()) {
				return this.students.get(i-1);   //ici l'utilisateur va donner le nombre des étudiants réél non les indexs
				}
			}
		return null;
		}
	
	
	
}
