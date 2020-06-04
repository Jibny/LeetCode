package com.leetcode.practice;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/11/29 17:23
 * @Description:
 */


//https://www.bilibili.com/video/av16544031/?spm_id_from=333.788.videocard.1

public class Test01 {
    public static int max(int num1, int num2) {
        if(num1>num2) {
            return num1;
        }
        else
            return num2;
    }
    public static void main(String[] args) {
        int prev[] = {0,0,0,0,1,0,2,3,5};
        int value[] = {0,5,1,8,4,6,3,2,4};

        int opt[] = new int[9];
        opt[0] = 0;
        for(int i = 1;i<9;i++) {
            opt[i] = max(value[i]+opt[prev[i]], opt[i-1]);
        }
        for(int i = 0;i<9;i++)
            System.out.println(opt[i]);


    }
}