package ThreeOne;
import java.util.Scanner;

public class Pozpatku {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[]args) {
        System.out.println("Zadej cislo, ktere se obrati");
        int cislo = sc.nextInt();

        String slovo = String.valueOf(cislo);
        String word = "";
        for(int i = slovo.length()-1; i>=0 ; i--){

            char x = slovo.charAt(i);
            word +=x;

        }

        System.out.println("Obracene je: "+word);

    }
}
