package by.htp.bouquet.bean;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {

	private Packaging packaging;
	private List<Flower> flowers;

	public Bouquet() {
		packaging = new Packaging();
		flowers = new ArrayList<Flower>();
	}

	public Bouquet(Packaging packaging, List<Flower> flowers) {
		this.packaging = packaging;
		this.flowers = flowers;
	}

	public Packaging getPackaging() {
		return packaging;
	}

	public void setPackaging(Packaging packaging) {
		this.packaging = packaging;
	}

	public List<Flower> getFlowers() {
		return flowers;
	}

	public void setFlowers(List<Flower> flowers) {
		this.flowers = flowers;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flowers == null) ? 0 : flowers.hashCode());
		result = prime * result + ((packaging == null) ? 0 : packaging.hashCode());
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
		Bouquet other = (Bouquet) obj;
		if (flowers == null) {
			if (other.flowers != null)
				return false;
		} else if (!flowers.equals(other.flowers))
			return false;
		if (packaging == null) {
			if (other.packaging != null)
				return false;
		} else if (!packaging.equals(other.packaging))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bouquet [packaging=" + packaging + ", flowers=" + flowers + "]";
	}

}
