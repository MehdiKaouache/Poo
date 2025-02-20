import java.util.ArrayList;

public class Exo11{
	public static void main(String[] args){
		ArrayList<Integer> liste = new ArrayList<>();
		ArrayList<Integer> listeInverse = new ArrayList<>();
		
		for (int i = 0; i < 5; i++){
			int nbrAleatoire = (int) (Math.random() * 101);
			liste.add(nbrAleatoire);
			
		}
		listeInverse.add(liste.get(4));
		listeInverse.add(liste.get(3));
		listeInverse.add(liste.get(2));
		listeInverse.add(liste.get(1));
		listeInverse.add(liste.get(0));
		System.out.println(liste);
		System.out.println(listeInverse);
	}
}