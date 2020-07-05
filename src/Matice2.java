public class Matice2 {


    private static char znak = '*';
    private static int velikostMatice = 4;
    private static int pocet = 0;


    private static void vypocet() {

        while (pocet < (velikostMatice * velikostMatice)) {
            if (pocet % velikostMatice == 0) {System.out.print("\n"); }
            pocet++;
            System.out.print(znak);

        }
    }

    public static void main(String[] args) {

            vypocet();

    }
}

