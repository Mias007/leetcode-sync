class Solution {
    public int[] twoSum(int[] nums, int target) {
        //create hashmap to store numbers & indices
        Map<Integer, Integer> map = new HashMap<>();

        // iterate through the array
        for (int i=0; i< nums.length; i++) {
            //calculate the complement of the current num
            int complement = target - nums[i];
            //check if the complement is already in the map
            if (map.containsKey(complement)){
                //If found return the indice
                return new int[] { map.get(complement),i};
            }
             //otherwise add current number and its index to the map
            map.put(nums[i],i);
        }
        // return array if no solution found
        return new int[]{};
       
        
    }
}
