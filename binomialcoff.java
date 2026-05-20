package JAVA_DSA.functionsAndmethod;

import java.util.Scanner;

public class binomialcoff {
    public static int Factorial(int n){
        int fact = 1;
        for (int i = 1 ; i<=n ; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static int bincoff(int n, int r){
        int binocoff = 0;
        int a = Factorial(n);
        int b = Factorial(r);
        int c = Factorial(n-r);
        binocoff = a/(b*c);
        return binocoff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : " );
        int n = sc.nextInt();
        System.out.println("Enter the value of r : ");
        int r = sc.nextInt();
        int result = bincoff(n, r);
        System.out.println("The resultant binomial cofficient is : "+result);
    }
}
