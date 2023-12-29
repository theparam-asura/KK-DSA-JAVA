import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
            int [][]array={
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
            };
        System.out.println(Arrays.toString(sortedmatrix(array,9)));
    }

    static int[] binarysearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart < cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[cStart][mid] == target) {                                     //{1,2,3,4,5}
                return new int[]{cStart, mid};
            }
            if (matrix[cStart][mid] < target) {
                cEnd = mid - 1;
            }
            if (matrix[cStart][mid] > target) {
                cStart = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] sortedmatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (rows == 1) {
            return binarysearch(matrix, 0, 0, cols - 1, target);
        }
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }
        //
        //
        if (target >= matrix[rStart][cMid-1]) {
            return binarysearch(matrix,rStart,0,cMid-1,target);
        }
        if (target >= matrix[rStart][cMid + 1]&& target<=matrix[rStart][cols-1]) {
             return binarysearch(matrix,rStart,cMid+1,cols-1,target);
        }
        if (target > matrix[rStart+1][cMid-1]) {
            return binarysearch(matrix,rStart+1,0,cMid-1,target);
        } else {
            return binarysearch(matrix,rStart+1,cMid+1,cols-1,target);
        }
    }
}












//    static int[] binarysearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
//        while (cStart < cEnd) {
//            int mid = cStart + (cEnd - cStart) / 2;
//            if (matrix[row][mid] == target) {
//                return new int[]{row, mid};
//            }
//            if (matrix[row][mid] < target) {
//                cStart = mid + 1;
//            } else {
//                cEnd = mid + 1;
//            }
//        }
//        return new int[]{-1, -1};
//
//    }

//    static int[] search(int[][] matrix, int target) {
//        int rows = matrix.length;
//        int cols = matrix[0].length;
//        if (rows == 1) {
//            return binarysearch(matrix, 0, 0,cols - 1, target);
//        }
//        int rStart = 0;
//        int rEnd = rows - 1;
//        int cmid = cols / 2;
//        while (rStart < (rEnd - 1)) {
//            int mid = rStart + (rEnd - rStart) / 2;
//            if (matrix[mid][cmid] == target) {
//                return new int[]{mid, cmid};
//            }
//            if (matrix[cmid][cmid] < target) {
//                rStart = mid;
//            } else {
//                rEnd = mid;
//            }
//        }
//
//        if (matrix[rStart][cmid] == target) {
//            return new int[]{rStart, cmid};
//        }
//        if (matrix[rStart + 1][cmid] == target) {
//            return new int[]{rStart + 1, cmid};
//
//        }
//        return new int[]{1,1};
