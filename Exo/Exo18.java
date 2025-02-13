import java.util.ArrayList;

public class Exo18{
	public static void main(String[] args){
		ArrayList<Integer> liste = new ArrayList<>();
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int count7 = 0;
		int count8 = 0;
		int count9 = 0;
		int count10 = 0;
		
		for (int i = 0; i < 10; i++){
			int nbrAleatoire = (int) (Math.random() * 11);
			liste.add(nbrAleatoire);
			
			if (nbrAleatoire == 0){
				count0++;
			}else if(nbrAleatoire == 1){
				count1++;
			} else if (nbrAleatoire == 2){
				count2++;
			}else if (nbrAleatoire == 3){
				count3++;
			}else if (nbrAleatoire == 4){
				count4++;
			}else if (nbrAleatoire == 5){
				count5++;
			}else if (nbrAleatoire == 6){
				count6++;
			}else if (nbrAleatoire == 7){
				count7++;
			}else if (nbrAleatoire == 8){
				count8++;
			}else if (nbrAleatoire == 9){
				count9++;
			}else {
				count10++;
			}	
			
		}
		System.out.println(liste);
		System.out.println("0 : " + count0);
		System.out.println("1 : " + count1);
		System.out.println("2 : " + count2);
		System.out.println("3 : " + count3);
		System.out.println("4 : " + count4);
		System.out.println("5 : " + count5);
		System.out.println("6 : " + count6);
		System.out.println("7 : " + count7);
		System.out.println("8 : " + count8);
		System.out.println("9 : " + count9);
		System.out.println("10: " + count10);
	}
}