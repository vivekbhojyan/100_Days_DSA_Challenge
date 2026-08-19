class Solution {
    public int fib(int n) {
        if(n==1) return 1;
        if(n==0) return 0;
        int first=0;
        int second=1;
        int third=0;
        while(n-->0){
            third=first+second;
            first=second;
            second=third;
        }
        return first;
    }
}