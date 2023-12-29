public class lcpb645 {
    public static void main(String[] args) {

    }
    static int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correctIndex=nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                swap(nums,i,correctIndex);
            }else{
                i++;
            }
        }
        int a=0;
        int b=0;

        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                a=index+1;
                b=nums[index];
            }
        }
        return new int[]{b,a};
    }
    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
}
