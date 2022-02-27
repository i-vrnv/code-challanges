package leetcode.archive.Problem_347_Top_K_Frequent_Elements;

import java.util.*;

class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == k) {
            return nums;
        }

        Map<Integer, Integer> counts = new HashMap<>();

        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        Queue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(counts::get));

        for (Integer n : counts.keySet()) {
            heap.add(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        int[] top = new int[k];

        for (int i = k - 1; i >= 0; --i) {
            top[i] = heap.poll();
        }

        return top;
    }
}