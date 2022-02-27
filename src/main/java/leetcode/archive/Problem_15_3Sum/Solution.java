package leetcode.archive.Problem_15_3Sum;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> res = new LinkedList<>();

        for (int i = 0; i <= nums.length - 2; i++) {

            if (i == 0 || nums[i] > nums[i - 1]) {
                int start = i + 1;
                int end = nums.length - 1;

                while (start < end) {

                    int sum = nums[i] + nums[start] + nums[end];
                    if (sum == 0) {
                        res.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    }

                    if ( sum < 0 ) {
                        int currentStart = start;
                        while (nums[currentStart] == nums[start] && start < end) {
                            start++;
                        }
                    } else {
                        int currentEnd = end;
                        while (nums[currentEnd] == nums[end] && start < end) {
                            end--;
                        }
                    }
                }
            }
        }
        return res;
    }
}