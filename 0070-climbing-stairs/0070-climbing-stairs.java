class Solution {
    public int climbStairs(int n) {
        if(n<=3) return n;
        int prev1=3;
        int prev2=2;
        int c=0;
        for(int i=3; i<n; i++){
            c=prev2+prev1;
            prev2=prev1;
            prev1=c;
        }
        return c;
    }
}