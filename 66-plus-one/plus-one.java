class Solution {
    public int[] plusOne(int[] digits) {
        
        for (int i = digits.length - 1; i >= 0; i--) {
            // digit betwwen 0 to 8
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            // if digit is 9 then initialize to zero
            digits[i] = 0;
        }
        
        // whole digit is 9 then 
        // increse the size by 1  
        int[] result = new int[digits.length + 1];
        result[0] = 1; // first place to 1 bcoz all 9 place number by adding one all places are zero and msb to 1
        
        return result;
    }
}