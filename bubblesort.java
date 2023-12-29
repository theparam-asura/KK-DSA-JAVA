import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
             int []arr={5,4,3,2,1};
             incbubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void incbubble(int []arr){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped=false;
            for(int j=1;j<arr.length-i;j++){
                //condition to check
                if(arr[j]<arr[j-1]){        // 5,1,2,34,5,6,
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped =true;
                }
            }
            if (!swapped){
                break;
            }
        }
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
        }
    static void decbubble(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                //condition to check
                if(arr[j]>arr[j-1]){        // 5,1,2,34,5,6,
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
}

}

