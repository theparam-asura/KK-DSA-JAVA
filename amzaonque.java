public class amzaonque {
    public static void main(String[] args) {
        //Find an element in an infinite array
        int[]arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.println(ans(arr,target));

    }
    static  int ans(int []arr,int target){
        //first find the range
        //first start with a box of size 2
        int start=0;
        int end=1;
        //Condition for the target to lie in range
        //if target<end
        //apply binary and find the element
        while(target>arr[end]){
            int newS=end+1;
            end=end+(end-start+1)*2;
            start=newS;
        }

        return binarysearch(arr, target, start, end);
    }
    static int  binarysearch(int[]arr,int target,int start,int end){


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
}
