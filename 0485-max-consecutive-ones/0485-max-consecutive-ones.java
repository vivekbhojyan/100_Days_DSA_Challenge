class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
           int count=0, maxCount=0;
    for(int i=0; i<arr.length; i++){
      if(arr[i]==1) count++;
      else count=0;
      maxCount=Math.max(count,maxCount);
    }
    return maxCount; 
    }
}