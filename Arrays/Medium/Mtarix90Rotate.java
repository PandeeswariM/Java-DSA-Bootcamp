package Arrays.Medium;

import java.util.Arrays;

public class Mtarix90Rotate {
    static void rotate(int matrix[][]) {
        // Code Here
        // Step 1: Transpose the matrix
            for (int i = 0; i < matrix.length; i++) {
                for (int j = i; j< matrix[i].length; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

        // Step 2: Reverse each row
        for (int i = 0; i < matrix.length; i++) {
            int left = 0, right = matrix[i].length - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};  // 7 4 1, 8 5 2 , 9 6 3
        rotate(arr);
        System.out.println(Arrays.deepToString(arr));
    }
}
