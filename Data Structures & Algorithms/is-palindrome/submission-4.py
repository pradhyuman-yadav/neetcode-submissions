class Solution:
    def isPalindrome(self, s: str) -> bool:
        start = 0
        last =  len(s)-1

        while start < last:
            startChar = s[start]
            lastChar = s[last]

            while not startChar.isalnum() and start<last:
                start +=1
                startChar = s[start]

            while not lastChar.isalnum() and start<last:
                last -=1
                lastChar = s[last]

            if startChar.lower() != lastChar.lower():
                return False

            start +=1
            last -=1
        
        return True
        