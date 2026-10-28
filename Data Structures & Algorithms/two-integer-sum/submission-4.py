class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        indices = []

        x = 0
        y = 1

        while x < len(nums):
            y = x + 1
            while y < len(nums):
                if nums[x] + nums[y] == target:
                    indices.append(x)
                    indices.append(y)
                    break
                y += 1
            if indices:
                break
            x += 1
        
        return indices