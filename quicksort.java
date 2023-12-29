import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
         int [] nums={5,2,1,3,4};
         sort(nums,0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    static void sort(int[]nums,int low,int high){
        if (low>=high){
            return ;
        }
        int s=low;
        int e=high;
        int m=s+(e-s)/2;
        int pivot=nums[m];
        while(s<=e){
            while(nums[s]<pivot){
                s++;
            }
            while(nums[e]>pivot){
                e--;
            }
            if (s<=e){
                int temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
                e--;
            }
            //now pivot is at correct index
        }
        sort(nums,low,e);
        sort(nums,s,high);
    }
}
