import java.util.Arrays;

public class lc_9_linear_search{
    public static void main(String[] args) {
        int [][]arr= {
                {12, 3, 4},
                {13, 67, 88},
                {44, 78, 99, 31},
                {12, 125}

        };
        System.out.println(max(arr));
    }
   static int max(int[][]arr){
        int max=Integer.MIN_VALUE;
        for (int[]ints:arr){
            for(int element:ints){
                if(element>max){
                    max=element;

                }
            }
        }


       return max;
   }
}


























































class trash {
 /*   int i = 0;

           while(i<length){
            if (arr[i]==n){
                System.out.println("your element is found at the index"+i);
            }
            else {
                System.out.println("No element found");
            }
            i++;
        }

}

    static int search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                System.out.println("Your elements is at index:"+i);
                return element;


  */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 /*String a="Param";
        char target='u'
        System.out.println(Arrays.toString(a.toCharArray()));
    boolean z=searchstring(a,'a');
        System.out.println(z);
}
    static boolean searchstring(String x,char target){
        if (x.length()==0){
            return false;
        }
        for(char i:x.toCharArray()){
            if (i ==target){
                return true;
            }
        }
        return false;

  */
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*     Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value to be searched");
        int n = sc.nextInt();
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int length = num.length;
        int ans = search(num, 7,1,5);
        System.out.println(ans);

    }

    static int search(int[] arr, int target,int start,int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i < end; i++) {
            int element = arr[i];
            if (element == target) {
                System.out.println("Your elements is at index:" + i);
                return element;


            }
        }
        return -1;
    }

     */
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    //        int[]arr={2,3,4,5,6,7,8,9};
//        System.out.println(min(arr));
//        static int min(int []arr){
//        int minvalue=arr[0];
//        for (int i=0;i< arr.length;i++){
//            if(arr[i]<minvalue) {
//                minvalue = arr[i];
//
//            }
//        }
//        return minvalue;
//    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        int [][]arr={
//                {12,3,4},
//                {13,67,88},
//                {44,78,99,31},
//                {12,55}
//        };
//        int target=99;
//        int []ans=search(arr,target);
//        System.out.println(Arrays.toString(ans));
//static int[] search(int[][]array,int target){
////        for (int i=0;i< array.length;i++){
////            for (int j=0;j<array[i].length;j++){
////                if (array[i][j]==target){
////                    return new int[]{i,j};
////                }
////
////            }
////
////
////      }
////
////      return new int[]{-1,-1};
////  }


















}
