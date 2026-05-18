package JAVA_DSA.Variables;

public class bytetypepermotion {
    public static void main(String[] args) {
        // byte a = 5;
        // byte b = a*2;
        // a = a*2;
        // wrong way to permote that 
        // right way 
        byte a = 5;
        byte b = (byte) (a*2);
        System.out.println(b);
        System.out.println(((Object)b).getClass().getSimpleName());
    }
}
