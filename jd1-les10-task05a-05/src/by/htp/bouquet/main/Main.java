package by.htp.bouquet.main;

import java.util.Scanner;

import by.htp.bouquet.bean.Bouquet;
import by.htp.bouquet.bean.Flower;
import by.htp.bouquet.service.BouquetService;
import by.htp.bouquet.service.ServiceException;
import by.htp.bouquet.service.ServiceProvider;

/*Задача 5.
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Корректно спроектируйте и реализуйте предметную область задачи.
• Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов
проектирования.
• Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
• для проверки корректности переданных данных можно применить регулярные выражения.
• Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
• Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
Вариант A. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
(объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы
и упаковка.*/

public class Main {

	public static void main(String[] args) {

		ServiceProvider serviceProvider = ServiceProvider.getInstance();

		BouquetService bouquetService = serviceProvider.getBouquetService();
		Bouquet bouquet = bouquetService.createBouquet();

		Scanner sc = new Scanner(System.in);

		String request = "1";
		try {

			while (true) {
				System.out.println("Выберите (1 - GardenFlower; 2 - WildFlower;) ");

				request = sc.nextLine();
				if (request.equals("1")) {

					while (!request.equals("0")) {

						System.out.println("Выберите цветок (iris , tulip , rose , pion, dahila.)");
						request = sc.nextLine();
						bouquetService.addGardenFlower(bouquet, request);

						System.out.println(" Для выхода нажмите 0 или 1 для продолжения");
						request = sc.nextLine();
					}
				}
				System.out.println(" Введите 2 если хотите добавить в букет полевые цветы ");
				request = sc.nextLine();

				if (request.equals("2")) {

					while (!request.equals("0")) {

						System.out.println(
								"Выберите цветок (poppy , knapweed , sunflower , chamomile, calendula. Для выхода нажмите 0)");
						request = sc.nextLine();

						bouquetService.addWildFlower(bouquet, request);

						System.out.println(" Для выхода нажмите 0 или 2 для продолжения");

						request = sc.nextLine();

					}
				}
				System.out.println("Выберите тип упаковки(basket, wrapper, box");
				request = sc.nextLine();
				if (request.equals("0")) {
					break;
				}
				bouquetService.addPackaging(bouquet, request);

				System.out.println("Для выхода нажмите 0 или 1 для продолжения");
				request = sc.nextLine();

				if (request.equals("0")) {
					break;
				}
			}
		} catch (ServiceException e) {
			System.out.println("!!!!!" + e);
			e.printStackTrace();
		}
		print(bouquet);

		System.out.println("Итог : " + bouquetService.getCostBouquet(bouquet) + "$");
	}

	public static void print(Bouquet b) {

		for (Flower f : b.getFlowers()) {

			System.out.println(f.getTitle() + " " + f.getPrice());
		}
		System.out.println(b.getPackaging().getTitle() + " " + b.getPackaging().getPrice());
	}
}
