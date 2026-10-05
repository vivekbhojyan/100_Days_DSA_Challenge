class Solution {
    public int scoreOfParentheses(String s) {
        int n=s.length();
        Stack<Character> st= new Stack<>();
        int count=0;
        int depth=0;
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='(') {
                st.push('(');
                depth++;
            }
            else {st.pop();
            depth--;
            if(s.charAt(i - 1) == '(') {
                    count += 1 << depth;
                }
            }
        }
        return count;   
    }
}