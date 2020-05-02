package leetcode.Problem_27_Remove_Element;

class Solution {
    public int removeElement(int[] nums, int val) {
        int s = 0; // size
        int p = 0; // pointer
        while (p < nums.length) {
            if (nums[p] != val) {
                nums[s++] = nums[p++];
            } else {
                p++;
            }
        }
        return s;
    }
}

