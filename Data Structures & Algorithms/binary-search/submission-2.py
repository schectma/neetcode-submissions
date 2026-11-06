class Solution:
    def search(self, nums: List[int], target: int) -> int:
        '''
        U: find index of target val in given list.
        M: two-pointer, sliding window
        P: binary search: defining left, right, and mid points, continuously shrinking and closing in on the target value based on cardinality of midpoint.
        I:
        '''
        if not nums:
            return -1

        left = 0
        right = len(nums) - 1
        mid = (right + left) // 2

        while left < right:
            if target == nums[mid]:
                return mid

            elif target < nums[mid]:
                right = mid - 1

            elif target > nums[mid]:
                left = mid + 1
            
            mid = (right + left) // 2

        return -1
