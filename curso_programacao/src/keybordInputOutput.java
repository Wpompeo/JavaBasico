import java.util.Scanner;

public class keybordInputOutput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu nome:");
		
		String x;
		x = sc.nextLine(); //ler string
		System.out.println("Voce digitou: " + x);
		
		sc.close();
		

	}

}
