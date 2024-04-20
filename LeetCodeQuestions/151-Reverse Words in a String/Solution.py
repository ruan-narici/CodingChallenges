class Solution:
    def reverseWords(self, s: str) -> str:
        s = s.strip()
        s = s.split(' ')
        s.reverse()
        s = [l for l in s if not l == '']
        return ' '.join(s)
    