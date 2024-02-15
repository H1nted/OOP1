package tp2 ;
import java.util.Scanner;

public class Etudiant {
	
//	Attributes
	
	private String nom ;
	private int age ;
	private double noteProg ;
	private double noteSyst ;
	private double noteStage ;
	private Inscription info;


	
	
// Constructors
	
	//first generic constructor
	public Etudiant() {
		nom = "Non Attribué" ;
		age = -1 ;
		noteProg = -1 ;
		noteSyst = -1 ;
		noteStage = -1 ;
	}
	
	public Etudiant(String name, int age) {
		this.nom = name;
		this.setAge(age);
		noteProg = -1 ;
		noteSyst = -1 ;
		noteStage = -1 ;
	}
	
	//constructor TP 2.2
	public Etudiant(String name, int age, int codeI, int codeP) {
		this.nom = name ;
		this.setAge(age);
		this.info = new Inscription(codeI, codeP);
		noteProg = -1 ;
		noteSyst = -1 ;
		noteStage = -1 ;
	}
	
	//real instant maker
	
	public Etudiant(String name, int age, double prog, double syst, double stage) {
		this.nom = name ;
		this.age = age ;		
		this.setNoteProg(prog);
		this.setNoteSyst(syst);
		this.setNoteStage(stage);
		
	}
	
	//constructor TP2 avec codeP et codeI
	
	public Etudiant(String name, int age, double prog, double syst, double stage, int codeI, int codeP) {
		this.nom = name ;
		this.setAge(age);
		this.setNoteProg(prog);
		this.setNoteSyst(syst);
		this.setNoteStage(stage);
		this.info = new Inscription(codeI, codeP);
	}
	
	//constructor TP2 avec juste l'objet
	public Etudiant(String name, int age, double prog, double syst, double stage, Inscription info) {
		this.nom = name ;
		this.setAge(age);
		this.setNoteProg(prog);
		this.setNoteSyst(syst);
		this.setNoteStage(stage);
		this.info = info;
	}
	
	// method to make an instance using the console
	
	@SuppressWarnings("resource")
	public void saisie() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("donnez le nom de l'étudiant :");
		this.nom = sc.next();
		
		System.out.print("donnez l'age de l'étudiant :");
		this.age = sc.nextInt();
		while (this.age < 16 || this.age > 140)
		{System.err.print("erreur : rentrez un age valide ! ");
			this.age = sc.nextInt();}		
		
		System.out.print("donnez la note de Programmation :");
		this.noteProg = sc.nextDouble();
		while (this.noteProg < 0 || this.noteProg >20)
		{System.err.print("erreur : rentrez une note de Programmation valide ! ");
		this.noteProg = sc.nextDouble();}	
			
		System.out.print("donnez la note de Système :");
		this.noteSyst = sc.nextDouble();
		while (this.noteSyst < 0 || this.noteSyst >20)
		{System.err.print("erreur : rentrez une note de Système valide ! ");
		this.noteSyst = sc.nextDouble();}
		
		System.out.print("donnez la note de Stage :");
		this.noteStage = sc.nextDouble();
		while (this.noteStage < 0 || this.noteStage >20)
		{System.err.print("erreur : rentrez une note de Stage valide ! ");
		this.noteStage = sc.nextDouble();}
		
		System.out.print("donnez les codes d'inscriptions : ");
		int ci = sc.nextInt();
		while (ci < 1 || ci > 2)
		{System.err.print("erreur : rentrez un code Inscription valide ! ");
		ci = sc.nextInt();}
		
		System.out.print("donnez les codes de pays : ");
		int cp = sc.nextInt();
		while (cp < 1 || ci > 3)
		{System.err.print("erreur : rentrez un code Pays valide ! ");
		cp = sc.nextInt();}
		sc.close();
		
		this.info = new Inscription(ci, cp);
	}
//access methods
	
	public String getNom() {
		return this.nom ;
	}
	
	public void setNom(String name) {
		this.nom = name ;
	}
	
	public int getAge() {
		return this.age ;
	}
	
	public void setAge(int age) {
		if (age >= 16 || age <= 140)
		{this.age = age ;}
		else
		{System.err.println("erreur : rentrez un age valide ! ");}
		
		
	}
	
	public double getNoteProg() {
		return this.noteProg ;
	}	
	
	public void setNoteProg(double prog) {
		if (prog >= 0 || prog <= 20)
		{this.noteProg = prog ;}
		else
		{System.err.println("erreur : rentrer une note valide !");}
	}
	
	public double getNoteSyst() {
		return this.noteSyst ;
	}
	
	public void setNoteSyst(double syst) {
		if (syst >= 0 || syst <= 20)
		{this.noteSyst = syst ;}		
		else
		{System.err.println("erreur : rentrer une note valide !");}
	}
	
	public double getNoteStage() {
		return this.noteStage ;
	}

	public void setNoteStage(double stage) {
		if (stage >= 0 || stage <= 20)
		{this.noteStage = stage;}		
		else
		{System.err.println("erreur : rentrer une note valide !");}
		
	}
	
	public String getInscri() {
		return("les informations d'inscription sont : "+this.info);
	}
	
	public void setInscription(int ci, int cp) {
		this.info.setInscri(ci);
		this.info.setPays(cp);
	}
	
// method to calculate the average mark 
	public double moyenne() {
		return ((this.noteProg + this.noteSyst + this.noteStage)/3);
	}
	
// method to give your mentions
	
	public String mention() {
		double m = this.moyenne();		
		if (m < 10)
		{return "Ajourné" ;}
		if (m < 12)
		{return "Passable" ;}
		if (m < 14)
		{return "Assez Bien" ;}
		if (m < 16)
		{return "Bien" ;}
		if (m < 18)
		{return "Très Bien" ;}
		return "Excellent";
	}
	
	public String LigneResultat() {
		String name = this.nom ;
		double moy = this.moyenne() ;
		String ment = this.mention();
		String fin = "";
		if (moy < 10) {
			if (this.noteProg >= 10) {
				fin = fin + "| Programmation ACQ = " + this.noteProg;
			}
			if (this.noteSyst >= 10) {
				fin = fin + "| Système ACQ = " + this.noteSyst;
			}
			if (this.noteStage >= 10) {
				fin = fin + "| Stage ACQ = "+this.noteStage;
			}
		}
		return("nom : " + name + " | moyenne : " + moy + " | mention : "+ ment + fin);
		
		
	}
	
// method to show the full informations without printing every single one
	
	public String toString () {
		return ("nom : " + this.nom + " | age : " + this.age + " | note Programmation : " + this.noteProg +
				" | note Système : " + this.noteSyst + " | note Stage : " + this.noteStage + " | informations d'inscription : "
				+ this.info);
	}
	
}

	

