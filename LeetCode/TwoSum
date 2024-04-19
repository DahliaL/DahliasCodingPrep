class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sum = new HashMap<>();
        int[] arr={0, 0};
        int tempAdd = 0;

        for(int i = 0; i < nums.length; i++) {
            if (sum.containsKey(target-nums[i])) {
                arr[0] = sum.get(target-nums[i]);
                arr[1] = i;
                return arr; }
            else {
                sum.put(nums[i], i);
            }
        }

        return arr;
    }
}
