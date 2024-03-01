import java.util.Arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] array = {6, 2,  2, 3, 4, 1};
        int k = 8;
        int result = longestSubArrayLength(array, k);
        System.out.println("Result: " + result);
    }

    public static int longestSubArrayLength(int[] array, int target) {
        Arrays.sort(array);
        int maxLength = 0;
        int currentSum = 0;
        int left = 0;

        for (int right = 0; right < array.length; right++) {
            currentSum += array[right];

            while (currentSum > target) {
                currentSum -= array[left];
                left++;
            }

            if (currentSum == target) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }

        return maxLength;
    }
}
