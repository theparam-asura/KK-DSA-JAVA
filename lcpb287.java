public class lcpb287 {
    public static void main(String[] args) {

    }

        static int findDuplicate(int[] nums) {
            int missingno=0;
            int i=0;
            while(i<nums.length){
                int correctIndex=nums[i]-1;
                if(nums[i]!=nums[correctIndex]){
                    swap(nums,i,correctIndex);
                }else{
                    i++;
                }
            }
            for(int index=0;index<nums.length;index++){
                if(nums[index]!=index+1){
                    missingno=nums[index];
                }
            }
            return missingno;
        }
       static void swap(int[]arr,int first,int second){
            int temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
        }
    }



