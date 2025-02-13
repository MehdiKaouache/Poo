public class Exo17{
	public static void main (String [] args){
		char[] voyelle = {'a', 'e', 'i', 'o', 'u', 'y'};
		char[] lettre = {'a', 'b', 'e', 'f', 'i', 'o', 'u', 'p'};
		
		int count = 0;
		
		for (int i = 0; i < lettre.length; i++){
			if (lettre.equals(v)){
				count++;
			}
		}
		
		System.out.println("Il y a " + count + " voyelles dans le tableau");
		
	}
}