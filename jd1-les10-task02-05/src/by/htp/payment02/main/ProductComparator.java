package by.htp.payment02.main;

import java.util.Comparator;

import by.htp.payment02.main.Payment.Product;

public class ProductComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		String str1 = o1.getTitle();
		String str2 = o2.getTitle();

		if (str1.compareTo(str2) > 0) {
			return 1;
		} else if (str1.compareTo(str2) < 0) {
			return -1;
		}

		return 0;
	}

}
