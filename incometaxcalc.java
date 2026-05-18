package JAVA_DSA.ConditionalStatement;
import java.util.*;
public class incometaxcalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income : ");
        int income = sc.nextInt();
        float tax = 0;
        if (income < 500000)
            System.out.println("Tax is : "+ tax);
        else if(income >= 500000 && income <1000000){
            tax = income * (0.2f);
            System.out.println("Tax is : "+ tax);
        }
        else{
            tax = income * (0.3f);
            System.out.println("Tax is : "+ tax);
        }
            

    }
}
