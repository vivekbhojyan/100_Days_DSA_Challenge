class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int m=0;
        int n=0;
        int i=0;
        int[] arr=new int[n1+n2];
        
        while(m<n1 && n<n2){
            if(nums1[m]<nums2[n]){
                arr[i]=nums1[m];
                m++;
            }else {arr[i]=nums2[n]; n++;}
            i++;
        }
        if(n<n2){
            for(int j=n; j<n2; j++){
                arr[i]=nums2[j];
                i++;
            }
        }if(m<n1){
            for(int j=m; j<n1; j++){
                arr[i]=nums1[j];
                i++;
            }
        }
        double res;
        if((n1+n2)%2==0){
            res=(double)((arr[(n1+n2-1)/2]+arr[(n1+n2)/2])/2.0);
        }else res=(double)((arr[(n1+n2)/2])/1.0);
        return res;
    }
}