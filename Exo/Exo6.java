public class Exo6{
	public static void main (String[] args) {
		boolean estEgal = 44 == 66;
		System.out.println(estEgal);
		
		boolean estPasEgal = 44 != 66;
		System.out.println(estPasEgal);
		
		boolean estPlusGrand = 44 > 66;
		System.out.println(estPlusGrand);
		
		boolean estPlusPetit = 44 <= 66;
		System.out.println(estPlusPetit);
		
		boolean estSante = true;
		boolean estAbordable = false;
		
		boolean estDeuxTrue = (estSante & estAbordable);
		System.out.println(estDeuxTrue);
		
		boolean estTrueFalse = (!estSante & estAbordable);
		System.out.println(estTrueFalse);
		
		boolean estUnTrue = (estSante | estAbordable);
		System.out.println(estUnTrue);
		}
}