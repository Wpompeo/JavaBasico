package application;

public class forLacoEach {

	public static void main(String[] args) {

		String[] vect = new String[] { "Wagner", "Tatiana", "Santiago" };

		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}

		System.out.println("-----------------");

		for (String objString : vect) {
			System.out.println(objString);
		}

	}

}
