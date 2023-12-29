public class SearchinMountain {
    public static void main(String[] args) {

    }
    int search(int[]arr,int target){
        int peak=peakIndexMountain(arr);
        int firstry= orderagnosticbs(arr,target,0,peak);
        if (firstry!=-1){
            return firstry;
        }
        return orderagnosticbs(arr,target,peak+1,arr.length-1);

    }
    public int peakIndexMountain(int []arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start +(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
    static int orderagnosticbs(int[] arr, int target,int start,int end) {


        //checking if the array is asc
        boolean isASC = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isASC) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;}
            } else {
                if (target > arr[mid]) {
                    end = mid + 1;
                }
                else {
                    start=mid+1;
                }
            }
        }

        return -1;
    }

}
