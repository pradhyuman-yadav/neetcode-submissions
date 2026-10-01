class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        if len(nums) == 1:
            return 1

        nums = sorted(nums)
        seen = {}
        max_so_far = 1
        max = 1

        for i in nums:
            if i-1 in seen:
                seen[i] = seen[i-1] + 1
            else:
                seen[i] = 1
        return sorted(seen.values())[-1]

        