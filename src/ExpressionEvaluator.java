public class ExpressionEvaluator {

    public static void main(String[] args) {
        String expression = "5+20-8+5";
        int result = evaluateExpression(expression);
        System.out.println("Result: " + result);
    }

    public static int evaluateExpression(String expression) {
        if (expression == null || expression.isEmpty()) {
            throw new IllegalArgumentException("Invalid expression");
        }

        int result = 0;
        int currentNumber = 0;
        char operator = '+';

        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);

            if (Character.isDigit(currentChar)) {
                // Use Integer.parseInt to extract digit. before that multiply currentNumber by 10 to
                // shift current number to the left, allowing us to work with numbers with multiple digits.
                currentNumber = currentNumber * 10 +Integer.parseInt(String.valueOf(currentChar));
            }

            //make sure currentCharacter is not whitespace if it's not digit. check if we reached end of our string.
            if (!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar) || i == expression.length() - 1) {
                if (operator == '+') {
                    result += currentNumber;
                } else if (operator == '-') {
                    result -= currentNumber;
                }

                // resetting currentNumber to 0 to extract next number.
                currentNumber = 0;
                operator = currentChar;
            }
        }

        return result;
    }
}
