

public class Tratamentos {
	public static void main(String[] args) {
		System.out.println("====================================");
		System.out.println("Funções para tratamentos de Strings:");
		System.out.println("====================================");		
		String originalString = "abcde FGHIJ ABC abc DEFG    ";
		System.out.println("String original: - " + originalString + "-");
		System.out.println("");
		
		String minusculaString = originalString.toLowerCase();
		String maisculaString = originalString.toUpperCase();
		String espacoString = originalString.trim();
		String recorteString = originalString.substring(2);
		String recorteInitFinalString = originalString.substring(2, 9);
		String susbtituiString = originalString.replace('a', 'x');
		String sustituirStringMaiorString = originalString.replace("abc", "xy");
		String[] vectStrings = originalString.split(" ");
		int posicaoString = originalString.indexOf("bc");
		int posicaoFinalString = originalString.lastIndexOf("bc");
		System.out.println("vect 0: " + vectStrings[0]);
		System.out.println("vect 1: " + vectStrings[1]);
		System.out.println("vect 2: " + vectStrings[2]);
		System.out.println("vect 3: " + vectStrings[3]);
		System.out.println("vect 4: " + vectStrings[4]);
		
		
		
		System.out.println("String minuscula: - " + minusculaString + "-");
		System.out.println("String maiuscua: - " + maisculaString + "-");
		System.out.println("String espaços: - " + espacoString + "-");
		System.out.println("String recorte 2: - " + recorteString + "-");
		System.out.println("String recorte initFinal 2/9: - " + recorteInitFinalString + "-");
		System.out.println("String replace a , x: - " + susbtituiString + "-");
		System.out.println("String replace abc , xy: - " + sustituirStringMaiorString + "-");
		System.out.println("Index of 'bc': - " + posicaoString + "-");
		System.out.println("last index 'bc': - " + posicaoFinalString);
		
		
	}
}
