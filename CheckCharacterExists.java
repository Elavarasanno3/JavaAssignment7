package JavaAssighnmentRoohiMam;

import java.util.Scanner;

public class CheckCharacterExists {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the String : ");
            String str = in.nextLine();
            System.out.print("Enter the char : ");
            char c = in.next().charAt(0);
            System.out.println(CheckExist(str,c));
        }
    }
    static boolean CheckExist(String str,char c){
        if(str.length() == 0){
            return false;
        }

        if(str.charAt(0) == c){
            return true;
        }else{
            return CheckExist(str.substring(1), c);
        }

    }
}
