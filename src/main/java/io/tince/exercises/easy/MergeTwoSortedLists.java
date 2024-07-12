package io.tince.exercises.easy;

import java.util.List;

/**
 * Merge Two Sorted Lists
 * <p>
 * You are given the heads of two sorted linked lists "list1" and "list2".
 * <p>
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Return the head of the merged linked list
 * <p>
 * Example 1:
 * Input: list1 = [1, 2, 4], list2 = [1, 3, 4]
 * Output: [1, 1, 2, 3, 4, 4]
 * <p>
 * Example 2:
 * Input: list1 = [], list2 = []
 * Output: []
 * <p>
 * Example 3:
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 * <p>
 * Constraints:
 * - The number of nodes in both lists is in the range [0, 50].
 * - -100 <= Node.val <= 100
 * - Both list1 and list2 are sorted in non-decreasing order.
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode resultListNode = new ListNode(0);
        ListNode ans = resultListNode;
        while (list1 != null && list2 != null) {
            if (list1.val >= list2.val) {
                resultListNode.next = list2;
                list2 = list2.next;
            } else {
                resultListNode.next = list1;
                list1 = list1.next;
            }
            resultListNode = resultListNode.next;
        }
        if (list1 != null) {
            resultListNode.next = list1;
        }
        if (list2 != null) {
            resultListNode.next = list2;
        }
        return ans.next;
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
}
