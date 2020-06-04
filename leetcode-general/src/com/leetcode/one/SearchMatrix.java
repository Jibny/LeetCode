package com.leetcode.one;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/11/28 15:32
 * @Description:
 */
public class SearchMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 26;

//        System.out.println(matrix[0].length);
//        System.out.println(matrix.length);
        int row = matrix.length;
        int col = matrix[0].length;
        int i = 0;
        int j = col - 1;
        while (i < row && j >= 0) {
//            System.out.println(matrix[i++][j--]);
            if (target == matrix[i][j]){
                System.out.println("1111111");
                return;
            }
            else if (target > matrix[i][j])
                i++;
            else
                j--;
        }
        System.out.println("0000");
    }
}
