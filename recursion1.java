
public class recursion1 {
//    static int sum=0;
//    static void rev1(int n){
//        if (n==0){
//            return ;
//        }
//        int rem=n%10;
//        sum=sum*10 +rem;
//        rev1(n/10);
//    }
    public static void main(String[] args) {
//        range(5);
//        revrange(5);
//        System.out.println(factorial(4));
//        System.out.println(sum(6));
//        System.out.println(sumOfDigits(1342));
//        System.out.println(productOfDigits(1342));
//        pass(5);
//        rev1(1482);
//        System.out.println(sum);
//        System.out.println(rev2(1234));
//        System.out.println(countzeros(422205207));
        System.out.println(countsteps(25));
    }



    static void range(int n) {
      if (n==0){
          return  ;
      }
        System.out.println(n);
      range(n-1);

    }
    static void revrange(int n) {
        if (n==0) {
            return;
        }
        revrange(n-1);
        System.out.println(n);
    }
    static int  factorial(int n){
        if (n<=1){
            return 1;
        }
      return  n*factorial(n-1);
    }
    static int  sum(int n){
        if (n == 1){
            return 1;
        }
        return  n+sum(n-1);
    }
    static int  sumOfDigits(int n){
        if (n <= 0){
            return 0;
        }
        return  (n%10)+sumOfDigits(n/10);
    }
    static int  productOfDigits(int n){
        if (n%10 ==n){
            return n;
        }
        return  (n%10)*productOfDigits(n/10);
    }
    static void pass(int n) {
        if (n==0){
            return  ;
        }
        System.out.println(n);
        pass(--n);

    }
    static int rev2(int n){
        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);

    }

    private static int helper(int n, int digits) {
        if (n%10 ==n){
            return n;
        }
        int rem=n%10;
        return rem * (int)(Math.pow(10,digits-1)) + helper(n/10,digits-1);
    }
    static boolean palindromenum(int n){
        return n==rev2(n);
    }
    static int countzeros(int n){
        return helper1(n,2,0);
        }
//        private static int helper1(int n,int c){
//        if (n==0){
//            return c;
//        }
//        int rem=n%10;
//            if (rem == 0) {
//                return helper1(n/10,c+1);
//            }
//        return helper1(n/10,c);
//        }
private static int helper1(int n,int target,int c){
    if (n==0){
        return c;
    }
    int rem=n%10;
    if (rem == target) {
        return helper1(n/10,target,c+1);
    }
    return helper1(n/10,target,c);
}
static int countsteps(int n){
        return helper3(n,0);
}
    private static int helper3(int n,int step){
        if (n==0){
            return step;
        }
        if (n%2==0) {
            return helper3(n/2,step+1);
        }
        return helper3(n-1,step+1);
    }


}

