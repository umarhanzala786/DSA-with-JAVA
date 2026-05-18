package JAVA_DSA.Variables;

public class typePermotion {
    public static void main(String[] args) {
        // char a = 'a';
        // char b = 'b';
        // System.out.println((int)(a));
        // System.out.println((int)(b));
        // System.out.println(b-a);
        short a = 5;
        byte b = 25;
        char c = 'c';
        byte bt = (byte) (a+b+c); //agar byte data type na karein to error aayega kyu ki default mein expression int mein hi ans deti hai

        System.out.println(bt);
        
    }
}
