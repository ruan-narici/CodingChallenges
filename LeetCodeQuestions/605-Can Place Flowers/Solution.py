class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        def plant(position):
            flowerbed[position] = 1

        if n == 0 or flowerbed[0] == 0 and len(flowerbed) == 1:
            return True
        if flowerbed[0] == 1 and len(flowerbed) == 1:
            return False
        for index in range(len(flowerbed)):
            is_first_plot = index == 0
            is_last_plot = index == len(flowerbed) - 1
            no_is_last_plot = index < len(flowerbed) - 1
            no_flower_in_middle = flowerbed[index] == 0
            no_flower_before = flowerbed[index - 1] == 0
            if no_is_last_plot:
                no_flower_after = flowerbed[index + 1] == 0 
            if is_first_plot and no_flower_after and no_flower_in_middle:
                plant(index)
                n = n - 1
            elif no_flower_before and no_flower_in_middle and no_is_last_plot and no_flower_after:
                plant(index)
                n = n - 1
            elif is_last_plot and no_flower_before and no_flower_in_middle:
                plant(index)
                n = n - 1    
            if n == 0:
                return True
