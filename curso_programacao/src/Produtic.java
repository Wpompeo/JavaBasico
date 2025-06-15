import java.util.Locale;

public class Produtic {

	public static void main(String[] args) {

		String productOne = "Computer";
		String productTwo = "Office desk";
		
		int age = 30;
		int code = 52290;
		char gender = 'F';
		
		double priceOne = 2100.0;
		double priceTwo = 650.50;
		double measure = 53.234567;
		
		System.out.println("Product cost");
		System.out.printf("%s , which price is $ %.2f%n", productOne, priceOne);
		System.out.printf("%s , which price is $ %.2f%n", productTwo, priceTwo);
		System.out.println(" ");
		System.out.println("Record: " + age + "years old, code " + code + "and gender: " + gender);
		System.out.println(" ");
		System.out.printf("Measue with eigth decimal places: " + measure);
		System.out.println("");
		System.out.printf("Rouded (three decimal places: %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
		
	}

}
	