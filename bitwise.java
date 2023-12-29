public class bitwise {
    public static void main(String[] args) {
//        System.out.println(odd(5));
//        System.out.println(odd(6));
//        int []arr={4,1,3,3,2,1,2};
//        System.out.println(unique(arr));
//        set(5,2);

    }
    static boolean odd(int n){
        return (n & 1) == 1;
    }
    static int unique(int []arr){
        int unique=0;
        for(int n:arr){
            unique ^=n;
        }
        return unique;
    }
    static void set(int n,int i){
      int mask=1<<(i-1);
      int setValue=n|mask;
        System.out.println(setValue);
    }


}
