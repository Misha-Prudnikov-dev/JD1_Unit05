package by.htp.treasure.service;

import by.htp.treasure.service.impl.TreasureServiceImpl;

public class ServiceProvider {

	private static final ServiceProvider instance = new ServiceProvider();

	public static ServiceProvider getInstance() {
		return instance;
	}

	private ServiceProvider() {
	}

	private TreasureService treasureService = new TreasureServiceImpl();

	public TreasureService getTreasureService() {
		return treasureService;
	}
}
