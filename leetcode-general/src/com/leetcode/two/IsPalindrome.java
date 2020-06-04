package com.leetcode.two;

import java.util.Scanner;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/11/29 14:56
 * @Description:
 */
public class IsPalindrome {
    public static void main(String args[]) {
        //input
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        //define
        int head = 0;
        int tail = s.length() - 1;

        while (head < tail) {
            char cHead = s.charAt(head);
            char cTail = s.charAt(tail);
            //judge
            if (!Character.isLetterOrDigit(cHead))
                head++;
            else if (!Character.isLetterOrDigit(cTail))
                tail--;
            else{
                if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail))
                    return;
                head++;
                tail--;
            }
        }
        System.out.println("11111111111111");
    }

}
