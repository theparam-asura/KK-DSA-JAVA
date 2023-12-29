import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
         int []arr={5,1,4,3,2};
         selsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selsort(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxindex = getMaxIndex(arr, 0, last);
            swap(arr, maxindex, last);
        }
    }
    static void swap(int []arr,int first,int end){
        int temp=arr[first];
        arr[first]=arr[end];
        arr[end]=temp;
    }
    static int getMaxIndex(int[]arr,int start,int end){
        int max=start;
        for (int i=0;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
