import java.util.ArrayList;

public class Exo9{
	public static void main (String[] args){
		ArrayList<Integer> liste = new ArrayList<>();
		int somme = 0;
		float moyenne = 0;
		
		for (int i = 0; i < 5; i++){
			int nbrAleatoire = (int) (Math.random() * 101);
			liste.add(nbrAleatoire);
			somme += nbrAleatoire;
			moyenne = somme / 5;
		}
		System.out.println(liste);
		System.out.println("La somme est: " + somme);
		System.out.print("La moyenne des éléments du tableau : " + moyenne);
	}
}