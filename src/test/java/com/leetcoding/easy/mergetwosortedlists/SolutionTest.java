package com.leetcoding.easy.mergetwosortedlists;

import com.leetcoding.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class SolutionTest {

    Solution objectUnderTest = new Solution();

    @Test
    public void example_1() {
        ListNode l1 = createListNode(new int[]{1, 2, 4});
        ListNode l2 = createListNode(new int[]{1, 3, 4});
        ListNode expectedResult = createListNode(new int[]{1, 1, 2, 3, 4, 4});

        ListNode result = objectUnderTest.mergeTwoLists(l1, l2);

        assertThat(result).usingRecursiveComparison().isEqualTo(expectedResult);

    }

    @Test
    public void example_2() {
        ListNode result = objectUnderTest.mergeTwoLists(null, null);

        assertThat(result).isNull();
    }
    private ListNode createListNode(int[] values) {
        ListNode next = null;
        for (int i = values.length - 1; i >= 0; i--) {
            ListNode cur = new ListNode(values[i]);
            cur.next = next;
            next = cur;
        }
        return next;
    }

}