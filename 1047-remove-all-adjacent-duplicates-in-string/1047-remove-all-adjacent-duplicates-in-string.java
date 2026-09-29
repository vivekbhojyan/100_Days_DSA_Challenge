class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        st.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (!st.isEmpty() && s.charAt(i) == st.peek()) {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : st) {
            sb.append(c);
        }
        return sb.toString();
    }
}