class Solution:
    def isValid(self, s: str) -> bool:
        valid = {")":"(", "}":"{", "]":"["}
        stack = []
        for i in s:
            if i in valid.keys():
                if len(stack)==0 or stack.pop() != valid[i]:
                    return False
            else:
                stack.append(i)

        if len(stack) != 0:
            return False

        return True
        