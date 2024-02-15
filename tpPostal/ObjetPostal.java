package tpPostal;

public abstract class ObjetPostal {
	
	//Attributes 
	
	private String from;	
	private String to;
	private int codePost;
	private double weight;
	private double volume;
	private  Recommandation rec;
	
	//Constructors
	
	public ObjetPostal() {
	}

	public ObjetPostal(String origin, String destination, int codePost, double weight, double volume,
			Recommandation rec) {
		this.setOrigin(origin);
		this.setDestination(destination);
		this.setCodePost(codePost);
		this.setWeight(weight);
		this.setVolume(volume);
		this.setRec(rec);
	}
	
	//Accessors
	
	public String getOrigin() {
		return this.from;
	}
	
	public String getDestination() {
		return this.to;
	}
	
	public int getCodePost() {
		return this.codePost;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public double getVolume() {
		return this.volume;
	}
	public Recommandation getRec() {
		return this.rec;
	}
	
	public void setOrigin(String origin) {
		this.from = origin;
	}

	public void setDestination(String destination) {
		this.to = destination;
	}

	public void setCodePost(int codePost) {
		this.codePost = codePost;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public void setRec(Recommandation rec) {
		this.rec = rec;
	}

	public String toString() {
		return "Package [from= " + from + " / to= " + to + " / codePost= " + codePost + " / weight= " + weight
				+ " g / volume= " + volume + " m3 / recommandation= " + rec ;
	}
	
	public double tarifA() {
		
		double res = 0.5;
		
		if(this.getRec().equals(Recommandation.R1)) {
			res += 0.5; 
			}
			else {
				if (this.getRec().equals(Recommandation.R2)) {
				res += 1;
													}
				}
		return res;
	}
	
	abstract public double tarifR() ;
	
	
	
	
	
}
