class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
       if(p.length()>s.length()) return ans;
       int[] countP= new int[26];
       int[] countW= new int[26];
       for(char ch:p.toCharArray()) countP[ch-'a']++;
       int winSize=p.length();
       for(int i=0; i<winSize; i++) countW[s.charAt(i)-'a']++;
       if(Arrays.equals(countP, countW)) ans.add(0);
       for(int i=winSize; i<s.length(); i++){
            countW[s.charAt(i)-'a']++;
            countW[s.charAt(i-winSize)-'a']--;
            if(Arrays.equals(countP, countW)) ans.add(i-winSize+1);
       }
    return ans;
   }
}