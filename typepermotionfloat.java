package JAVA_DSA.Variables;

public class typepermotionfloat {
    public static void main(String[] args) {
        int a = 5;
        float b = 25.63f;
        long c = 35;
        double d = 45;
        double ans = a+b+c+d;
        System.out.println(((Object)ans).getClass().getSimpleName());
        System.out.println(ans);
    }
}
