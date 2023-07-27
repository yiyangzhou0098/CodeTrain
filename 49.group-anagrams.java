/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

// 解法1:
// create a hashmap that the keys are elements of strs and 
// the values(值是一个列表，且列表包含26个元素，每个元素按顺序代表每个字母的出现次数)
// are lists contains 26 values. And each of the 26 values represents the occurrence of 26 letters

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // create hashmap that the keys are encoding numbers
        // and the values are the eles of the strs.
        HashMap<String, List<String>> codeToGroup = new HashMap<>();
// 解法2:
        for (String s: strs) {
            // encode every ele in strs
            String code = encode(s);
            // put eles that are same encoding results together
            codeToGroup.putIfAbsent(code, new LinkedList<>());
            codeToGroup.get(code).add(s);
        }

        List<List<String>> res = new LinkedList<>();
        for (List<String> group : codeToGroup.values()) {
            res.add(group);
        }
        return res;
    }
    String encode(String s) {
        char[] count = new char[26];
        for(char c : s.toCharArray()) {
            int d = c - 'a';
            count[d] ++;
        }
        return new String(count);
    }
}

//

// @lc code=end
