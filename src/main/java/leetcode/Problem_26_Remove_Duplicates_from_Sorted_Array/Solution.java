package leetcode.Problem_26_Remove_Duplicates_from_Sorted_Array;

public class Solution {
    public int removeDuplicates(int[] nums) {

        int head = 0;
        int pointer = 1;
        while(pointer < nums.length) {

            int num = nums[head];
            int nextNum = nums[pointer];
            if (nextNum == num) {
                pointer++;
            } else {
                nums[++head] = nums[pointer++];
            }
        }

        return head + 1;
    }
}

