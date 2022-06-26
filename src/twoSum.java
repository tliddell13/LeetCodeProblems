public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        //outer loop
        for (int outer = 0; outer < nums.length; outer++) {
            //inner loop
            for (int inner = 0; inner < nums.length; inner++) {
                if (nums[outer] + nums[inner] == target && inner != outer) {
                    return new int[]{outer, inner};
                }
            }
        }
       return new int[]{0,0};
    }
}
