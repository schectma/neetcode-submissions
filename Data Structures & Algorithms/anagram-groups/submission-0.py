class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        '''
        U: Identify anagrams and place them together in sublists.
        M: Dict/map
        P: Sort into buckets as we go. Use a dict with sorted str as keys.
        I:
        '''

        out = list()
        groups = dict()
        
        for string in strs:
            if str(sorted(string)) not in groups:
                groups[str(sorted(string))] = [string]
            else:
                groups[str(sorted(string))].append(string)


        for val in groups.values():
            out.append(val)

        return out