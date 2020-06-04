package com.leetcode.practice;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/11/29 17:56
 * @Description:
 */
public class MyTest02 {

    public static int recOpt(int[] arr, int i) {
        if (i == 0) return arr[0];
        else if (i == 1) return arr[0] > arr[1] ? arr[0] : arr[1];
        else
            return recOpt(arr, i - 2) + arr[i] > recOpt(arr, i - 1) ?
                    recOpt(arr, i - 2) + arr[i] : recOpt(arr, i - 1);
    }
    public static int dpOpt(int[] arr) {
        int[] opt = new int[arr.length];
        opt[0] = arr[0];
        opt[1] = arr[1] > arr[0] ? arr[1] : arr[0];
        for (int i = 2; i < arr.length; i++) {
            opt[i] = opt[i - 1] > opt[i - 2] + arr[i] ? opt[i - 1] : opt[i - 2] + arr[i];
        }
        return opt[arr.length - 1];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 1, 7, 8, 3};
        System.out.println(recOpt(arr, arr.length - 1));
        System.out.println(dpOpt(arr));
    }
}
