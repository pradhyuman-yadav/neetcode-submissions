class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}
        for i, num in enumerate(nums):
            # print(seen)
            if seen.get(num) is not None:
                return [seen.get(num), i]
            seen[target - num] = i
        
        return [0, 0]
        