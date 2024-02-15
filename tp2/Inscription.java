package tp2;

public class Inscription {
	
	
	//attribut
	private int codeInscription;
	private int codePays;

	
	//constructors
	public Inscription() {
		codeInscription = -1;
		codePays = -1;
	}

	public Inscription(int ci, int cp) {
		this.setInscri(ci);
		this.setPays(cp);
	}
	
	//methode
	public String getInscri() {
		return("code d'inscription est : "+ this.codeInscription);
	}
	
	public void setInscri(int ci) {
		if (ci == 1 || ci == 2)
		{this.codeInscription = ci;}
		else 
		{System.err.print("Code Inscription erroné !!");}
	}
				
	public String getPays() {
		return("code Pays est : "+this.codePays);
	}
	
	public void setPays(int cp) {
		if (cp == 1 || cp == 2 || cp == 3)
		{this.codePays = cp;}
		else 
		{System.err.print("Code Pays erroné !!");}
	}	
	
	public String nationaliste() {
		int req =this.codePays;
		if (req == 2)
		{return ("L'étudiant est étranger francophone");}
		if (req == 3)
		{return ("L'étudiant est étranger non francophone");}
		return ("L'étudiant est Francais");
	}
	
	public String typeInscription() {
		int req = this.codeInscription;
		if (req == 2)
		{return (" Une première Inscription");}
		return("Une Réinscription");
	}
	
	public String toString() {
		return( this.nationaliste() +" et effectue " + this.typeInscription());
	}
}
