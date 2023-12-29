public class lcpb41 {
    public static void main(String[] args) {

    }
   static int missing(int[]nums){
        int i=0;
        while(i<nums.length){
        int correctIndex=nums[i]-1;
        if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[correctIndex]){
            swap(nums,i,correctIndex);
        }else{
            i++;
        }
    }

        for(int index=0;index<nums.length;index++){
        if(nums[index]!=index+1){
            return index+1;

        }
    }
        return nums.length+1 ;
}
   static  void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
