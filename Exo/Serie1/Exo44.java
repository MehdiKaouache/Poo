import java.util.ArrayList;

public class Exo44{
	public static void main (String[] args){
		ArrayList<Character> liste = new ArrayList<>();
		char lettre = 'a';
		
		
		for (int i = 0; i < 26; i++){
			char plus = (char) (lettre + i);
			liste.add(plus);
		}
		
		System.out.println(liste);
	}
}