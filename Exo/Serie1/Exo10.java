import java.util.Collections;
import java.util.ArrayList;

public class Exo10{
	public static void main (String[] args){
		ArrayList<Integer> liste = new ArrayList<>();
		
		for (int i = 0; i < 5; i++){
			int nbrAleatoire = (int) (Math.random() * 101);
			liste.add(nbrAleatoire);
		}
		System.out.println(liste);
		System.out.println("Le maximum est: " + Collections.max(liste));
		System.out.println("Le minimum est: " + Collections.min(liste));
	}
}