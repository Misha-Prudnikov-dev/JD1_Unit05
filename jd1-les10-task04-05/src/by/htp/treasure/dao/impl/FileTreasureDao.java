package by.htp.treasure.dao.impl;

import java.io.FileReader;
import java.io.IOException;
import by.htp.treasure.bean.Cave;
import by.htp.treasure.bean.Treasure;
import by.htp.treasure.dao.DAOException;
import by.htp.treasure.dao.TreasureDao;
import java.io.BufferedReader;

public class FileTreasureDao implements TreasureDao {

	final String SOURCE = "resources\\treasures.txt";

	@Override
	public Cave getCave() throws DAOException {

		Cave cave = new Cave();

		try (BufferedReader br = new BufferedReader(new FileReader(SOURCE))) {

			while (br.ready()) {

				String line = br.readLine();
				String[] params = line.split(" ");

				String title = params[0];
				int price = Integer.parseInt(params[1]);
				int weight = Integer.parseInt(params[2]);

				cave.getTreasures().add(new Treasure(title, price, weight));

			}

		} catch (IOException e) {
			throw new DAOException(e);
		}

		return cave;
	}

}
