import java.util.ArrayList;

public class Exo43{
	public static void main (String[] args){
		ArrayList<Character> liste = new ArrayList<>();
		
		liste.add('a');
		liste.add('b');
		liste.add('c');
		liste.add('a');
		liste.add('d');
		System.out.println(liste);
		
		for (int i = 0; i < liste.size(); i++){
			if (liste.get(i).equals('a')){
				liste.set(i, 'x');
			}
		}
		System.out.println(liste);
	}
}
