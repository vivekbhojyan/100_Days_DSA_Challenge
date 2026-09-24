class Solution {
    public int longestSubarray(int[] nums) {
    int left=0;
    int zero=0;
    int res=0;
    for(int i=0; i<nums.length; i++){
      if(nums[i]==0){
        zero++;
      }while(zero>1){
        if(nums[left]==0) zero--;
        left++;
      }
      res=Math.max(res, i-left);
    }
    return res;
  }
}
    