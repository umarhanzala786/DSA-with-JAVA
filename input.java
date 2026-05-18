package JAVA_DSA.Variables;
import java.util.*;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.println("Your name is : "+name);
        System.out.println("Your age is : "+age);
    }
}
