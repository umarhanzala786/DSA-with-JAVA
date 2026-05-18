package JAVA_DSA.Operator;

public class logicalop {
    public static void main(String[] args) {
        // logical AND
        System.out.println((3>2) && (5<0));
        System.out.println((3>2) && (2<7));
        // logical OR
        System.out.println((3>2) || (5<0));
        System.out.println((3>2) || (2<7));
        System.out.println((3<2) || (5<0));
        System.out.println((3<2) || (2>7));
        // logical NOT
        System.out.println(!(3<2));
        System.out.println(!((3>2) && (2<7)));
    }
}
