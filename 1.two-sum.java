/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> nums_m = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            nums_m.put(nums[i], i);
        }

        for(int i=0; i<nums.length; i++){
            int minus = target - nums[i];
            if(nums_m.get(minus) != null && nums_m.get(minus) != i){
                return new int[] {i, nums_m.get(minus)};
            }
        }
        return null;

    }
}
// @lc code=end

