class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int profit=0;
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        for(int i=0; i<boxTypes.length; i++){
            int box = Math.min(boxTypes[i][0], truckSize);
            profit += box * boxTypes[i][1];
            truckSize -= box;
            if(truckSize==0) break;
        }
        return profit;
    }
}