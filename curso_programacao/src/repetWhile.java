import java.util.Scanner;

public class repetWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x;

		System.out.println("Informe um número qualquer:");
		x = sc.nextInt();

		int soma = 0;
		while (x != 0) {
			soma += x;

			if (x != 0) {
				System.out.println("Informe um número qualquer:");
			}

			x = sc.nextInt();
		}

		sc.close();
		System.out.println("A soma dos números digitados é: " + soma);
	}
}
