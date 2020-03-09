package com.leetcoding.easy.mergetwosortedlists;

import com.leetcoding.util.ListNode;

public class Solution {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      ListNode next = new ListNode(-1);
      ListNode result = next;

      while (true) {
          if (l1 == null) {
              next.next = l2;
              break;
          } else if (l2 == null) {
              next.next = l1;
              break;
          } else {
              if (l1.val > l2.val) {
                  next.next = l2;
                  next = next.next;
                  l2 = l2.next;
              } else {
                  next.next = l1;
                  next = next.next;
                  l1 = l1.next;
              }
          }
      }

      return result.next;
  }
}
