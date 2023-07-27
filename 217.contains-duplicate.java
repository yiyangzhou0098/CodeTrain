/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start

import java.util.HashSet;
import java.util.concurrent.FutureTask;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> nums_set = new HashSet<Integer>();

        for(int i=0; i<nums.length; i++){
            if(nums_set.contains(nums[i])){
                return true;
            }else{
                nums_set.add(nums[i]);
            }
        }
        return false;


    }
}
// @lc code=end

