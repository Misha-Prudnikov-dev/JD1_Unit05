package by.htp.bouquet.service;

import by.htp.bouquet.service.impl.BouquetServiceImpl;

public class ServiceProvider {

	private static final ServiceProvider instance = new ServiceProvider();

	public static ServiceProvider getInstance() {
		return instance;
	}

	private ServiceProvider() {
	}

	private BouquetService bouquetService = new BouquetServiceImpl();

	public BouquetService getBouquetService() {
		return bouquetService;
	}
}
