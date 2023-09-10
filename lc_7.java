import java.util.Arrays;
import java.util.Scanner;

public class lc_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int []arr=new int[5];
//        for (int i=0;i< 5;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//        int[] nums={1,56,6,7,789};
//        System.out.println(Arrays.toString(nums));
//    }
//   static void change(int[]arr){
//        arr[0]=99;
        int[][]arr= new int[3][2];
    //    System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(Arrays.toString(arr));

   }
}
