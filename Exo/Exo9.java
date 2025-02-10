public class Exo9{
	public static void main (String[] args){
		int[] tableau = new int[5];
		int somme = 0;
		float moyenne = 0;
		
		for (int i = 0; i < tableau.length; i++){
			tableau[i] = (int) (Math.random() * 101);
			System.out.println(tableau[i]);
			somme += tableau[i];
			moyenne = somme /tableau.length;
		}
		System.out.println("La somme est: " + somme);
		System.out.print("La moyenne des éléments du tableau : " + moyenne);
	}
}