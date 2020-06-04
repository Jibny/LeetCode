package com.leetcode.one;

import java.util.Arrays;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/11/28 16:24
 * @Description:
 */
public class Merge {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {4, 5, 6};
        int m = 3;
        int n = 3;

        int capacity = m-- + n--;
        while (--capacity >= 0 && m >= 0 && n >= 0) {
            if (nums1[m] >= nums2[n])
                nums1[capacity] = nums1[m--];
            else
                nums1[capacity] = nums2[n--];
        }
        while (m >= 0)
            nums1[capacity--] = nums1[m--];

        while (n >= 0)
            nums1[capacity--] = nums2[n--];

        System.out.println(Arrays.toString(nums1));
    }
}
