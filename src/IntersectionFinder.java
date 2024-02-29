import java.util.HashSet;
import java.util.Set;

public class IntersectionFinder {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 88, 15, 5, 4, 5};
        int[] nums2 = {3, 4, 5, 15, 6, 7};

        int[] result = findIntersection(nums1, nums2);

        System.out.print("Common elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] findIntersection(int[] nums1, int[] nums2) {
        Set<Integer> commonElements = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    commonElements.add(nums1[i]);
                    // since I am using Set there is no need to check if this element already exists in my commonElements,
                    // it will automatically make sure to have unique elements.
                }
            }
        }

        // Convert Set to array
        int[] result = new int[commonElements.size()];
        int index = 0;
        for (int num : commonElements) {
            result[index++] = num;
        }

        return result;
    }
}
