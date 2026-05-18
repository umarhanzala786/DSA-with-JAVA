package JAVA_DSA.PracticeQues;

import java.util.Scanner;

public class weekday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number from (1-7) : ");
        int num = sc.nextInt();
        switch (num) {
            case 1 : System.out.println("Saturday...");
                
                break;
            case 2 : System.out.println("Sunday...");
                
                break;
            case 3 : System.out.println("Monday...");
                
                break;
            case 4 : System.out.println("Tuesday...");
                
                break;
            case 5 : System.out.println("wednesday...");
                
                break;
            case 6 : System.out.println("thursday...");
                
                break;
            case 7 : System.out.println("Friday...");
                
                break;
            default:
                System.out.println("Please enter a valid number ....");
                break;
        }
    }
}
