class Solution 
{
    public boolean isMonotonic(int[] nums) 
    {
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 1; i < nums.length; i++) 
        {
            if (nums[i] > nums[i - 1]) 
            {
                isDecreasing = false;
            } 
            else if (nums[i] < nums[i - 1]) 
            {
                isIncreasing = false;
            }

            // Early exit if the array breaks both monotonic conditions
            if (!isIncreasing && !isDecreasing) 
            {
                return false;
            }
        }

        return isIncreasing || isDecreasing;
    }
}