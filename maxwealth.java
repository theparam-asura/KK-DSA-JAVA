import java.util.Scanner;
public class maxwealth{
    public static void main(String[] args) {
          //Leet code problem number 1672
    }
    public int maxwealth(int [][]accounts){
        int ans=Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;

            }
            //
            if (sum > ans) {
                ans = sum;

            }
        }


        return ans;
    }
}


