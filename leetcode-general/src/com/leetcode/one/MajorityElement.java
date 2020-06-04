package com.leetcode.one;

import java.util.Arrays;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/11/28 14:23
 * @Description:
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
//        Arrays.sort(nums);
//        System.out.println(nums.length/2);

        int index = 1;
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (temp == nums[i]) {
                index++;
            } else
                index--;
            if (index == 0) {
                temp = nums[i];
                index = 1;
            }
        }
        System.out.println(temp);
    }
}
