class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st= new Stack<>();
        int count1=0, count2=0;
        for(int i=0;  i<s.length();  i++){
            if(s.charAt(i)=='('){
                st.push('(');
                count1++;
            }    
            else if(!st.isEmpty()){
                st.pop();
                count1--;
            }else{
                count2++;
            }
        }
        return (count1+count2);
    }
}