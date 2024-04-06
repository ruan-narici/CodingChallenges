class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        best_list = []
        for candie in candies:
            if candie + extraCandies >= max(candies):
                best_list.append(True)
            else:
                best_list.append(False)
        return best_list