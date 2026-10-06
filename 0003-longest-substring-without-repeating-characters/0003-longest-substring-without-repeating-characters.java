class Solution {
    public int lengthOfLongestSubstring(String s) {
        int r=0, l=0, max=0;
        char ch;
        HashMap<Character, Integer> map= new HashMap<>();
        for(r=0;  r<s.length(); r++){
            if(map.containsKey(s.charAt(r))){
                l=Math.max(l, map.get(s.charAt(r))+1);
            }
            map.put(s.charAt(r),r);
            max=Math.max(max, r-l+1);
            

        }
        return max;
    }
}