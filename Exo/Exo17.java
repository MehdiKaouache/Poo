public class Exo17{
	public static void main (String [] args){
		char[] tableau = {'a', 'b', 'e', 'f', 'i', 'o', 'u', 'p'};
		int count = 0;
		
		for (int i = 0; i < tableau.length; i++) {
			if (tableau[i] == 'a' | tableau[i]  == 'e' | tableau[i] == 'i' | tableau[i] == 'o' | tableau[i] == 'u') {
				count ++;
			}
		}
		System.out.println("Il y a " + count + " voyelles dans le tableau");
	}
}