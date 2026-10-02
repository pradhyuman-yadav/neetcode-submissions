class Solution:
    def isValid(self, s: str) -> bool:
        if len(s)==0:
            return True
        if len(s)%2!=0:
            return False
        valid = {']':'[', '}':'{', ')':'('}
        stack = []
        for b in s:
            if b in ('[', '{', '('):
                stack.append(b)
            else:
                if len(stack) == 0:
                    return False
                pop = stack.pop()
                # print(b)
                # print(valid.get(b))
                if pop != valid.get(b):
                    return False
        if len(stack) != 0:
                    return False
        return True
        