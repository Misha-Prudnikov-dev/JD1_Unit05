package by.htp.bouquet.service.util;

public class Validator {

	public static boolean isFlowerValid(String request) {

		if (request.equals("rose") || request.equals("tulip") || request.equals("iris") || request.equals("calendula")
				|| request.equals("poppy") || request.equals("sunflower") || request.equals("knapweed")
				|| request.equals("chamomile") || request.equals("pion") || request.equals("dahila")) {

			return true;
		}
		return false;
	}

	public static boolean isPackagingValid(String request) {

		if (request.equals("box") || request.equals("basket") || request.equals("wrapper")) {

			return true;
		}

		return false;
	}

}
