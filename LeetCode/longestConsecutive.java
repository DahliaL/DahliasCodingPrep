class Solution {
    public int longestConsecutive(int[] nums) {
        if( nums.length == 0)
            return 0;

        int maxLen = 1;
        HashSet<Integer> hs = new HashSet<Integer>();

        for(int i = 0; i < nums.length; i++) {
            hs.add(nums[i]); 
        }

        int length = 0;

        for(int i = 0; i < nums.length; i++) {
            if(!hs.contains(nums[i]-1)) {
                length = 1;

                while(hs.contains(nums[i]+length)) {
                    length+= 1;

                    maxLen = Math.max(maxLen, length);
                }
            } else if(!hs.contains(nums[i]+1)) {
                length = 1;

                while(hs.contains(nums[i]-length)) {
                    length+= 1;

                    maxLen = Math.max(maxLen, length);
                } 
            } else
                continue;
        }
        return maxLen;
    }
}
