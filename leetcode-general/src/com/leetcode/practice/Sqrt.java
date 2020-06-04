package com.leetcode.practice;

import java.util.Scanner;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/12/3 20:56
 * @Description:
 */
public class Sqrt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(mySqrt2(input));
    }

    //暴力
    private static int mySqrt(int x) {
        if (x <= 1) return x;
        for (int i = 2; i <= x; i++)
            if (i > x / i)
                return i - 1;
        return -1;
    }

    //二分法
    private static int mySqrt1(int x) {
        if (x <= 1) return x;
        int left = 0, right = x;
        while (left <= right) {
            int mid = (right + left) >>> 1;
            if (mid > x / mid)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return right;
    }

    //牛顿法
    public static int mySqrt2(int x) {
        int res = x;
        while (res > x / res) {
            res = (res + x / res) / 2;
        }
        return res;
    }

}
