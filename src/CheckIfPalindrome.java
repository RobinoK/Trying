import java.util.Scanner;
public class CheckIfPalindrome {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[]args){
        System.out.println("Zadej slovo: ");
        String slovo = sc.nextLine();
        String pom = "";
        for(int i = slovo.length()-1; i >= 0 ; i--){
            char x = slovo.charAt(i);
            pom = pom + x;


            }
        if(pom.equals(slovo)){
            System.out.println("Je palindrom");

        }
        else {
            System.out.println("neni palindrom");
        }

    }
}
