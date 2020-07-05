public class Matice {

    private static char znak = '*';
    private static int velikostMatice = 128;
    private static int pocet = 0;



    private static void vypocet(){
            for (int i = 1; i <= (velikostMatice * velikostMatice); i++) {
                System.out.print(znak);
                if (i % velikostMatice == 0)
                    System.out.print("\n");
            }
    }



    public static void main(String[] args) {
            vypocet();

    }

}







