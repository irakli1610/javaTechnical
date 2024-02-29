public class SubarrayValidator {

    public static void main(String[] args) {
        int[] array = {5, 1, 22, 25, 6, -1, 8, 10};
        int[] sequence = {1, 6, -1, 10};

        boolean result = isValidSequence(array, sequence);
        System.out.println("Result: " + result);
    }

    public static boolean isValidSequence(int[] array, int[] sequence) {
        int arrayIndex = 0;
        int sequenceIndex = 0;

        // loop through both arrays and check if element in sequence is found in array
        // check if array has run out of options or there is no other element to be found from sequence
        while (arrayIndex < array.length && sequenceIndex < sequence.length) {
            if (array[arrayIndex] == sequence[sequenceIndex]) {
                sequenceIndex++;
            }
            arrayIndex++;
        }

        // check if sequenceIndex reached end of sequence.
        return sequenceIndex == sequence.length;
    }
}
