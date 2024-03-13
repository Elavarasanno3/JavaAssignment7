package ProblemSolvingAssignment;
import java.util.*;
public class OneOfMyFavourite3x1{
    public static void main(String[] args) {
       try (Scanner in = new Scanner(System.in)) {
        System.out.print("Enter any number : ");
           int n = in.nextInt();
           findSequence(n);
    }
    }
    static void findSequence(int n){
        while(n != 1){
            System.out.print(n + " --> ");
            if(n % 2 == 0){
                n /= 2;
            }else{
                n = (3*n)+1;
            }
        }
        System.out.print(n + " END ");
    }
}