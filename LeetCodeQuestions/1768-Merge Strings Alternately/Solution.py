class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        quantidade_primeira_letra = len(word1)
        quantidade_segunda_letra = len(word2)
        letra_completa = ""

        index_primeira_letra = 0
        index_segunda_letra = 0

        while (index_primeira_letra < quantidade_primeira_letra or 
        index_segunda_letra < quantidade_segunda_letra):
            if index_primeira_letra < quantidade_primeira_letra:
                letra_completa += word1[index_primeira_letra]
                index_primeira_letra += 1
            if index_segunda_letra < quantidade_segunda_letra:
                letra_completa += word2[index_segunda_letra]
                index_segunda_letra += 1
        return letra_completa

