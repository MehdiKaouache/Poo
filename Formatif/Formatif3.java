import java.util.ArrayList;
import java.util.Collections;

public class Formatif3{
	public static void main(String[]args){
		ArrayList<Integer> liste = new ArrayList<>(10);
		
		for(int i = 0; i < 10; i++){
			int nbrAleatoire = (int) (Math.random() * 101);
			liste.add(nbrAleatoire);
		}
		System.out.println("Non trié: " + liste);
		Collections.sort(liste);
		System.out.print("Trié: " + liste);
	}
}