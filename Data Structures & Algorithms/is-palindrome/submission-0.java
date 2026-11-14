class Solution {
    public boolean isPalindrome(String s) {
        String s_nospace = s.replaceAll("\\s","");
        String s_stripped = s_nospace.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s_stripped);

        int l = 0;
        int r = s_stripped.length()-1;

        while(l<=r){
            char left = Character.toLowerCase(s_stripped.charAt(l));
            char right = Character.toLowerCase(s_stripped.charAt(r));
            if(left != right){
                System.out.printf("%s vs. %s", left, right);
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}
