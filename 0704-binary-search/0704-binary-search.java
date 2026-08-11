class Solution {
    public int search(int[] nums, int target) {
        int beg=0;
        int end=nums.length-1;
        
        
        while(beg<=end){
            int mid=beg+(end-beg)/2;
            
            if(target<nums[mid]){
                end=mid-1;
            }else if(target>nums[mid]) beg=mid+1;
            else  return mid;
            
        }
        return -1;
    }
}