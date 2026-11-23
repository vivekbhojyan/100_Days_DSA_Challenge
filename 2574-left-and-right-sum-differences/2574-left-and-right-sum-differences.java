class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left= new int[nums.length];
        left[0]=0;
        int sum=0;
        for(int i=1; i<nums.length; i++){
            sum+=nums[i-1];
            left[i]=sum;
        }
        int[] right= new int[nums.length];
        right[nums.length-1]=0;
        int sum1=0;
        for(int i=nums.length-2; i>=0;i--){
            sum1+=nums[i+1];
            right[i]=sum1;
        }
        int[] arr= new int[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i]=Math.abs(left[i]-right[i]);
        }
        return arr;
    }
}