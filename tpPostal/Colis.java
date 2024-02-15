package tpPostal;

public class Colis extends ObjetPostal {
	
	//Attributes
	private String content;
	private double price;
	
	//Constructors
	
	public Colis() {
		
	}
	
	public Colis(String origin, String destination, int codePost, double weight, double volume,
			Recommandation rec, String conetnu, double prix) {
		super(origin, destination, codePost, weight, volume, rec);
		this.setPrice(prix);
		this.setContent(conetnu);
	}

	public String getContent() {
		return content;
	}

	public double getPrice() {
		return price;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toStirngColis() {
		return super.toString()+" / Content= "+this.content+" / price= "+this.price+" € ]";
	}
	
	public double tarifA() {
		double res = super.tarifA() + 1.5;
		
		if(this.getWeight() > 125) {
			res += 3;
		}
		return res;
		
	}

	public double tarifR() {
		if(this.getRec().equals(Recommandation.R1)) {
			return (this.tarifA()*10/100);
			}
		if (this.getRec().equals(Recommandation.R2)) {
			return (this.tarifA()*50/100);
			}
		return 0;
	}
	
}
