class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq= new int[26];
        int[] freq1= new int[26];
        if(s1.length()>s2.length()) return false;
        for(int i=0; i<s1.length(); i++){
            freq[s1.charAt(i)-'a']++;
        }
        for(int i=0; i<s1.length(); i++){
            freq1[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq, freq1)) return true;
        for(int i=s1.length(); i<s2.length(); i++){
            freq1[s2.charAt(i-s1.length())-'a']--;
            freq1[s2.charAt(i)-'a']++;
            if(Arrays.equals(freq, freq1)) return true;
        }
        return false;
    }
}