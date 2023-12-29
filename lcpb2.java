public class lcpb2 {
    public static void main(String[] args) {
        //leet code problem number 744
        // Finding the smallest letter than target

    }
    public char nextGreatestletter(char[]letters,char target){

        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid=start+(end -start)/2;
            if (target<letters[mid]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }

        }
        return letters[start%letters.length];
    }
    }

