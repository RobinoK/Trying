package ThreeOne;
import java.util.Scanner;

public class SoucetNprirozenych {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[]args){
        System.out.println("Zadej cislo do kterych se budou sctitat cisla");
        int cislo = sc.nextInt();
        int x = 0;

        for(int i = 0; i<=cislo; i++){
            x +=i;
        }
        System.out.println("soucet je: "+x);

        int w = soucet(cislo);
        System.out.println("soucet2 je: "+w);

        int q = soucet(cislo);
        System.out.println("soucet3 je: "+q);
    }

    private static int soucet(int a){
        if(a==0)return 0;
        else if(a==1)return 1;
        else return a + soucet(a-1);


    }

    public static int scitani(int z){
        int soucet = 0;
        do{
             soucet +=z;
            z--;

        }
        while(z!=0);
        return soucet;
    }
}
