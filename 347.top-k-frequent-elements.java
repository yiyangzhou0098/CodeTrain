/*
 * @lc app=leetcode id=347 lang=java
 *
 * [347] Top K Frequent Elements
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> topK = new HashMap<>();
        
        for (int i: nums) {
            topK.putIfAbsent(i, 0);
            if (topK.get(i) != null) {
                topK.put(i, topK.get(i) + 1);
            }
        }

        int ret[] = new int[k];
        int max = 0;

        for (int j = 0; j < k; j++) {
            int flag = 0;
            for (Map.Entry<Integer, Integer> item : topK.entrySet()){
                if (item.getValue() > flag) {
                    flag = item.getValue();
                    max = item.getKey();
                }
            }
            topK.put(max, 0);
            ret[j] = max;
        }

        return ret;
    }
}
// @lc code=end

