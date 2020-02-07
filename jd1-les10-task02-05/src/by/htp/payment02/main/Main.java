package by.htp.payment02.main;

import by.htp.payment02.main.Payment.Product;

/*
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из 
 * нескольких товаров.
 */

public class Main {

	public static void main(String[] args) {

		Payment payment = new Payment();

		payment.add("Java", 45);
		payment.add("C++", 15);
		payment.add("C#", 37);
		payment.add("CSS", 21);

		print(payment);

		PaymentLogic pL = new PaymentLogic();

		int sum = pL.getSumProduct(payment);

		printSum(sum);

		pL.sortTitle(payment);

		print(payment);

	}

	public static void print(Payment payment) {

		for (Product pr : payment.getProducts()) {

			System.out.println(pr.getTitle() + "  " + pr.getPrice());
		}
		System.out.println();
	}

	public static void printSum(int sum) {

		System.out.println("Sum = " + sum + "\n");
	}
}
