package by.htp.bouquet.bean;

public class WildFlower extends Flower {

	private boolean isRare;

	public WildFlower() {

	}

	public WildFlower(String title, String color, int price, boolean isRare) {
		super(title, color, price);
		this.isRare = isRare;
	}

	public boolean isRare() {
		return isRare;
	}

	public void setRare(boolean isRare) {
		this.isRare = isRare;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isRare ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WildFlower other = (WildFlower) obj;
		if (isRare != other.isRare)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "WildFlower [isRare=" + isRare + "]";
	}
	

}
