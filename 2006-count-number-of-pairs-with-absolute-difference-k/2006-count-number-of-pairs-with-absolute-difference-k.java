class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap <Integer, Integer> map= new HashMap<>();
        int count=0;
        for(int x:nums){
            if(k==0){
                if(map.containsKey(x)) count+=map.get(x);
            }else{
                if(map.containsKey(x-k)) count+=map.get(x-k);
                if(map.containsKey(x+k)) count+=map.get(x+k);
            }
            if(map.containsKey(x)) map.put(x, map.get(x)+1);
            else map.put(x,1);
        }
        return count;
    }
}