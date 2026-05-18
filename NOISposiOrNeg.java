package JAVA_DSA.PracticeQues;
import java.util.Scanner;

public class NOISposiOrNeg {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check positive or negative : ");
        int num = sc.nextInt();
        if (num < 0){
            System.out.println("Number is Negative :"+num);
        }
        else{
            System.out.println("Number is positive : "+num);
        }

    }
}
