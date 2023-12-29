import java.util.Arrays;

public class lc_7 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 23, 19, 5, 6, 7, 18, 9};
         reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void reverse(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
              start++;
              end--;

        }
    }
        static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}






        class dump{
            public static void main(String[] args) {
                //        int []arr=new int[5];
//        for (int i=0;i< 5;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//        int[] nums={1,56,6,7,789};
//        System.out.println(Arrays.toString(nums));
//    }
//  static void change(int[]arr){
//        arr[0]=99;
//                int[][]arr= new int[3][3];
//           System.out.println(arr.length);
//                for(int i=0;i<arr.length;i++){
//                    for(int j=0;j<arr[i].length;j++){
//                        arr[i][j]=sc.nextInt();
//                    }
//                }
//                //        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println(" ");
//        }
//        for (int i=0;i<arr.length;i++){
//            System.out.println(Arrays.toString(arr[i]));
//        }
//           for (int[]a:arr){
//               System.out.println(Arrays.toString(a));
//           }
//    static int max(int[] arr) {
//        int max = arr[0];
//        for (int j : arr) {
//            if (j > max) {
//                max = j;
//            }
//        }
//
//
//        return max;
//
//    }
 //               System.out.println(max(arr));
            }

        }
class arraylist {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        ArrayList<Integer> arrayList=new ArrayList<>(6);
//        arrayList.add(89);
//        arrayList.add(9);
//        arrayList.add(989);
//        arrayList.add(889);
//        System.out.println(arrayList);
//        System.out.println(arrayList.contains(89));
//        arrayList.set(1,99);
//        System.out.println(arrayList);
//
//        for (int j=0;j<5;j++){
//            arrayList.add(sc.nextInt());
//        }
//        for (int i=0;i<5;i++){
//            System.out.print(arrayList.get(i) +" ");
//        }
//        ArrayList<ArrayList<Integer>> list=new ArrayList<>(6);
//        //Initilisation
//        for (int i=0;i<6;i++){
//            list.add(new ArrayList<>());
//        }
//        for (int j=0;j<6;j++){
//            list.get(j).add(sc.nextInt());
//        }
//
//


    }
}
class swap {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        swap(arr, 2, 3);
//        System.out.println(Arrays.toString(arr));
//
//    }
//

}
    }
