//import java.util.HashMap;
//// code needs to be modified
//
//
//
//
//
//
//public class SubarraySum {
//    public static void main(String[] args) {
//        int[] array = {6, 2, 2, 3, 4, 1};
//        int k = 15;
//        System.out.println("Maximum length of subarray with sum " + k + ": " + lenOfLongSubarr(array, k));
//    }
//
//    public static int lenOfLongSubarr(int[] array, int k) {
//        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
//        prefixSumMap.put(0, 1); // Handle the case where the subarray starts from index 0
//
//        int sum = 0; // Initialize the sum of the current subarray
//        int maxLen = 0; // Initialize the maximum length of a subarray with the given sum
//
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i]; // Add the current element to the sum
//            System.out.println("Current element: " + array[i] + ", Current sum: " + sum);
//
//            // Check if the prefix sum minus the target value exists in the HashMap
//            if (prefixSumMap.containsKey(sum - k)) {
//                maxLen = Math.max(maxLen, i - prefixSumMap.get(sum - k));
//                System.out.println("Max length updated to: " + maxLen);
//            }
//
//            // Update the HashMap with the current prefix sum and its length
//            prefixSumMap.put(sum, prefixSumMap.getOrDefault(sum, 0) + 1);
//            System.out.println("Updated prefixSumMap: " + prefixSumMap);
//        }
//
//        return maxLen;
//    }
//}