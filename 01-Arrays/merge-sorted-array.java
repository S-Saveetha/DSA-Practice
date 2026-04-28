// 88. Merge Sorted Array
// Approch: Two Pointers
/*  Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array. 
 The first m elements of nums1 are the elements to be merged, and the last n elements of 
 nums1 are set to 0 and should be ignored. nums2 has a length of n. track the last index of nums1 and nums2 and compare the elements, 
 placing the larger one at the end of nums1.*/ 
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int i = m - 1;
      int j = n - 1;
      int k = m + n - 1;
      while(j >= 0) {
        if(i >= 0 && nums1[i] > nums2[j]){
            nums1[k--] = nums1[i--];
        } else{
            nums1[k--] = nums2[j--];
        }
      }
    }
}
// Time Complexity : O(m+n)
// Space Complexity : O(1)