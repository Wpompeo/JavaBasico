import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class ContollerPensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rent[] vect = new Rent[10];

		System.out.println("***********************************************");
		System.out.println("Bem vindo a reserva de quartos do pensionato.");
		System.out.println();
		System.out.println("Informe quantos quartos você deseja alugar: ");
		int numQuartos = sc.nextInt();

		if (numQuartos > vect.length) {
			System.out.println("Atenção! o número de quartos informado, é maior que o permitido: " + vect.length);
		} else {
			System.out.printf("Certo, você informou %d quartos.", numQuartos);
			System.out.println("Vamos informar os dados do hospedes:");
			System.out.println();

			for (int i = 1; i <= numQuartos; i++) {
				System.out.println();
				System.out.println("Quarto #" + i + ":");
				System.out.println("Informe o nome do hospede: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Informe o e-mail: ");
				String mail = sc.next();
				System.out.println("Informe o número do quarto: ");
				int numQuarto = sc.nextInt();

				vect[numQuarto] = new Rent(name, mail);
			}
			System.out.println();
			System.out.println("Quartos reservados:");
			for (int i = 0; i < 10; i++) {
				if (vect[i] != null) {
					System.out.println(i + ": " + vect[i]);
				}
			}

		}

		sc.close();

	}
}
