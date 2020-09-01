package leetcode.Problem_88_Merge_Sorted_Array;

import java.util.Arrays;

/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Sorted Array.
 * Memory Usage: 39.9 MB, less than 35.75% of Java online submissions for Merge Sorted Array.
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (m == 0) {
            if (n >= 0) System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }

        if (n == 0) return;

        int[] nums1copy = Arrays.copyOf(nums1, m);
        int rc = m + n - 1;
        m--;
        n--;
        for (int i = rc; i >= 0; i--) {

            if (m < 0) {
                nums1[i] = nums2[n];
                n--;
                continue;
            }

            if (n < 0) {
                nums1[i] = nums1copy[m];
                m--;
                continue;
            }

            int currM = nums1copy[m];
            int currN = nums2[n];


            if (currM > currN) {
                nums1[i] = currM;
                m--;
            } else {
                nums1[i] = currN;
                n--;
            }
        }
    }
}