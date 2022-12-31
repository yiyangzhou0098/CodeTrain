/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String str = String.valueOf(x);
        byte[] array = str.getBytes();
        int len = array.length-1;
        System.out.println(array[0]);
        System.out.println(array[1]);
        for(int i=0; i<len/2; i++){
            
            if(array[i] != array[len]){
                
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

