package JAVA_DSA.loops;

public class breaksttmnt {
    public static void main(String[] args) {
        int n = 0;
        while (n<=10) {
            
            if (n==3) {
                System.out.println("i am out of the loop");
                break;

            }
            System.out.println(n);
            n++;
            
        }
    }
}
