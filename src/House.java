
public class House {

	private String buildDate;
	private int price;
	private int sqFt;
	
	public House() {
		this.buildDate = "";
		this.price = 0;
		this.sqFt = 0;
	}
	
	public House(String date, int price) {
		this.buildDate = date;
		this.price = price;
		this.sqFt = 0;
	}
	
	public House(String date, int price, int sqFt) {
		this.buildDate = date;
		this.price = price;
		this.sqFt = sqFt;
	}

	public String getBuildDate() {
		return buildDate;
	}

	public void setBuildDate(String buildDate) {
		this.buildDate = buildDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSqFt() {
		return sqFt;
	}

	public void setSqFt(int sqFt) {
		this.sqFt = sqFt;
	}
	
	public boolean affordable() {
		if(this.price < 200000) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String description() {
		return ("This house was built in " + this.buildDate + ", and sits on " + this.sqFt + " square feet.  The house is valued at $" + this.price + ".");
	}
}
