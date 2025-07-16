package entities;

public class CurrencyConverter {

	public double valueDolar;
	public double valueBuy;

	public static double cotationDolar(double valueDolar, double valueBuy) {

		double taxaIof = 0.06;
		return ((valueBuy * taxaIof) + valueBuy) * valueDolar;

	}

}
