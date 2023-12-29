public class basicmaths {
    public static void main(String[] args) {
//        System.out.println(isPrime(16));
//        System.out.println(isPrime(17));
          int n=40;
          boolean [] prime=new boolean[n+1];
          sieve(n,prime);

    }
    static  boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
//     for (int i=0;i<40;i++){
//        if (isPrime(i)){
//            System.out.println(i);
//        }
//    }
    static void sieve(int n,boolean[]prime){
        for (int i=2;i<=Math.sqrt(n);i++){
            if(!prime[i]){
                for (int j=i*2;j<=n;j+=i){
                    prime[j]=true;
                }
            }
        }
        for (int i=2;i<=n;i++){
            if (!prime[i]){
                System.out.println(i);
            }
        }
    }
}
