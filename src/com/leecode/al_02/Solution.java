package com.leecode.al_02;

/**
 * https://leetcode-cn.com/problems/add-two-numbers/
 */
public class Solution {

    /**
     * 递归思想
     *
     * @param args
     */
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode first = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode second = new ListNode(5, new ListNode(6, new ListNode(4, null)));

        ListNode listNode = solution.addTwoNumbers(first, second);
        System.out.print(listNode.val + ",");
        while (listNode.next != null) {
            listNode = listNode.next;
            System.out.print(listNode.val + ",");
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return new ListNode(l2.val, l2.next);
        }
        if (l2 == null) {
            return new ListNode(l1.val, l1.next);
        }
        return null;
    }
}

class ListNode {
    int val;

    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}