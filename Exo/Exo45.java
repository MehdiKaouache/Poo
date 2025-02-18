import java.util.ArrayList;

public class Exo45{
	public static void main (String[] args){
		ArrayList<Character> liste = new ArrayList<>();
		
		liste.add('a');
		liste.add('b');
		liste.add('c');
		liste.add('d');
		liste.add('e');
		System.out.println(liste);
		
		for (int i = 0; i < liste.size(); i++){
			liste.add(0, liste.get(i));
		}
		System.out.println("Tableau inversé: " + liste);
	}
}