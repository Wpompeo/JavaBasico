import java.util.Locale;

public class Main {
	
	
	public static void main(String[] args) {
		
		int valueOne = 1;
		double valueTwo = 5.0;
		
		double soma = valueOne * valueTwo;
		
		System.out.println(soma);
		System.out.printf("%.2f%n",  soma);
		Locale.setDefault(Locale.US); // define impressão padrao americano. Usa . e não ,
		System.out.printf("%.2f%n",  soma);

	}

}
