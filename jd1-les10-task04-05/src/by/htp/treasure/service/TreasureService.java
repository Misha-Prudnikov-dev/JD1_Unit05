package by.htp.treasure.service;

import java.util.List;
import by.htp.treasure.bean.Treasure;

public interface TreasureService {

	Treasure getMostExpensiveTreasure() throws ServiceException;

	List<Treasure> takeTreasureGivenSum(int price) throws ServiceException;

	List<Treasure> getTreasures() throws ServiceException;

}
