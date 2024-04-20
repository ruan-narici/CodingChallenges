class Solution:
    def reverseVowels(self, s: str) -> str:
        vowels_list = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']
        reverse_vowels_list = []
        index_to_access_reverse_list = 0
        new_letter = ''
        for letter in s:
            if letter in vowels_list:
                reverse_vowels_list.append(letter)
        reverse_vowels_list.reverse()
        for letter in s:
            if not letter in vowels_list:
                new_letter += letter
            if letter in vowels_list:
                new_letter += reverse_vowels_list[index_to_access_reverse_list]
                index_to_access_reverse_list+=1
        return new_letter