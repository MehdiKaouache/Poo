public class Exo52{
	public static void main (String[] args){
		double valeurDouble = 10.5;
		int valeurInt = 3;
		
		double multiplicationD = (double) valeurInt * valeurDouble;
		System.out.println("Résultat de la multiplication (double) : " + multiplicationD);
		
		int multiplicationI =  (int) valeurDouble * valeurInt;
		System.out.println("Résultat après conversion en int : " + multiplicationI);
	}
}