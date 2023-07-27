/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start

import java.util.HashMap;

import javax.swing.text.html.parser.Element;

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();


        for(int i=0; i<s.length(); i++) {
            if(smap.get(s.charAt(i)) != null){
                smap.put(s.charAt(i), smap.get(s.charAt(i))+1 );
            }else{
                smap.put(s.charAt(i), 1);
            }
        }

        for(int i=0; i<t.length(); i++) {
            if(tmap.get(t.charAt(i)) != null){
                tmap.put(t.charAt(i), tmap.get(t.charAt(i))+1 );
            }else{
                tmap.put(t.charAt(i), 1);
            }
        }

        if(smap.equals(tmap)){
            return true;
        }else{
            return false;
        }
    }
}
// @lc code=end

