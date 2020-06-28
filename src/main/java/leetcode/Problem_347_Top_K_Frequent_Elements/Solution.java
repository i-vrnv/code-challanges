package leetcode.Problem_347_Top_K_Frequent_Elements;

import leetcode.Problem_347_Top_K_Frequent_Elements.Solution.PrioritizedElement;

import java.util.Objects;
import java.util.PriorityQueue;

class Solution {

    class PrioritizedElement {
        int value;
        int count;


        public PrioritizedElement(int value, int count) {
            this.value = value;
            this.count = count;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PrioritizedElement that = (PrioritizedElement) o;
            return this.value == that.value;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<PrioritizedElement> pq = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            PrioritizedElement(nums[i])

        }
    }
}