class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prod = 1
        for i in nums:
            prod *= i

        out = [1]*len(nums)
        for i in range(len(nums)):
            if nums[i] == 0:
                prod_at_zero = 1
                for j in range(len(nums)):
                    if i != j:
                        prod_at_zero*=nums[j]
                out[i] = prod_at_zero
            else:
                out[i] = int(prod/nums[i])
        return out
        