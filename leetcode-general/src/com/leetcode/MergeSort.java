package com.leetcode;

import java.util.Arrays;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/12/2 00:42
 * @Description:
 */
public class MergeSort {

    //排序方法
    private static void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    //分割数组
    private static void mergeSort(int[] arr, int left, int right) {
        if (left == right) //left == right即左边等于右边
            return;
        int mid = (left + right) >> 1;
        mergeSort(arr, left, mid); //通过递归调用自己right 中传入 mid，将数组不断/2直到左边等于右边返回
        mergeSort(arr, mid + 1, right); //左半边处理完毕后同理处理右半边
        merge(arr, left, mid, right);   //第一次归并merge(arr, 0, 0, 1),归并left到mid，mid+1到right两个数组
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = 0;
        int p1 = left;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= right)
            temp[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        while (p1 <= mid)
            temp[i++] = arr[p1++];
        while (p2 <= right)
            temp[i++] = arr[p2++];
        for (i = 0; i < temp.length; i++) {
            arr[left + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 3, 1, 10, 4, 6, 9};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

}
