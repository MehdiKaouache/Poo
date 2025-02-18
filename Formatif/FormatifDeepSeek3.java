import java.util.ArrayList;
import java.util.Collections;

public class FormatifDeepSeek3{
	public static void main(String[] args){
		ArrayList<Integer> liste = new ArrayList<>();
		float moyenne;
		int somme = 0;
		
		for (int i = 0; i < 12; i++){
			int nbrAleatoire = (int) (Math.random() * 101);
			liste.add(nbrAleatoire);
			somme += nbrAleatoire;
			
		}
		moyenne = somme / 12;
		System.out.println(liste);
		System.out.println("Le plus grand nombre est: " + Collections.max(liste));
		System.out.println("Le moyenne des nombres est: " + moyenne);
	}
}