package com.leetcode;

import java.util.Arrays;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/11/30 20:12
 * @Description:
 */
public class QuickSort {

    private static int count;

    private static void QuickSort(int[] num, int left, int right) {
        if (left >= right)
            return;
        int i = left;
        int j = right;
        int key = num[left];
        while (i < j) {
            if (num[j] >= key && i < j)
                j--;
            else if (num[i] <= key && i < j)
                i++;
            else {
                num[i] ^= num[j];
                num[j] ^= num[i];
                num[i] ^= num[j];
            }
        }
        num[left] = num[i];
        num[i] = key;
        count++;
        QuickSort(num, left, i - 1);
        QuickSort(num, i + 1, right);
    }

    public static void main(String[] args) {
        int[] num = {45, 3, 78, 64, 52, 11, 64, 55, 99, 11, 18};
        System.out.println(Arrays.toString(num));
        QuickSort(num, 0, num.length - 1);
        System.out.println(Arrays.toString(num));
        System.out.println("数组个数：" + num.length);
        System.out.println("循环次数：" + count);

    }

}
