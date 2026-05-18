package JAVA_DSA.loops;

import java.util.Scanner;

public class sumofno {
    public static void main(String[] args) {
        int num;
        int counter = 1;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of range : ");
        num = sc.nextInt();
        while (counter <= num ) {
            sum += counter;
            System.out.print(counter+" ");
            counter++;
        }
        System.out.println(" ");
        System.out.print("Total sum is : "+sum);
    }
}
