package com.leetcode.practice;


import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/12/3 21:18
 * @Description:
 */
public class SortedListToBST {

    private static ListNode pNode;

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        initListNode(head);
//      TreeNode treeNode = sortedArrayToBST(head);
//      TreeNode treeNode = sortedListToBST(head);
        TreeNode treeNode = sortedTreeToBST(head);
        prePrintTree(treeNode);
        System.out.println();
        midPrintTree(treeNode);
    }

    //中序遍历二叉树得到的就是从小到大的有序数组
    private static TreeNode sortedTreeToBST(ListNode head) {
        int size = findSize(head);
        pNode = head;
        return sortedTreeToBST(0, size - 1);
    }

    private static int findSize(ListNode head) {
        int size = 0;
        while (head != null) {
            head = head.next;
            size++;
        }
        return size;
    }

    private static TreeNode sortedTreeToBST(int start, int end) {
        if (start > end) return null;

        int mid = start + ((end - start) >> 1);
        //划分左右子树
        TreeNode left = sortedTreeToBST(start, mid - 1);

        TreeNode treeNode = new TreeNode(pNode.val);
        treeNode.left = left;

        pNode = pNode.next;

        TreeNode right = sortedTreeToBST(mid+1,end);
        treeNode.right = right;

        return treeNode;
    }



    //快慢指针
    private static TreeNode sortedListToBST(ListNode head) {
        return sortedListToBST(head, null);
    }


    private static TreeNode sortedListToBST(ListNode head, ListNode tail) {
        if (head == null || head == tail)
            return null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != tail && fast.next.next != tail) {
            fast = fast.next.next;
            slow = slow.next;
        }

        TreeNode treeNode = new TreeNode(slow.val);//根节点
        treeNode.left = sortedListToBST(head, slow);
        treeNode.right = sortedListToBST(slow.next, tail);

        return treeNode;
    }


    //转成数组，数组二分，递归构建中心节点
    private static TreeNode sortedArrayToBST(ListNode head) {
        List<Integer> arrayList = new ArrayList<>();
        ListNode p = head;
        while (p != null) {
            arrayList.add(p.val);
            p = p.next;
        }
        return sortedArrayToBST(arrayList, 0, arrayList.size());
    }

    private static TreeNode sortedArrayToBST(List<Integer> arr, int left, int right) {
        if (left == right) return null;
        int mid = (left + right) >>> 1;
        TreeNode treeNode = new TreeNode(arr.get(mid));
        treeNode.left = sortedArrayToBST(arr, left, mid);
        treeNode.right = sortedArrayToBST(arr, mid + 1, right);
        return treeNode;
    }


    //初始化

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    //前序打印
    public static void prePrintTree(TreeNode binTree) {
        if (binTree != null) {
            System.out.println(binTree.val);
            prePrintTree(binTree.left);
            prePrintTree(binTree.right);
        }
    }

    //中序打印
    public static void midPrintTree(TreeNode binTree) {
        if (binTree != null) {
            prePrintTree(binTree.left);
            System.out.println(binTree.val);
            prePrintTree(binTree.right);
        }
    }

    public static ListNode initListNode(ListNode head) {
        ListNode p = head;
        p.val = -10;
        p.next = new ListNode(-3);
        p = p.next;
        p.next = new ListNode(0);
        p = p.next;
        p.next = new ListNode(5);
        p = p.next;
        p.next = new ListNode(9);
        p = p.next;
        p.next = null;
        return head;
    }

}
