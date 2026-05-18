package JAVA_DSA.loops;

import java.util.Scanner;

public class fevofno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no that you want to do reverse : ");
        int num = sc.nextInt();
        int rem = 0;
        int rev = 0;
        while (num>0) {
            rem = num%10;
            // System.out.print(rem+" ");
            rev = (rev)*10+rem;
            num = num / 10;
        }
        System.out.print("reverse no : "+rev);


    }   
}
