import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int[]nums={734,6,3,5,74,4,};
        inplacesort(nums,0,nums.length);
        System.out.println(Arrays.toString(nums));

    }
    static int[] sort(int []arr){
        if (arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int []left=sort(Arrays.copyOfRange(arr,0,mid));
        int []right=sort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    private static int[] merge(int[]first,int[]second){
        int []mix=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i< first.length &&j< second.length){
            if (first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }
            else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
    //
    static void inplacesort(int []arr,int s,int e){
        if (e-s == 1){
            return ;
        }
        int mid=(s+e)/2;
        inplacesort(arr,s,mid);
        inplacesort(arr,mid,e);
        mergeinplace(arr,s,mid,e);
    }
    private static void mergeinplace(int[]arr,int s,int m,int e){
        int[] mix=new int[e-s];
        int i=s;
        int j=m;
        int k=0;
        while(i<m  && j<e ){
            if (arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<m){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        System.arraycopy(mix, 0, arr, s + 0, mix.length);
    }
}
