class Solution {
    public int distinctSubseqII(String s) {
        int mod=1000000007;
        int n=s.length();
        long[] dp=new long[n+1];
        long[] last=new long[26];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            int index=s.charAt(i-1)-'a';
            dp[i]=(2*dp[i-1])%mod;
            dp[i]=(dp[i]-last[index]+mod)%mod;
            last[index]=dp[i-1];
        }
        return (int)((dp[n]-1+mod)%mod);
    }
}