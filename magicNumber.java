public class magicNumber {
    public static void main(String[] args) {
//        System.out.println(magicno(6));
//        System.out.println(noofdigits(10,2));
//        System.out.println(pascal triangle(6));
//        System.out.println(power(32));
//        System.out.println(pow(3,6));
//        System.out.println(setbits(234567));
        int a=3;
        int b=9;
        int ans=xor(b)^xor(a-1);
        System.out.println(ans);

    }
    static int magicno(int n){
        int ans=0;
        int base=5;
        while(n>0){
            int last=n&1;
            n=n>>1;
            ans+=last*base;
            base=base*5;
        }
        return ans;
    }
    static  int noofdigits(int n, int b){
        int ans=(int) (Math.log(n)/Math.log(b))+1;
        return ans;
    }
    static int pascaltriangle(int n){
        //this is sum
        return 1<<(n-1);
    }
    static boolean power(int n){
        return (n&(n-1))==0;
    }
    static int pow(int base,int power){
        int ans=1;
        while (power>0){
            if ((power&1)==1){
                ans=ans*base;
            }
            base*=base;
            power=power>>1;
        }
        return ans;
    }
    static int setbits(int n){
        int count=0;
        while (n>0){
            if((n&1)==1){
              count+=1;
            }
            n=n>>1;
        }
        return count;
    }
    static int set(int n){
        int count=0;
        while(n>0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
    static int xor(int a) {
        if(a%4==0){
            return a;
        }
        if(a%4==1){
            return 1;
        }
        if(a%4==2){
            return a+1;
        }
            return 0;
    }

}
