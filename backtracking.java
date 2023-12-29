import java.util.Arrays;

public class backtracking {
    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
//        allpaths("",maze,0,0);
        int[][] path =new int[maze.length][maze[0].length];
        allpathsprint("",maze,0,0,path,1);
    }
    static void allpaths(String ans,boolean[][]arr,int row,int col){
        if (row==arr.length-1 && col==arr[0].length-1){
            System.out.println(ans);
            return ;
        }
        if (!arr[row][col]){
            return ;
        }
        arr[row][col]=false;
        if (row<arr.length-1){
            allpaths(ans+'D',arr,row+1,col);
        }
        if (col< arr[0].length-1){
            allpaths(ans+'R',arr,row,col+1);
        }
        if (row>0){
            allpaths(ans+'U',arr,row-1,col);
        }
        if (col>0){
            allpaths(ans+'L',arr,row,col-1);

        }
        arr[row][col]=true;
    }
    static void allpathsprint(String ans,boolean[][]maze,int r,int c,int[][]path,int step){
        if (r==maze.length-1 && c==maze[0].length-1){
            path[r][c]=step;
           for (int[]arr:path){
               System.out.println(Arrays.toString(arr));
           }
            System.out.println(ans);
            System.out.println();
            return ;
        }
        if (!maze[r][c]){
            return ;
        }

        maze[r][c]=false;
        path[r][c]=step;
        if (r<maze.length-1){
            allpathsprint(ans+'D',maze,r+1,c,path,step+1);
        }
        if (c< maze[0].length-1){
            allpathsprint(ans+'R',maze,r,c+1,path,step+1);
        }
        if (r>0){
            allpathsprint(ans+'U',maze,r-1,c,path,step+1);
        }
        if (c>0){
            allpathsprint(ans+'L',maze,r,c-1,path,step+1);

        }
        maze[r][c]=true;
        path[r][c]=0;
    }
}
