class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        while len(stones)>1:
            fighter1 = max(stones)
            stones.remove(fighter1)
            fighter2 = max(stones)
            stones.remove(fighter2)

            stones.append(fighter1 - fighter2)

        return stones[0]