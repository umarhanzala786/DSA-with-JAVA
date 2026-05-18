package JAVA_DSA.PracticeQues;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check leap year (eg. 2000) : ");
        int num = sc.nextInt();
        if (num % 4 == 0 && num % 100 != 0){
            System.out.println("The "+ (num) + " is Leap year");
        }
        else if (num % 4 == 0 && num % 100 == 0 && num % 400 == 0){
            System.out.println("The "+ (num) + " is Leap year");
        }
        else{
            System.out.println("The "+ (num) + " is not a Leap year");
        }
    }
}
