import java.util.Scanner;
public class CheckIfPalindrome {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[]args){
        System.out.println("Zadej slovo: ");
        String slovo = sc.nextLine();
        String pom = "";
        char []pole = new char[slovo.length()];
        for(int i = slovo.length()-1; i >= 0 ; i--){
            char x = slovo.charAt(i);
            pole[i] = x;
            pom = String.valueOf(pole[i]) + pom;
            System.out.println("Je slovo: "+x);
            if(pom.equals(slovo)){
                System.out.println("Je palindrom");

            }
            else {
                System.out.println("neni palindrom");
            }
            }






    }
}
