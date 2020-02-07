package by.htp.bouquet.bean;

public class GardenFlower extends Flower {

	private boolean isDifficultCare;

	public GardenFlower() {

	}

	public GardenFlower(String title, String color, int price, boolean isDifficultCare) {
		super(title, color, price);
		this.isDifficultCare = isDifficultCare;
	}

	public boolean isDifficultCare() {
		return isDifficultCare;
	}

	public void setDifficultCare(boolean isDifficultCare) {
		this.isDifficultCare = isDifficultCare;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isDifficultCare ? 1231 : 1237);
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
		GardenFlower other = (GardenFlower) obj;
		if (isDifficultCare != other.isDifficultCare)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GardenFlower [isDifficultCare=" + isDifficultCare + "]";
	}

}
