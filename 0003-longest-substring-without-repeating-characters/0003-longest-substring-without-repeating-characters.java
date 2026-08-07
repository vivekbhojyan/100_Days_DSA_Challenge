class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxm=0, count=0;
        HashSet<Character> set= new HashSet<>();
        for(int i=0; i<s.length(); i++)
            {
                while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(count));
                    count++;
                }
            
            set.add(s.charAt(i));
            maxm=Math.max(maxm,i-count+1);
        }
        return maxm;
    }
}