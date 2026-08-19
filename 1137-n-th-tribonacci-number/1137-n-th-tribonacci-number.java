class Solution {
    public int tribonacci(int n) {
        int f=0, s=1, t=1;
        while(n-->0){
            int fourth=f+s+t;
            f=s;
            s=t;
            t=fourth;
        }
        return f;
    }
}