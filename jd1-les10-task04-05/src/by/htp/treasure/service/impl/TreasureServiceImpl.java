package by.htp.treasure.service.impl;

import java.util.ArrayList;
import java.util.List;
import by.htp.treasure.bean.Treasure;
import by.htp.treasure.dao.DAOException;
import by.htp.treasure.dao.DAOProvider;
import by.htp.treasure.dao.TreasureDao;
import by.htp.treasure.service.ServiceException;
import by.htp.treasure.service.TreasureService;
import by.htp.treasure.service.util.Validator;

public class TreasureServiceImpl implements TreasureService {

	private DAOProvider daoProvider = DAOProvider.getInstance();

	@Override
	public Treasure getMostExpensiveTreasure() throws ServiceException {

		List<Treasure> treasures = getTreasures();

		Treasure expensiveTreasure = treasures.get(0);

		for (Treasure t : treasures) {

			if (expensiveTreasure.getPrice() < t.getPrice()) {
				expensiveTreasure = t;
			}

		}
		return expensiveTreasure;
	}

	@Override
	public List<Treasure> takeTreasureGivenSum(int price) throws ServiceException {

		List<Treasure> result = new ArrayList<Treasure>();
		List<Treasure> treasures = getTreasures();
		
		if(!Validator.sumValid(price)) {
			
			throw new ServiceException("!!!");
		}

		for (Treasure t : treasures) {

			if (t.getPrice() <= price) {

				price = price - t.getPrice();

				result.add(t);

			}
		}

		return result;
	}

	@Override
	public List<Treasure> getTreasures() throws ServiceException {

		TreasureDao treasureDao = daoProvider.getTreasureDao();

		List<Treasure> treasures;

		try {
			treasures = treasureDao.getCave().getTreasures();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		return treasures;
	}

}
