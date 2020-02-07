package by.htp.bouquet.bean;

public class Packaging {

	private int price;
	private String title;

	public Packaging() {

	}

	public Packaging(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
}
