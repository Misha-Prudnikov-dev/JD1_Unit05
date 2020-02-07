package by.htp.payment02.main;

import java.util.Collections;

import by.htp.payment02.main.Payment.Product;

public class PaymentLogic {

	public int getSumProduct(Payment p) {

		int sum = 0;

		for (Product pr : p.getProducts()) {

			sum = sum + pr.getPrice();
		}
		return sum;
	}

	public void sortTitle(Payment p) {

		Collections.sort(p.getProducts(), new ProductComparator());

	}
}
