class Solution {
    public int[] productExceptSelf(int[] nums) {
        int avoid = 0;
        int[] out = new int[nums.length];

        while(avoid < nums.length){
            int prod = 1;
            for(int i = 0; i < nums.length; i++){
                if(i == avoid){
                    continue;
                }
                prod *= nums[i];
            }

            out[avoid] = prod;
            avoid++;
        }
        return out;
    }
}  
