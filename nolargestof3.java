package JAVA_DSA.ConditionalStatement;

public class nolargestof3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 20;
        if(a>=b && a>=c){
            System.out.println("A is largest of 3");
        }
        else if(b>=c){
            System.out.println("B is largest of 3");
        }
        else {
            System.out.println("C is largest of 3");
        }
    }
}
