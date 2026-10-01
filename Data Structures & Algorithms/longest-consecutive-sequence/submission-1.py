class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if not nums:
            return 0

        nums = sorted(nums)
        seen = {}

        for i in nums:
            seen[i] = seen.get(i-1, 0) + 1
        return max(seen.values())

        