import java.util.Scanner;
public class CountVowels     {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        System.out.print("Zadej slovo: ");
        String slovo = sc.nextLine();
        int pocet = 0;
        char []pole =  {'a', 'e', 'i', 'o', 'u', 'y'};
        char []druhe = new char[slovo.length()];
        int a= 0; int e= 0; int ii= 0; int o= 0; int y= 0; int u= 0;


        for(char c: pole){

            for(int i = 0; i<slovo.length(); i++){
                char x = slovo.charAt(i);
                if(x == c){
                    pocet++;
                    switch (x){
                        case 'a':a++;break;
                        case 'e':e++;break;
                        case 'i':ii++;break;
                        case 'o':o++;break;
                        case 'u':u++;break;
                        case 'y':y++;break;

                    }
                }

            }

        }
        System.out.println("Pocet samohlasek je: "+pocet);
        System.out.println("Pocet a je: "+a);
        System.out.println("Pocet e je: "+e);
        System.out.println("Pocet i je: "+ii);
        System.out.println("Pocet o je: "+o);
        System.out.println("Pocet u je: "+u);
        System.out.println("Pocet y je: "+y);
    }
}
