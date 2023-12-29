public class recursion0 {
    public static void main(String[] args) {
        //Binary search using recursion
//        int []arr={1,2,5,6,55,67,88};
//        int target=67;
//        System.out.println(search(arr,target,0,arr.length-1));
        for (int i=0;i<=10;i++){
            System.out.println(fiboformula(i));
        }
    }
    static int search(int[]arr,int target,int s,int e){
      if(s>e){
          return -1;
      }
      int m=s+(e-s)/2;
      if(target==arr[m]){
          return m;
      }
      if(target<arr[m]){
          return search(arr,target,s,m-1);
      }
        return search(arr,target,m+1,e);

    }
    static int fiboformula(int n){
      return  (int)(( Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
//        return  (int)(( Math.pow(((1+Math.sqrt(5))/2),n))/Math.sqrt(5));

    }
}
