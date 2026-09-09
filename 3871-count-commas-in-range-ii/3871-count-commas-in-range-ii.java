class Solution {
    public long countCommas(long n) {
       long start=1000;
       long ans=0;
       while(n>=start){
        ans+=(n-start+1);
        start*=1000;
       }
    return ans;
    }
}