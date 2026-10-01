class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}
        for i, num in enumerate(nums):
            # print(seen)
            if num in seen:
                return [seen.get(num), i]
            seen[target - num] = i
        
        return []
        