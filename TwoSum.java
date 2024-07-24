import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        
        // Populate the map with the array values and their indices
        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i], i); 
        }
        
        // Iterate through the array to find the two numbers that add up to the target
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[]{i, numMap.get(complement)};
            }
        }
        
        return null; //Returns when No valid pair has been found
    }
    //Just to print something in the console, we have:
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = solution.twoSum(nums, target);
        
        if (result != null) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No two sum solution found.");
        }
    }
}
