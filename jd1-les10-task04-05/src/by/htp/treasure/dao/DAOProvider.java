package by.htp.treasure.dao;

import by.htp.treasure.dao.impl.FileTreasureDao;

public class DAOProvider {

	private static final DAOProvider instance = new DAOProvider();

	public static DAOProvider getInstance() {
		return instance;

	}

	private DAOProvider() {
	}

	private TreasureDao treasureDao = new FileTreasureDao();

	public TreasureDao getTreasureDao() {
		return treasureDao;
	}
}
