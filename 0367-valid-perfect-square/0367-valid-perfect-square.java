class Solution {
    public boolean isPerfectSquare(int num) {
        int left=1;
        int right=num;
       
        while(left<=right){
            int mid=left+(right-left)/2;
            long square=(long)mid*mid;
            if(num==square)return true;
            else if(num>square) left=mid+1;
            else right=mid-1; 
        }
        return false;
    }
}