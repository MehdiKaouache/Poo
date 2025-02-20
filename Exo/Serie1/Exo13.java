import java.util.ArrayList;

public class Exo13{
	public static void main (String[] args){
		ArrayList<Integer> liste = new ArrayList<>();
	
		for (int i = 0; i < 10; i++){
			int nbrAleatoire = (int) (Math.random() * 11);
			
			boolean nbrEstPasLa = !liste.contains(nbrAleatoire);
			
			if (nbrEstPasLa){
				liste.add(nbrAleatoire);
			}
		}
		System.out.println(liste);
		
	}
}
/*		
for (int j = 0; j < liste.size(); j++){
	if (liste.get(j).equals(nbrAleatoire)){
		liste.remove(liste.get(j));
	}
}*/