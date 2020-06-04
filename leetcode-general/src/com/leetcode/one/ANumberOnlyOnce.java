package com.leetcode.one;


import java.util.HashSet;
import java.util.Set;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/11/28 13:49
 * @Description:
 */
public class ANumberOnlyOnce {

    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 2, 1};

//        set特性
//        Set<Integer> set = new HashSet<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            if (!set.add(nums[i]))
//                set.remove(nums[i]);
//        }
//        System.out.println(set.iterator().next());

        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num ^= nums[i];
        }
        System.out.println(num);
    }


}
