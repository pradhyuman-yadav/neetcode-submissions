class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        counter = Counter(nums)
        counter = sorted(counter.items(), key=lambda item:item[1], reverse=True)
        # print (counter)

        out = []
        for i in range(0, k):
            out.append(counter[i][0])

        return out