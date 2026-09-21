class Solution {
    public int minimumRecolors(String s, int k) {
        int l=s.length(); 
        int[] arr= new int[l];
        for(int i=0; i<l; i++){
            if(s.charAt(i)=='W') arr[i]=0;
            else arr[i]=1;
        }
        int sum=0;
        for(int i=0; i<k;i++){
            sum+=arr[i];
        }
        int sum1=sum;
        for(int i=k; i<l; i++){
            sum+=arr[i];
            sum-=arr[i-k];
            sum1=Math.max(sum, sum1);
        }
        return k-sum1;
    }
}