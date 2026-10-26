class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return " ";
        
        int start = 0;
        int end = 0;
        
        for (int i = 0; i < s.length(); i++) {
            
            int len1 = expandAroundCenter(s, i, i);
            // Check for even-length palindromes 
            int len2 = expandAroundCenter(s, i, i + 1);
            
            int len = Math.max(len1, len2);
            
            // If we found a longer palindrome, update the bounds
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        
        return s.substring(start, end + 1);
    }
    
    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return length of the palindrome found
        return right - left - 1;
    }
}