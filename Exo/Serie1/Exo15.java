import java.util.ArrayList;

public class Exo15{
	public static void main(String[] args){
		ArrayList<Integer> liste = new ArrayList<>();
		int count = 0;
		
		for (int i = 0; i < 10; i++){
			int nbrAleatoire = (int) (Math.random() * 101);
			liste.add(nbrAleatoire);
			
			if (nbrAleatoire % 2 == 0){
				count++;
			} else{
				continue;
			}
		}
		System.out.println(liste);
		System.out.println("Il y a " + count + " nombres pairs dans ce tableau");
	}
}