/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    /**
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {

        String res = "";

        for(int i=0; i<=s.length(); i++){
            String s1 = palindrome(s, i, i);
            String s2 = palindrome(s, i, i+1);

            res = res.length() > s1.length() ? res : s1;
            res = res.length() > s2.length() ? res : s2;
        };

        return res;

}
        // s: origin string, l:left substring start from l, r: right substring start from r
        // if input same l and r means s is odd, else s is even
    private String palindrome(String s, int l, int r) {
        while (l >= 0 && r < s.length()
                && s.charAt(l) == s.charAt(r)) {
            // double pointer, start from both sides
            l--; r++;
        };
        // 返回以 s[l] 和 s[r] 为中心的最长回文串
        return s.substring(l + 1, r);    
    }
}
// @lc code=end

