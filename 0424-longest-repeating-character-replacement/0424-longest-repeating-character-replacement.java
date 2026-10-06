class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int left=0, maxSize=0, ans=0;
        int[] freq= new int[26];
        for(int  i=0; i<n; i++){
            freq[s.charAt(i)-'A']++;
            maxSize=Math.max(maxSize,freq[s.charAt(i)-'A']);
            while((i-left+1)-maxSize>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            ans=Math.max(ans,i-left+1);
        }
        return ans;
    }
}