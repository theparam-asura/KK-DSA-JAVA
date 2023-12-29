import java.util.Arrays;

public class recursion3 {
    public static void main(String[] args) {
        pattern1(6,0);
        pattern2(6,0);
        int[]arr={4,5,3,1,2};
        bubblesort(arr, arr.length-1,0);
        System.out.println(Arrays.toString(arr));
        selection(arr, arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
        System.out.println(sequence(5,1,1));



    }
    static void pattern1(int row,int col){
        if (row==0){
            return ;
        }
        if (col<row){
            System.out.print("*");
            pattern1(row, col+1);
        }
        else{
            System.out.println();
            pattern1(row-1,0);
        }
    }
    static void pattern2(int row,int col){
        if (row==0){
            return ;
        }
        if (col<row){
            pattern2(row, col+1);
            System.out.print("*");
        }
        else{
            pattern2(row-1,0);
            System.out.println();

        }
    }
    static void bubblesort(int []arr,int row,int col){
        if (row==0){
            return ;
        }
        if (col<row){
            if (arr[col]>arr[col+1]){
                int temp=arr[col];
                arr[col]=arr[col+1];
                arr[col+1]=temp;
            }
            bubblesort(arr,row, col+1);

        }
        else{
            bubblesort(arr,row-1,0);
        }
    }
    static void selection(int []arr,int r,int c,int max){
        if (r==0){
            return ;
        }
        if (c<r) {                                                        //row=arr.length-1
            if (arr[c] > arr[max]) {
                selection(arr, r, c + 1, c);                               //here max=c
            } else {
                selection(arr, r, c + 1, max);
            }
        }
        else{
                int temp=arr[max];
                arr[max]=arr[r-1];                                            //last element -->second last-->third
                arr[r-1]=temp;
                selection(arr,r-1,0,0);                 //here last element is at 0 and we con. the search
            }
        }
    static int sequence(int n,int i,int value){

        if (i>n-1){
            return 1;
        }
        value=(value*10+1);
        System.out.println(value);
        return value+sequence(n,i+1,value);

    }
}
