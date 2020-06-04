package com.leetcode.one;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/11/29 16:09
 * @Description:
 */
public class SuperEggDrop {
    public static void main(String[] args) {
        int eggNum = 2;
        int floorNum = 6;

        int targetFloor = 0;

        // eggNum表示鸡蛋数,floorNum表示楼层数
        if (eggNum == 0)
            targetFloor = 0;
        if (eggNum == 1)
            floorNum = floorNum;

        int[][] dp = new int[floorNum + 1][eggNum + 1];
        dp[0][0] = 0;

        for (int i = 0; i < floorNum; i++) {
            dp[i][0] = 0;
            for (int j = 0; j < eggNum; j++) {
                //鸡蛋碎 鸡蛋不碎
                dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1] + 1;
                if(dp[i][j] >= floorNum){
                    targetFloor=i;
                    System.out.println(targetFloor);
                    break;
                }
            }
        }

        targetFloor = floorNum;
        System.out.println(targetFloor);
    }
}
