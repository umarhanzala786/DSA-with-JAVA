package JAVA_DSA.loops;

import java.util.Scanner;

public class printno {
    public static void main(String[] args) {
        // int num = 1;
        // while (num <= 10 ) {
        //     System.out.println(num);
        //     num++;
        // }
        int num;
        int counter = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of range : ");
        num = sc.nextInt();
        while (counter <= num ) {
            System.out.print(counter+" ");
            counter++;
        }
    }
}
