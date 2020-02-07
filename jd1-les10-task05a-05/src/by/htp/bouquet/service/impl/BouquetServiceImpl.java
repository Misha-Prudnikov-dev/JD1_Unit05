package by.htp.bouquet.service.impl;

import java.util.ArrayList;
import java.util.List;

import by.htp.bouquet.bean.Bouquet;
import by.htp.bouquet.bean.Flower;
import by.htp.bouquet.bean.GardenFlower;
import by.htp.bouquet.bean.Packaging;
import by.htp.bouquet.bean.WildFlower;
import by.htp.bouquet.service.BouquetService;
import by.htp.bouquet.service.ServiceException;
import by.htp.bouquet.service.util.Validator;

public class BouquetServiceImpl implements BouquetService {

	@Override
	public Bouquet createBouquet() {

		Bouquet bouquet = new Bouquet();

		return bouquet;
	}

	@Override
	public int getCostBouquet(Bouquet bouquet) {

		int costBouquet = 0;

		for (Flower f : bouquet.getFlowers()) {

			costBouquet = costBouquet + f.getPrice();
		}
		costBouquet = costBouquet + bouquet.getPackaging().getPrice();

		return costBouquet;
	}

	@Override
	public void addPackaging(Bouquet bouquet, String request) throws ServiceException {

		if (!Validator.isPackagingValid(request)) {

			throw new ServiceException("NO");
		}

		Packaging packaging;

		switch (request) {

		case "box":

			packaging = new Packaging("box", 3);

			bouquet.setPackaging(packaging);

			break;

		case "basket":

			packaging = new Packaging("basket", 3);
			bouquet.setPackaging(packaging);

			break;

		case "wrapper":

			packaging = new Packaging("wrapper", 1);
			bouquet.setPackaging(packaging);

			break;
		}
	}

	@Override
	public void addGardenFlower(Bouquet bouquet, String request) throws ServiceException {
		if (!Validator.isFlowerValid(request)) {

			throw new ServiceException("NO");
		}

		GardenFlower gardenFlower;

		switch (request) {

		case "rose":

			gardenFlower = new GardenFlower("rose", "pink", 3, true);
			bouquet.getFlowers().add(gardenFlower);
			break;

		case "tulip":

			gardenFlower = new GardenFlower("tulip", "red", 2, false);
			bouquet.getFlowers().add(gardenFlower);

			break;

		case "iris":

			gardenFlower = new GardenFlower("iris", "blue", 2, false);
			bouquet.getFlowers().add(gardenFlower);
			break;

		case "pion":

			gardenFlower = new GardenFlower("pion", "pink", 2, false);
			bouquet.getFlowers().add(gardenFlower);

			break;

		case "dahila":

			gardenFlower = new GardenFlower("dahila", "red", 3, true);
			bouquet.getFlowers().add(gardenFlower);
			break;
		}

	}

	@Override
	public void addWildFlower(Bouquet bouquet, String request) throws ServiceException {

		if (!Validator.isFlowerValid(request)) {

			throw new ServiceException("NO");
		}

		WildFlower wildFlower;

		switch (request) {

		case "calendula":

			wildFlower = new WildFlower("calendula", "orange", 1, false);
			bouquet.getFlowers().add(wildFlower);
			break;

		case "poppy":

			wildFlower = new WildFlower("poppy", "red", 4, true);
			bouquet.getFlowers().add(wildFlower);

			break;

		case "sunflower":

			wildFlower = new WildFlower("sunflower", "yellow", 2, false);
			bouquet.getFlowers().add(wildFlower);

			break;

		case "knapweed":

			wildFlower = new WildFlower("knapweed", "blue", 4, true);
			bouquet.getFlowers().add(wildFlower);

			break;

		case "chamomile":

			wildFlower = new WildFlower("chamomile", "white", 2, false);
			bouquet.getFlowers().add(wildFlower);

			break;

		}
	}

}
