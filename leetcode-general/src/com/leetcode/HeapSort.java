package com.leetcode;

import java.util.Arrays;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/11/30 20:36
 * @Description:
 */
public class HeapSort {
    private static int count;

    //    1.调整堆
    public static void heapify(int[] tree, int n, int i) {
        if (i >= n)
            return;
        count++;
        int right = (i << 1) + 1;
        int left = (i << 1) + 2;
        int max = i;
        if (left < n && tree[left] > tree[max]) {
            max = left;
        }
        if (right < n && tree[right] > tree[max]) {
            max = right;
        }
        if (max != i) {
            swap(tree, i, max);
            heapify(tree, n, max);
        }
    }

    //    2.构建堆，从后往前调整堆
    public static void buildHeap(int[] tree, int n) {
        int lastNode = n - 1;
        int parent = (lastNode - 1) >> 1;
        int i = parent;
        for (i = parent; i >= 0; i--) {
            heapify(tree, n, i);
        }
    }

    //    3.交换堆顶和末尾元素
    public static void heapSort(int[] tree, int n) {
        buildHeap(tree, n);
        int i;
        for (i = n - 1; i >= 0; i--) {
            swap(tree, i, 0);
            heapify(tree, i, 0);
        }
    }

    public static void swap(int[] tree, int A, int B) {
        tree[A] ^= tree[B];
        tree[B] ^= tree[A];
        tree[A] ^= tree[B];
    }


    public static void main(String[] args) {
        int[] tree = {2, 5, 3, 1, 10, 4};
        heapSort(tree, tree.length);
        System.out.println(Arrays.toString(tree));
        System.out.println("循环次数：" + count);
    }
}
