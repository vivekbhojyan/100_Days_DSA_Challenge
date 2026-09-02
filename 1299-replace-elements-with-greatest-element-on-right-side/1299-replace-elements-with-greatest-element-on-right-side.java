class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            int max=0;
            for(int j=i+1; j<n; j++){
                max=Math.max(max, arr[j]);
            }
            arr[i]=max;
            max=0;
        }
        arr[n-1]=-1;
        return arr;
    }
}