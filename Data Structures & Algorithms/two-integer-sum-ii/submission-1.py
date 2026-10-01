class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        numbers[0] = target - numbers[0]
        for i in range(1, len(numbers)):
            if numbers[i] in numbers[0:i]:
                return [numbers[0:i].index(numbers[i])+1,i+1]
            numbers[i] = target - numbers[i]

        return[0, 0]
        