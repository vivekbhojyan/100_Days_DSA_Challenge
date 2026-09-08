class Solution {
    public int dominantIndex(int[] nums) {
        int[] arr= Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        
        int i=1;
        int a=-1;
        
        while(i<nums.length){
            if(nums[nums.length-1]>=2*nums[nums.length-i-1]){
            a=nums[nums.length-i];
            break;
            
            }
            else return -1;
        }
        a=nums[nums.length-1];
        for(int j=0; j<nums.length; j++){
            if(a==arr[j]) return j;
        }
        return -1;
    }
}