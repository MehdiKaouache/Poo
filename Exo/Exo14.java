import java.util.ArrayList;

public class Exo14{
	public static void main(String[] args){
		ArrayList<Integer> premiereListe = new ArrayList<>();
		ArrayList<Integer> deuxiemeListe = new ArrayList<>();
		
		premiereListe.add(1);
		premiereListe.add(2);
		premiereListe.add(3);
		
		deuxiemeListe.add(4);
		deuxiemeListe.add(5);
		deuxiemeListe.add(6);
		
		System.out.println(premiereListe);
		System.out.println(deuxiemeListe);
		
		deuxiemeListe.add(0, premiereListe.get(0));
		deuxiemeListe.add(1, premiereListe.get(1));
		deuxiemeListe.add(2, premiereListe.get(2));
		
	
		System.out.println("Tableau fusionné: " + deuxiemeListe);
		
	}
}