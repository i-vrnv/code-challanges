package leetcode.Problem_57_Insert_Interval;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        int[] toAddInterval = newInterval;

        for (int i = 0; i < intervals.length; i++) {
            // 1. No overlap and toAddInterval appears before current interval, add toAddInterval to result.
            if (intervals[i][0] > toAddInterval[1]) {
                ans.add(toAddInterval);
                toAddInterval = intervals[i];
            }
            // 2. Has overlap, update the toAddInterval to the merged interval.
            else if (intervals[i][1] >= toAddInterval[0]) {
                toAddInterval = new int[]{Math.min(intervals[i][0], toAddInterval[0]), Math.max(intervals[i][1], toAddInterval[1])};
            }
            //3. No overlap and toAddInterval appears after current interval, add current interval to result.
            else ans.add(intervals[i]);
        }
        ans.add(toAddInterval);
        return ans.toArray(new int[ans.size()][2]);
    }
}
