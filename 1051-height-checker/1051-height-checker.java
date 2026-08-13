class Solution {
    public int heightChecker(int[] arr) {
        int count=0;
        int[] newArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(newArr);
        for(int i=0; i<arr.length; i++){
            if(newArr[i]!=arr[i]) count++;
        }
        return count;
    }
}