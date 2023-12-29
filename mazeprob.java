import java.util.*;

public class mazeprob {
    public static void main(String[] args) {
//        System.out.println(countpaths(3,3));
//        printpaths("",3,3);
//        ArrayList<String> ans=printpathslist("",3,3);
//        System.out.println(ans);
//        ArrayList<String> ans=printpathsdiagonallist("",3,3);
//        System.out.println(ans);
        boolean[][] maze={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        mazewithobstacles("",maze,0,0);

    }
    static int countpaths(int row,int col){
        if (row==1 || col==1){
            return 1;
        }
        int left=countpaths(row-1,col);
        int right=countpaths(row,col-1);
        return left+right;
    }
    static void printpaths(String ans,int row,int col){
        if (row==1 && col==1){
            System.out.println(ans);
            return ;
        }

        if (row>1){
            printpaths(ans+'D',row-1,col);
        }
        if (col>1){
            printpaths(ans+'R',row,col-1);
        }
    }
    static ArrayList<String> printpathslist(String ans, int row, int col){
        if (row==1 && col==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> anslist=new ArrayList<>();
        if (row>1){
            anslist.addAll(printpathslist(ans+'D',row-1,col));
        }
        if (col>1){
            anslist.addAll(printpathslist(ans+'R',row,col-1));
        }
        return anslist;
    }
    static ArrayList<String> printpathsdiagonallist(String ans, int row, int col){
        if (row==1 && col==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> anslist=new ArrayList<>();
        if (row>1 && col>1){
            anslist.addAll(printpathsdiagonallist(ans+'D',row-1,col-1));
        }
        if (row>1){
            anslist.addAll(printpathsdiagonallist(ans+'V',row-1,col));
        }
        if (col>1){
            anslist.addAll(printpathsdiagonallist(ans+'H',row,col-1));
        }
        return anslist;
    }
    static void mazewithobstacles(String ans,boolean[][]arr,int row,int col){
        if (row==arr.length-1 && col==arr[0].length-1){
            System.out.println(ans);
            return ;
        }
        if (!arr[row][col]){
            return ;
        }
        if (row<arr.length-1){
            mazewithobstacles(ans+'D',arr,row+1,col);
        }
        if (col< arr[0].length-1){
            mazewithobstacles(ans+'R',arr,row,col+1);
        }
    }
}
