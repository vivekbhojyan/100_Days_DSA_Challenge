class Solution {
    public String convertToTitle(int cn) {
        StringBuilder sb= new StringBuilder();
        int n=cn;
        while(n>0){
            n--;
            int t=n%26;
            
            sb.append((char)('A'+t));
            n=n/26;
        } 
        return sb.reverse().toString();
    }
}