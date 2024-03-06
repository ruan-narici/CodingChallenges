class Solution:
    def gcdOfStrings(self, str1: str, str2: str) -> str:
        isEqual = str1 + str2 in str2 + str1
        if not isEqual:
            return ''
        else:
            lenStr1, lenStr2 = len(str1), len(str2)
            if lenStr1 > lenStr2:
                return self.gcdOfStrings(str1[lenStr2:], str2)
            elif lenStr1 < lenStr2: 
                return self.gcdOfStrings(str1, str2[lenStr1:])
            else:
                return str1
