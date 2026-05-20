package JAVA_DSA.functionsAndmethod;

import java.util.Scanner;

public class DecToBin {
    public static void DecToBin(int decNum){
        int myNum = decNum;
        int BinNum = 0;
        int pow = 0;
        while (decNum > 0) {
            int rem = decNum%2;
            BinNum = BinNum + (rem*(int)Math.pow(10, pow));
            decNum/=2;
            pow++;
        }
        System.out.println("Binary of "+myNum+" ="+BinNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number : ");
        int n = sc.nextInt();
        DecToBin(n);
    }
}
