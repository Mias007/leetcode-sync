class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Create a hashset to store elements from array
        HashSet<Integer> seenNumbers = new HashSet <>();

        //iterate through each element
        for ( int num : nums){
            //check if the element is already in Hashset 
            if (seenNumbers.contains(num)) {
                return true;//Duplicate
            }
            //add element to the hashSet
            seenNumbers.add(num);
        }
        return false;//No duplicate
    }
}
