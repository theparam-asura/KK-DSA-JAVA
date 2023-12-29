public class binarysearch {
    public static void main(String[] args) {
        int []arr={-1,-2,-3,-4,-5,-6,-7,-8,-9,1,2,3,4,5,6,7,8,9,10};
        int target=-1;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
        int[]arr1={10,9,8,7,6,5,4,3,2,1,-1,-2,-3,-4,-5,-6,-7,-8,-9};
        int target1=5;
        int ans1 = binarysearch1(arr1, target1);
        System.out.println(ans1);

    }
    static int  binarysearch(int[]arr,int target){
        int start=0;
        int end= arr.length-1;

        while (start<=end){
            int mid=start +(end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            } if (target>arr[mid]) {
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    static int  binarysearch1(int[]arr,int target){
        int start=0;
        int end = arr.length-1;

        while (start<=end){
            int mid=start +(end-start)/2;
            if (target<arr[mid]){
                start=mid+1;
            } if (target>arr[mid]) {
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
