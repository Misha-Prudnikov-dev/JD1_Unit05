package by.htp.bouquet.service;

import by.htp.bouquet.bean.Bouquet;

public interface BouquetService {

	Bouquet createBouquet();

	void addPackaging(Bouquet bouquet, String request) throws ServiceException;

	void addGardenFlower(Bouquet bouquet, String request) throws ServiceException;

	void addWildFlower(Bouquet bouquet, String request) throws ServiceException;

	int getCostBouquet(Bouquet bouquet);

}
