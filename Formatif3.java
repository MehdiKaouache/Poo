import java.util.ArrayList;

public class Formatif3{
	public static void main(String[]args){
		ArrayList<Integer> liste = new ArrayList<>();
		
		for(int i = 0; i < 10; i++){
			int nbrAleatoire = (int) (Math.random() * (100 - 10) + 10);
			liste.add(nbrAleatoire);
		}
		System.out.print(liste);
		//Collection.sort(liste);
	}
}