public class Multiples {
    private static int x = 1000;
    private static int pocet = 0;
    public static void main(String[]args){
        for(int i = 0; i < x; i++) {
            if (i % 3 == 0 || i % 5 == 0 ) {
                pocet = pocet+i;
            }
        }
        System.out.println("Soucet je: "+pocet);

    }
}
