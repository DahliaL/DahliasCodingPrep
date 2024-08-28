class Solution {
  // runtime is O(n), from for-loop iteration, time was 0ms on Leetcode
  public int missingNumber(int[] nums) {
        int sumArr = 0;
        int expectedRes = nums.length; // start with n to expected sum for accurate sum rep. since loop wont include n in count
    
        for(int i=0; i<nums.length; i++) {
            expectedRes += i; // the expected sum of the array elements
            sumArr += nums[i]; // actual result of array elements
        }

        return expectedRes - sumArr; // the difference will tell us what is missing from the array 
    }
  
  // first solution, optimized above
  // runtime is O(nlog(n) from arrays.sort function, the for loop runs o(n)
    public int missingNumberOld(int[] nums) {
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++) {
            if(i!=nums[i])
                return i;
        }

        return nums.length;
    }
}
