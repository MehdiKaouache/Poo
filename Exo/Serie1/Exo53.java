import java.util.ArrayList;

public class Exo53{
	public static void main(String[] args){
		ArrayList<Integer> liste = new ArrayList<>();
		
		int somme = 0;
		double moyenne;
		
		liste.add(80);
		somme += liste.get(0);
		
		liste.add(90);
		somme += liste.get(1);
		
		liste.add(71);
		somme += liste.get(2);
		
		liste.add(82);
		somme += liste.get(3);
		
		liste.add(100);
		somme += liste.get(4);
		
		moyenne = (double) somme / liste.size();
		
		System.out.println("La moyenne des notes est : " + moyenne);
	}
}