class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> S= new Stack<>();
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("+")){
                if(S.size()>=2){
                    S.push(S.peek()+ S.get(S.size()-2));
                }else S.push(0);
            }else if(operations[i].equals("D")){
                S.push(S.peek()*2);
            }else if(operations[i].equals("C")){
                S.pop();
            }else{
                S.push(Integer.parseInt(operations[i]));
            }
        }
        int sum = 0;
        while (!S.isEmpty()) {
        sum += S.pop();
        }

        return sum;
    }
}