import java.util.*;
public class lcpb442 {
    public static void main(String[] args) {

    }

        static  List<Integer> findDuplicates(int[] nums) {
            int i=0;
            while(i<nums.length){
                int correctIndex=nums[i]-1;
                if(nums[i]!=nums[correctIndex]){
                    swap(nums,i,correctIndex);
                }else{
                    i++;
                }
            }
            List <Integer> duplicate=new ArrayList<>();
            for(int index=0;index<nums.length;index++){
                if(nums[index]!=index+1){
                    duplicate.add(nums[index]);
                }
            }
            return duplicate;
        }
        static void swap(int[]arr,int first,int second){
            int temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;

    }
}

