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

        ListNode first =
//                new ListNode(2, new ListNode(4, new ListNode(3, null)));
                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, null)))))));
        ListNode second =
//                new ListNode(5, new ListNode(6, new ListNode(4, null)));
                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, null))));

        ListNode listNode = solution.addTwoNumbers(first, second);
        System.out.print(listNode.val + ",");
        while (listNode.next != null) {
            listNode = listNode.next;
            System.out.print(listNode.val + ",");
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return getNode(l1, l2, false);
    }

    private ListNode getNode(ListNode l1, ListNode l2, boolean more) {
        if (l2 == null && l1 == null && more) {
            return new ListNode(1, null);
        }
        if (l2 == null) {
            if (more) {
                return getNode(l1, new ListNode(1, null), false);
            } else {
                return l1;
            }
        } else if (l1 == null) {
            if (more) {
                return getNode(new ListNode(1, null), l2, false);
            } else {
                return l2;
            }
        }
        int i = l1.val + l2.val + (more ? 1 : 0);
        return new ListNode(i % 10, getNode(l1.next, l2.next, i >= 10));
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