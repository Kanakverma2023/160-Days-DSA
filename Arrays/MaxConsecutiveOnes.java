public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, currentCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1, 0, 1}, 1, 1;  
        int result = findMaxConsecutiveOnes(nums);
        System.out.println("Maximum consecutive 1s: " + result);
    }
}
