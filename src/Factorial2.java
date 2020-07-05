import java.util.Scanner;
public class Factorial2 {
    private static Scanner sc = new Scanner(System.in);
    private static int a = 0;


    private static int factorial(int q){

       if(q == 0)return 0;
       else if(q == 1)return 1;
       else return q * factorial(q - 1);

    }


    public static void main(String[]args){
        long start = System.nanoTime();
        System.out.println("Zadej cislo k faktorialu");
        int x = sc.nextInt();
        int w = factorial(x);
        System.out.println("Faktorial je: "+w);
        long end = System.nanoTime();
        long cas = (end- start)/1000000;

        System.out.println("metoda trva: "+cas+ " ms");
    }
}


