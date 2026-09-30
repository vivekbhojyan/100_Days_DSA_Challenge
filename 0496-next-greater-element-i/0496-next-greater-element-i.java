class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st= new Stack<>();
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int num: nums2){
            while(!st.isEmpty() && num>st.peek()){
                map.put(st.pop(), num);
            }
            st.push(num);
        }
        int[] arr= new int[nums1.length];
        for(int i=0; i<arr.length; i++){
            arr[i]=map.getOrDefault(nums1[i],-1);
        }
        return arr;
    }
}