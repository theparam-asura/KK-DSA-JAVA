public class recursion00 {
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }
    static void series(int n){
        if(n==0){
            System.out.println(0);
            return;
        }
        System.out.println(n);
        series(n-1);
    }
    static int  fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
