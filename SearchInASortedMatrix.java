
import java.util.Arrays;

public class SearchInASortedMatrix {
    // take middle column and perform binary search on it
    // if element == target return ans
    // if element > target ignore rows after it
    // if element < target ignore rows above it
    // bounds , rowStart = lowerbound, rowEnd = upperbound, midCol =
    // (colStart+colEnd)/2
    // in the end 2 rows are remaining, check whether target is present in midCol of
    // 2 rows
    // check whether the mid col u are at contains the target||ans
    // consider the 4 parts of the matrix
    // time complexity O(logn + logm)
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 }
        };
        System.out.println(Arrays.toString(search(arr, 22)));
    }

    // search in the row provided btween the col provided
    static int[] bs(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target)
                return new int[] { row, mid };
            if (matrix[row][mid] < target)
                cStart = mid + 1;
            else
                cEnd = mid - 1;
        }
        return new int[] { -1, -1 };
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;// matrix may be empty
        if (rows == 1)
            return bs(matrix, 0, 0, cols - 1, target);
        // run the loop till 2 rows are remaining
        int rStart = 0;
        int rEnd = rows - 1;
        int midCol = cols / 2;
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][midCol] == target)
                return new int[] { mid, midCol };
            if (matrix[mid][midCol] < target)
                rStart = mid;
            else
                rEnd = mid;
        }
        // now we have 2 rows
        // check whether the mid col u are at contains the target||ans
        if (matrix[rStart][midCol] == target)
            return new int[] { rStart, midCol };
        if (matrix[rStart + 1][midCol] == target)
            return new int[] { rStart + 1, midCol };
        // search in 1st half
        if (target <= matrix[rStart][midCol - 1])
            return bs(matrix, rStart, 0, midCol - 1, target);
        // search in 2nd half
        if (target >= matrix[rStart][midCol + 1] && target <= matrix[rStart][cols - 1])
            return bs(matrix, rStart, midCol + 1, cols - 1, target);
        // search in 3rd half
        if (target <= matrix[rStart + 1][midCol - 1])
            return bs(matrix, rStart + 1, 0, midCol - 1, target);
        // search in 4th half
        else
            return bs(matrix, rStart + 1, midCol + 1, cols - 1, target);
        // return new int[]{-1,-1};

    }
}
