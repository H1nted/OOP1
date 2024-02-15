package tpPostal;

public class Letter extends ObjetPostal {
	
	//Attributes
	private State urgency;
	
	//Constructors
	public Letter() {	
	}
	
	public Letter(String origin, String destination, int codePost, double weight, double volume,
			Recommandation rec, State urgency) {
		super(origin, destination, codePost, weight, volume, rec);
		this.setUrgency(urgency);
	}

	//Accessors
	public State getUrgency() {
		return urgency;
	}

	public void setUrgency(State urgency) {
		this.urgency = urgency;
	}
	
	public String toStringLettre() {
		return super.toString()+" / State= "+this.urgency+" ]";
	}

	public double tarifA() {
		
		double res = super.tarifA();
		
		
		
		 if(this.getUrgency().equals(State.Urgent)) {
			 res +=0.30;
		 }
		return res;
}
	
	public double tarifR() {
		
		if(this.getRec().equals(Recommandation.R1)) {
			return 1.5;
			}
		if (this.getRec().equals(Recommandation.R2)) {
			return 15;
			}
		return 0;
	}
	
}
