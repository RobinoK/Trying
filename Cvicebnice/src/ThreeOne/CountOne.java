package ThreeOne;
import java.util.Scanner;

public class CountOne {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[]args) {
        System.out.println("Zadej cislo, kde se budou scitat cifry");
        int cislo = sc.nextInt();

        String slovo = String.valueOf(cislo);

        int pocet = 0;

        for(int i = 0; i<slovo.length();i++){
            char x = slovo.charAt(i);
            if(x == '1'){
                pocet++;
            }

        }

        System.out.println("Pocet 1 je: "+pocet);

        }
    }
