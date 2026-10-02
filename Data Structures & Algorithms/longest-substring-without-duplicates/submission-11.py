class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s) == 0 or len(s)==1:
            return len(s)
        start = 0
        end = 0
        maxL = 0
        seen = {}

        for i in range(0, len(s)):
            if s[i] in seen and seen[s[i]] >= start:
                start = seen[s[i]]+1
            seen[s[i]] = i

            maxL = max(maxL, i-start+1)

        return maxL
            
        