import java.util.ArrayList;
import java.util.Collections;

public class Exo51{
	public static void main (String[] args){
		ArrayList<Integer> liste = new ArrayList<>();
		
		liste.add(50);
		liste.add(30);
		liste.add(20);
		liste.add(40);
		liste.add(10);
		
		System.out.println("ArrayList avant le tri : " + liste);
		
		Collections.sort(liste);
		
		System.out.println("ArrayList après le tri : " + liste);
	}
}