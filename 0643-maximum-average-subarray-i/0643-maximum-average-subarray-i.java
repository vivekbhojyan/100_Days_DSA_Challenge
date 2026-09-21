class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        for(int i=0; i<k; i++){
            sum+=nums[i];
        }
        int sum1=sum;
        for(int i=k; i<n; i++){
            sum+=nums[i];
            sum-=nums[i-k];
            sum1=Math.max(sum, sum1);
        }
        double avg=(double)sum1/k;
        return avg;
    }
}