package JAVA_DSA.Variables;
import java.util.*;
public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second number : ");
        int b = sc.nextInt();
        System.out.println("Enter ( +,*,-,/,%)any Operator : ");
        char ch = sc.next().charAt(0);
        int sum = a+b;
        int mul = a*b;
        int sub = a-b;
        float div = a/b;
        int rem = a%b;
        
        switch (ch) {
            case '+' : System.out.println("Sum is : "+sum);
                
                break;
            case '*' : System.out.println("multiply is : "+ mul);
                break;
            case '-': System.out.println("substraction is : "+sub);
                break;
            case '/' : System.out.println("division is : "+div);
                break;
            case '%' : System.out.println("Remainder is : "+rem);
                break;
            default: System.out.println("invalid operator....");
                break;
        }
    }
}
