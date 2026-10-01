import heapq
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = heapq.nlargest(k, Counter(nums).items(), key=lambda x:x[1])
        out = []
        for x, y in count:
            out.append(x)
        return out