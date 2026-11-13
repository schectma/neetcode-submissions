class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        tally = dict()

        for num in nums:
            if num not in tally:
                tally[num] = 1
            else:
                tally[num] += 1
        
        tally_tuples = list()
        for key, freq in tally.items():
            tally_tuples.append((freq, key))
        
        out = list()
        for i in range(len(tally_tuples)-k, len(tally_tuples)):
            out.append(tally_tuples[i][1])

        return out