package JavaAssighnmentRoohiMam;

import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number to find square root : ");
        int n = in.nextInt();
        System.out.println(findSqurt(n));
    }
    public static int findSqurt(int n){
        float start = 1;
        float end = n / 2;
        while(start <= end){
            float mid = (start + end)/2;
            if((mid * mid) == n){
                return Math.round(mid);
            }else if((mid * mid) < n ){
                start = (float) ((float) mid + 0.01);
            }else{
                end =(float)((float)mid - 0.01);
            }
        }
        return Math.round(start);
    }
}