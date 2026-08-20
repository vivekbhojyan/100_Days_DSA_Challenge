class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
      
    
        LinkedList<Integer> result = new LinkedList<>();
        int i = num.length - 1;
        
        
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i]; // Add the current array digit to k
                i--;
            }
            // Add the last digit of k to the front of the list
            result.addFirst(k % 10);
            // Reduce k by removing its last digit
            k /= 10;
        }
        
        return result; 
    }
}