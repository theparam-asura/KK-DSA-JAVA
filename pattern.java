import java.util.*;
public class pattern {
    public static void main(String[] args) {
      pattern4(4);

    }
    static void pattern1(int n){
        for(int i=0;i<2*n;i++){
            int tj=i>n? 2*n-i:i;
            for (int j=0;j<tj;j++){
                System.out.print("*");
            }
            System.out.print(" ");
        }
    }
    static void pattern2(int n) {
       for (int row=0;row<2*n;row++){
           int totalcolsinrow=row>n? 2*n-row:row;
           int noofspaces=n-totalcolsinrow;
           for (int s=0;s<noofspaces;s++){
               System.out.print(" ");
           }
           for (int col=0;col<totalcolsinrow;col++){
               System.out.print("* ");
           }
           System.out.println();
       }


    }
    static void pattern3(int n){
        for (int row=0;row<n;row++){
            for(int space=0;space<n-row;space++){
                System.out.print(" ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col+" ");
            }
            for (int col=2;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
       }
       static void pattern4(int n){
        int originalN=n;
        n=2*n;
        for (int row=0;row<=n;row++){
            for (int col=0;col<=n;col++){
                int everyindex=Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(everyindex+" ");
            }
            System.out.println();
        }
       }
}
