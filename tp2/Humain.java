package tp2;

public class Humain {

//Attribut
	
	private String name ;
	private int age ;
	private String gender ;
	private String conj ;
//Constructeur	
	// VIDE
	
	public Humain() {
		this.name = "Non Attribué";
		this.age = -1 ;
		this.gender = "Non Attribué";
		this.conj = "Null";
	}
	
	public Humain(String name, int age, String gender) {
		super();
		this.setName(gender);
		this.setAge(age);
		this.setGender(gender);
		this.conj = "Null";	
	}

	public Humain(String name, int age, String gender, String conj) {
		super();
		this.setName(gender);
		this.setAge(age);
		this.setGender(gender);
		this.conj = conj;
	}

// Methods
	
	// setters
	public void setName(String nom) {
		if (nom =="") {
		System.err.println("Rentrez un nom valide !!");
		}
		else
		{this.name = nom;}
	}

	
	public void setAge(int ageinit) {
		if (ageinit >= 0 || ageinit <=100) {
			this.age = ageinit ;
		}
		else {
			System.err.println("Rentrez un age valide !!");
		}
	}

	
	public void setGender(String genre) {
		if (genre == "M" || genre == "F" || genre == "T")
		{
		this.gender = genre ;}
		else {
			System.err.println("Genre Non défini !!");
		}
	}
	
	public void setConj(String conjoint) {
		this.conj = conjoint;
	}

	//Getters
	
	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String getGender() {
		return this.gender;
	}

	public String getConj() {
		return this.conj;
	}

	// toString
	public String toString() {
		return "Humain de nom ' " + this.name + " ', agé de ' " + this.age + " ans' de genre ' " + this.gender 
		+ " ', uni avec  ' "+ this.conj + " '.";
	}
	
	//verification d'union
	public boolean estUni() {
		return ( this.getConj() != "Null" );
	}
	
	//unir deux humains
	public void sUnir(Humain h) {
		String name1 = this.getName();
		String name2 = h.getName();
		
		this.setConj(name2);
		h.setConj(name1);
	}

	//se separer
	public void seSeparer() {
		this.setConj("Null");		
	}
	
	//est majeur 
	public boolean estMajeur() {
		return (this.getAge() > 18);
	}
	
	
	
	
	
	
	
	
	
	
}
