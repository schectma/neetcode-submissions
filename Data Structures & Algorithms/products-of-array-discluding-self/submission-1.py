class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # Typecast output as long long int
        '''
        [-1,0,1,0,3] 
        Can just make output 0s if more than one zero in input arr
        '''
        zero_count = 0;
        full_product = 1
        for i in range(len(nums)):
            if nums[i] != 0:
                full_product *= nums[i]
            else:
                zero_count+=1

        out = [0]*len(nums)

        if zero_count >= 2:
            return out

        for i in range(len(nums)):
            if nums[i] != 0:
                if zero_count > 0:
                    out[i] = 0
                else:
                    out[i] = full_product//nums[i]
            else:
                out[i] = full_product
        
        return out