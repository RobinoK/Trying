import java.util.Scanner;



public class Factorial {
    private static Scanner sc = new Scanner(System.in);
    private long a = 0;

    public static void main(String[]args){
        long start = System.nanoTime();
        System.out.println("Zadej cislo k faktorialu");
        int x = sc.nextInt();
         long a = x;

        for(int i = 1; i <= x-1; i++){
            long g = x-(i);
            System.out.println("G je: "+g);
            a *=g;
            System.out.println("A je: "+a);
        }
       System.out.println("Faktorial je: "+a);

       long end = System.nanoTime();
        long cas = (end- start)/1000000;

        System.out.println("metoda trva: "+cas+ " ms");
    }


}


