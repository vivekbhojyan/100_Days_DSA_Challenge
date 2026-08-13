class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int beg=0;
        int end=nums.length-1;
        while(beg<=end){
            int mid=beg+(end-beg)/2;
            if(nums[mid]==target) return true;
            else if(target<nums[mid]) end=mid-1;
            else beg=mid+1;
            
        }
        return false;
    }
}