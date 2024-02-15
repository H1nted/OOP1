package tpPostal;

import java.util.ArrayList;
//import java.util.Collections;

public class SacPostal {
	
	private double capacity = 0.5;
	private ArrayList<ObjetPostal> objets = new ArrayList<>();
//	private ArrayList<Colis> colis = new ArrayList<>();
//	private ArrayList<Letter> lettres = new ArrayList<>();
	
	
	//Constructors 
	
	public SacPostal() {	
	}
	
	public SacPostal(double capacity) {	
		this.setCapacity(capacity);
	}
	
	public SacPostal(double capacity, ArrayList<ObjetPostal> objets) {
		this.setCapacity(capacity);
		this.setObjets(objets);
	}

	//Accessors
	
	public double getCapacity() {
		return capacity;
	}

	public ArrayList<ObjetPostal> getObjets() {
		return(objets);
//		return (ArrayList<ObjetPostal>)Collections.unmodifiableList(objets);
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public void setObjets(ArrayList<ObjetPostal> objets) {
		this.objets = objets;
	}
	
	
	// Methods
	
	public double maxVolume() {
		double maxVolume = 0;
		for (ObjetPostal element: this.getObjets()) {
			maxVolume += element.getVolume();
		}
		return (maxVolume + 0.005);
	}
	
	public String addObjet(ObjetPostal obj) {
		String s ="";
		
		if ((this.maxVolume()+obj.getVolume()) >= this.getCapacity()) {
			s = "Sac Postal plein, votre artice ne peut pas être rajouté !";
		}
		else {
			s = "Artice ajouté ! ";
			this.getObjets().add(obj);
		}
		return s;
	}
	
	public double totalR() {
		double total =0;
		for (ObjetPostal element: this.getObjets()) {
			total = element.tarifR();
		}
		return total;
	}
	
	public ArrayList<ObjetPostal> extract(int codePostal) {
		ArrayList<ObjetPostal> extractionList = new ArrayList<>();
		for (ObjetPostal element: this.getObjets()) {
			if (codePostal == element.getCodePost()) {
				extractionList.add(element);
				this.getObjets().remove(element);
			}
		}
		return extractionList;
		
	}
	
	

}
