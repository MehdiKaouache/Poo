import java.util.ArrayList;

public class Exo8{
	public static void main (String[] args){
		ArrayList<Integer> liste = new ArrayList<>();
		
		for (int i = 0; i < 5; i++){
			int nbrAleatoire = (int) (Math.random() * 101);
			liste.add(nbrAleatoire);
		}
		System.out.print(liste);
	}
}