public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(lcm(4, 8));
        System.out.println(lcm(7, 3 ));

    }

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
//        if(a==0){
//            return b;
//        }
//        return ((a*b)/(lcm(b%a,b)));
    }
}