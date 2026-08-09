class Solution {
    public String convert(String s, int numRows) {
        int n=s.length();
        int nums= numRows;
        int m=0;

        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        String str="";
        for(int i=0; i<nums; i++){
        boolean down=true;
        m=i;
        while(m<n){
            
            str+=s.charAt(m);
            if(i==0 || i==numRows-1) m=m+2*nums-2;
            else{
                if(down){
                    m+=2*(nums-i-1);
                }else m+=2*i;
                down=!down;
            }
            
          } 
        }
        return str;
    }
}