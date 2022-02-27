package leetcode.archive.Problem_207_Course_Schedule;

import java.util.*;

/**
 * Runtime: 5 ms, faster than 68.24% of Java online submissions for Course Schedule.
 * Memory Usage: 39.9 MB, less than 100.00% of Java online submissions for Course Schedule.
 */
class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        int[] indegree = new int[numCourses];

        for (int[] pr : prerequisites) {
            List<Integer> l = adj.getOrDefault(pr[1], new ArrayList<Integer>());
            l.add(pr[0]);
            indegree[pr[0]]++;
            adj.put(pr[1],l);
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) { q.add(i); }
        }

        int count = 0;

        while(!q.isEmpty()) {
            int curr = q.poll();
            count++;
            if (!adj.containsKey(curr)) { continue; }

            for (int nb : adj.get(curr)) {
                indegree[nb]--;
                if (indegree[nb] == 0) { q.add(nb); }
            }
        }
        return count == numCourses;
    }
}