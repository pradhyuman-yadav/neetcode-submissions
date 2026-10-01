class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        comb = defaultdict(list)
        for i in strs:
            comb["".join(sorted(i))].append(i)
        
        result = []

        for key in comb.values():
            result.append(key)

        # print(result)

        return result