class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack <Character> s1= new Stack<>();
        Stack <Character> s2= new Stack<>();
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i)=='#') {
                if(!s1.isEmpty()) {
                    s1.pop();
                }
            }else s1.push(s.charAt(i));
        }
        for(int i=0; i<t.length(); i++){
            if(t.charAt(i) == '#') {
        if(!s2.isEmpty()) {
            s2.pop();
        }
    }            else s2.push(t.charAt(i));
        }
        StringBuilder sb1= new StringBuilder();
        for(char c:s1){
            sb1.append(c);
        }
        String res1= sb1.toString();
        StringBuilder sb2= new StringBuilder();
        for(char c:s2){
            sb2.append(c);
        }
        String res2= sb2.toString();
        if(res1.equals(res2)) return true;
        else return false;
    }
}