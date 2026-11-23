class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n+1];
        arr[0] =0;
        for (int i=1; i<=n; i++) {
            arr[i]=arr[i-1]+nums[i-1];
        }
        for (int i =0; i<n;i++) {
            int left =arr[i];
            int right = arr[n]-arr[i+1];
            if(left == right){
                return i;
            }
        }
        return -1;
    }
}