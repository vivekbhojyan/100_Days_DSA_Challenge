class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        for(int i=0; i<n; i++)
        {   
            int x=Math.abs(nums[i]);
            if(nums[x-1]>0){
                nums[x-1]*=-1;

            }
        }
        List<Integer> list= new ArrayList<>();
        for(int i=0; i<n; i++){
            if(nums[i]>0){
                list.add(i+1);
            }
        }
        return list;
    }
}