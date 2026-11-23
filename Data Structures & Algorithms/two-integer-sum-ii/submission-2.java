class Solution {
    public int[] twoSum(int[] numbers, int target) {
        /*  Get 1-idx'd indices of two vals that add to target.
        *   Single-ptr shrinking window.
        *   Subtract leftmost val from tgt, then attempt to do the same
        *   with each thereafter. Take the index of whichever first results
        *   in zero (and isn't the same as the first val).
        */
        int[] out = new int[2];
        int tgt;
        outerloop:
        for(int i = 0; i < numbers.length; i++){
            tgt = target - numbers[i];
            out[0] = i+1;
            for(int j = i+1; j < numbers.length; j++){
                if (numbers[j] == 0){
                    continue;
                }
                if (tgt - numbers[j] == 0){
                    out[1] = j+1;
                    break outerloop;
                }
            }
        }
        return out;
    }
}
