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
       return null;
    }

    //A more efficient solution I didn't think of
    /*
    public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
        for(int i = 0; i < numbers.length; i++){
            Integer requiredNum = (Integer)(target - numbers[i]);
            if(indexMap.containsKey(requiredNum)){
                int toReturn[] = {indexMap.get(requiredNum), i};
                return toReturn;
            }

            indexMap.put(numbers[i], i);
        }
        return null;
    }
}
     */
}
