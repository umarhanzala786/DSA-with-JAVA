package JAVA_DSA.loops;

import java.util.Scanner;

public class Break {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            if (n%10==0){
                System.out.print("I am out of the loop");
                break;
            }
            System.out.println(n);
        }while(true);

    }
}
