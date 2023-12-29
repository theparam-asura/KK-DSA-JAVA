public class orderagnosticbs {
    public static void main(String[] args) {
        int []arr={-1,-2,-3,-4,-5,-6,-7,-8,-9,1,2,3,4,5,6,7,8,9,10};
        int target=-2;
        int ans=orderagnosticbs(arr,target);
        System.out.println(ans);
    }

    static int orderagnosticbs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        //checking if the array is asc
        boolean isASC = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isASC) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;}
                } else {
                    if (target > arr[mid]) {
                        end = mid + 1;
                    }
                    else {
                        start=mid+1;
                    }
                }
            }

        return -1;
    }



    }

