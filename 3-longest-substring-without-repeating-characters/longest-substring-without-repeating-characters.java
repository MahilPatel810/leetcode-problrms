class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int start = 0; // left boundary of sliding window

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);

            // If character already seen, move start pointer
            if (map.containsKey(c)) {
                // Ensure start only moves forward
                start = Math.max(start, map.get(c) + 1);
            }

            // Update last seen index of current char
            map.put(c, end);

            // Update max length
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }
}