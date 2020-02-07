package by.htp.treasure.main;

import java.util.List;

import by.htp.treasure.bean.Treasure;
import by.htp.treasure.service.ServiceException;
import by.htp.treasure.service.ServiceProvider;
import by.htp.treasure.service.TreasureService;

/*Задача 4.
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Приложение должно быть объектно-, а не процедурно-ориентированным.
• Каждый класс должен иметь отражающее смысл название и информативный состав.
• Наследование должно применяться только тогда, когда это имеет смысл.
• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
• Классы должны быть грамотно разложены по пакетам.
• Консольное меню должно быть минимальным.
• Для хранения данных можно использовать файлы.
Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
выбора сокровищ на заданную сумму.*/

public class Main {

	public static void main(String[] args) {

		ServiceProvider serviceProvider = ServiceProvider.getInstance();
		TreasureService treasureService = serviceProvider.getTreasureService();

		Treasure expensiveTreasure = null;
		List<Treasure> treasures = null;
		try {

			expensiveTreasure = treasureService.getMostExpensiveTreasure();
			treasures = treasureService.getTreasures();

			print(treasures);

			treasures = treasureService.takeTreasureGivenSum(400);

			print(treasures);

		} catch (ServiceException e) {

			System.out.println("!!!!!!!!!" + e);
			e.printStackTrace();
		}

		print(expensiveTreasure);
	}

	public static void print(Treasure expensiveTreasure) {

		System.out.println(expensiveTreasure.getTitle() + " " + expensiveTreasure.getPrice() + " "
				+ expensiveTreasure.getWeight());

	}

	public static void print(List<Treasure> treasures) {

		for (Treasure t : treasures) {
			System.out.println(t.getTitle() + " " + t.getPrice() + " " + t.getWeight());
		}
		System.out.println();
	}
}
