import java.util.ArrayList;
import java.util.Collections;

public class Question3{
	public static void main(String[] args){
		ArrayList<Integer> liste = new ArrayList<>();
		
		for (int i = 0; i < 10; i++){
			int nbrAleatoire = (int) (Math.random() * 101);
			liste.add(nbrAleatoire);
		}
		System.out.println(liste);
		Collections.sort(liste);
		System.out.println(liste);
	}
}

