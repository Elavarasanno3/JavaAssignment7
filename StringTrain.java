package ProblemSolvingAssignment;
import java.util.*;
public class StringTrain {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter any String Which length must be in odd numbers : ");
            String str = in.nextLine();
            System.out.println(trainMaking(str));
            //run == rrunn
        }
    }
    static String trainMaking(String str){
        int index = (str.length()/2);
        String ans = "";
        for(int i = 0;i<=index;i++){
            for(int j = index;j>=i;j--){
                ans = ans + str.charAt(i);
            }
        }
        int flag = 2;
        for(int i = index+1;i<str.length();i++){
            for(int j = 0;j<flag;j++){
                ans = ans + str.charAt(i);
            }
            flag++;
        }
        return ans;
    }
}
