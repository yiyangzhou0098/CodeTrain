import java.util.HashMap;
import java.util.Hashtable;

/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> window = new HashMap<Character,Integer>();
        // 2 start point. left start at 0, right start at 0 
        int left = 0, right = 0; 
        int res = 0; // 结果

        // right point extend while not going at the end
        while(right < s.length()){
            // get the character of s in index right
            char c = s.charAt(right);
            right ++;
            
            // if c not in window then ++, else add c into
            if(window.get(c) != null){
                window.put(c, window.get(c) + 1);
            }else{
                window.put(c, 1);
            }
            
            // if any count of char > 1, stop right from extending
            // and make every count of char minus 1.
            // Until left coinside with right, and count of this char is 1.
            while( window.get(c) > 1){
                char d = s.charAt(left);
                left ++;
                window.put(d, window.get(d) - 1);
            }

            // get the longest substring
            res = Math.max(res, right - left);
        }
        return res;
    }
}
// @lc code=end

