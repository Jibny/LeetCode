package com.leetcode.practice;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/11/29 22:02
 * @Description:
 */
public class MyTest03 {
    public static boolean recSubset(int[] arr, int i, int target) {
        if (target == 0) return true;
        else if (i == 0)
            return target == arr[0];
        else if (arr[i] > target)
            return recSubset(arr, i - 1, target);
        else {
            boolean A = recSubset(arr, i - 1, target - arr[i]);
            boolean B = recSubset(arr, i - 1, target);
            return (A || B);
        }
    }

    public static boolean dpSubset(int[] arr, int target) {
        boolean[][] subsets = new boolean[arr.length][target + 1];

        for (int i = 0; i < target + 1; i++)
            subsets[0][i] = false;
        for (int i = 0; i < arr.length; i++)
            subsets[i][0] = true;
        if (target >= arr[0])
            subsets[0][arr[0]] = true;
        for (int i = 1; i < arr.length; i++) {
            for (int s = 0; s < target + 1; s++) {
                if (arr[i] > s) {
                    subsets[i][s] = subsets[i - 1][s];
                } else {
                    boolean A = subsets[i - 1][s - arr[i]];
                    boolean B = subsets[i - 1][s];
                    subsets[i][s] = A || B;
                }
            }
        }
        return subsets[arr.length - 1][target];
    }

    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        System.out.println(recSubset(arr, arr.length - 1, 9));
        System.out.println(dpSubset(arr, 9));
        System.out.println(dpSubset(arr, 10));
        System.out.println(dpSubset(arr, 11));
        System.out.println(dpSubset(arr, 12));
        System.out.println(dpSubset(arr, 13));
    }
}
