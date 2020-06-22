

import java.util.Scanner;

class ReverseAString {
    private static Scanner sc = new Scanner(System.in);
    private static void main(String[]args){
        System.out.println("Zadej slovo: ");
        String slovo = sc.nextLine();

        for(int i = slovo.length()-1; i>= 0 ;i--){
            char zpet = slovo.charAt(i);
            System.out.print(zpet);

        }

    }
}