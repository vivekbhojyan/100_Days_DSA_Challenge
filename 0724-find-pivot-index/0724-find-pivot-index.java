class Solution {
    public int pivotIndex(int[] nums) {
        int n= nums.length;
        int sum1=0;
        int sum2=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                sum1+=nums[j];
            }for(int j=i+1;j<n; j++){
                sum2+=nums[j];
            }
            if(sum1==sum2) return i;
            sum1=0;
            sum2=0;
        } 
        return -1;
    }
}