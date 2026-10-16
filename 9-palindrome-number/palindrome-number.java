class Solution 
{
    public boolean isPalindrome(int x) 
    {
        // Handle negative numbers and numbers ending in 0
        if (x < 0 || (x != 0 && x % 10 == 0)) 
        {
            return false;
        }

        int revertedNumber = 0;
        
        // Reverse the second half of the number
        while (x > revertedNumber) 
        {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // Check against both even and odd length palindromes
        return x == revertedNumber || x == revertedNumber / 10;
    }
}