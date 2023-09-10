class armstrong {
    static boolean isArmstrong(int k) {
        int original = k;
        int sum = 0;
        while (k > 0) {
            int rem = k % 10;
            k = k / 10;
            rem = rem * rem * rem;
            sum = sum + rem;
        }
        return sum == original;
    }


public class lc_6 {


//
        public static void main(String[] args) {
            System.out.println(isArmstrong(153));



        }
    }
}
/*class sum{
    int z;
     public  void sum1(int x,int y){
         z=x+y;
     }
     public void print(){
         System.out.println(z);
    }
}



class swapping {
    public void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println(x+"  "+y);
    }
}
////////////////////////////////////////////////////////////////////////////
 */

     /*   sum one=new sum();
              one.sum1(4,5);
              one.print();
       System.out.println("hello world");

        swapping one = new swapping();
        one.swap(5, 6);
        int[] arr = {2, 24, 65, 8, 90};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void change(int[] num) {
        num[0] = 99;
        int a = 10;
        int b = 10;
        String name = "Param";
        {
            a = 100;//reassigning the value
            System.out.println(a);
            int c = 0;
            name = "Rahul";
            System.out.println(name);

        }
        System.out.println(a);

        System.out.println(name);
        System.out.println(n);
        int n = 40;
        System.out.println(n);
        fun();
        fun1(22, 33, 45, 6, 8, 9, 87, 65);
    }

    static void fun() {
        System.out.println(n);
    }

    static void fun1(int a, int b, int... arr) {
        System.out.println(Arrays.toString(arr));
        System.out.println(check(153));
    }

   */
