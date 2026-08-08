class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]<9)
        digits[digits.length-1]=digits[digits.length-1]+1;
        else{
            
            int[] newArr=Arrays.copyOf(digits, digits.length+1);
            int last_digit=newArr.length-1;
            for(int i=last_digit;i>0; i--){
                newArr[i]=newArr[i-1];
            }
            newArr[0]=0;
            while(newArr[last_digit]>=8){
                newArr[last_digit]=0;
                if(newArr[last_digit-1]<9){
                    newArr[last_digit-1]=newArr[last_digit-1]+1;
                    break;
                }
                last_digit--;
           }
           if(newArr[0]==0){
                int[] result = Arrays.copyOfRange(newArr, 1, newArr.length);
                return result;
           }else return newArr;
        }
        return digits;
    }
}