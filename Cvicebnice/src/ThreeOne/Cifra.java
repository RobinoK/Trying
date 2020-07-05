package ThreeOne;
import java.util.Scanner;

public class Cifra {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[]args){
        System.out.println("Zadej cislo, kde se budou scitat cifry");
        int cislo = sc.nextInt();

        int soucet = 0;
        String slovo = String.valueOf(cislo);

        for(int i = 0; i< slovo.length(); i++){
            char x = slovo.charAt(i);
            int znak = Integer.parseInt(String.valueOf(x));
            soucet +=znak;
        }
        System.out.println("Soucet je: "+soucet);
    }
}
