class Solution {
    public int longestValidParentheses(String s) {
        if(s.length()==0) return 0;
        Stack<Integer> st= new Stack<>();
        int count=0;
        st.push(-1);
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='(') st.push(i);
            else {
                st.pop();
                if(st.isEmpty()) st.push(i);
                else count=Math.max(count, i-st.peek());
            }
        }
        return count;
    }
}