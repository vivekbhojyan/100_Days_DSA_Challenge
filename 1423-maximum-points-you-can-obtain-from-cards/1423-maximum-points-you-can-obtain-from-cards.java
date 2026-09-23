class Solution {
    public int maxScore(int[] cardPoints, int k) {
      int n=cardPoints.length;
      int sum=0;
      for(int i=0; i<k; i++){
        sum+=cardPoints[i];
      } 
      int sum1=sum;
      for(int i=n-1; i>n-k-1; i--){
        sum+=cardPoints[i];
        sum-=cardPoints[i-n+k];
        sum1=Math.max(sum, sum1);
      }
      return sum1;
    }
}