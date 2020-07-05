package ThreeOne;

import java.util.Scanner;



public class factorial {
    private static Scanner sc = new Scanner(System.in);
    private long a = 0;

    public static void main(String[]args){
        System.out.println("Zadej cislo k faktorialu");
        int x = sc.nextInt();
        long a = x;

        for(int i = 1; i <= x-1; i++){
            long g = x-i;
            a *=g;
        }
        System.out.println("Faktorial je: "+a);

        int b = fakt(x);
        System.out.println("Faktorial2 je: "+b);

    }

    private static int fakt(int x){
        if(x==0)return 0;
        else if(x==1)return 1;
        else return x * fakt(x-1);


    }


}

