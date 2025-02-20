import java.util.ArrayList;

public class Question1{
	public static void main(String[] args){
		ArrayList<Integer> nombre = new ArrayList<>();
		
		int nbrEntree = Integer.parseInt(args[0]);
		
		for (int i = 0; i < nbrEntree; i++){
			int nbrAleatoire = (int) (Math.random() * 101);
			nombre.add(nbrAleatoire);
		}
		System.out.print(nombre);
	}
}
