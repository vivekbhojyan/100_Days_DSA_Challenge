class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st= new Stack<>();
        int[] arr = new int[nums.length];
        Arrays.fill(arr,-1);
        for(int i=0; i<2*nums.length-1; i++){
            int current=nums[i%nums.length];
            while(!st.isEmpty() && current>nums[st.peek()]){
                int index= st.pop();
                arr[index]=current;
            }
            if(i<nums.length) st.push(i);
        }
        return arr;
    }
}