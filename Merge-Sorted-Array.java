class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> merge = new ArrayList<Integer>();
        int[] mg = new int[n + m];
        
        int n2 = 0;
        int temp = 0;
        for (int i = 0 ; i < nums1.length-1; i++) {
            if (nums1[i] < nums2[j]) {
                temp = nums1[i+1];
                nums1[i+1] = nums2[j];
                = temp;
                j++;
            }           
        }
    }
}
