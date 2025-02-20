public class Test {
    public static void main (String[] args) {
        int[] tableau = {8, 5, 6, 3, 2, 4};

        for (int i = 0; i < tableau.length / 2; i++) {
            int mem = tableau[i];
            tableau[i] = tableau[tableau.length - i - 1];
            tableau[tableau.length - i - 1] = mem;
        }

        // Affichage du tableau inversé
        for (int num : tableau) {
            System.out.print(num + " ");
        }
    }
}
