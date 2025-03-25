public class ArithmeticCLI {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java ArithmeticCLI <num1> <operator> <num2>");
            System.out.println("Example: java ArithmeticCLI 10 + 5");
            return;
        }

        try {
            double num1 = Double.parseDouble(args[0]);
            char operator = args[1].charAt(0);
            double num2 = Double.parseDouble(args[2]);

            double result = 0;
            boolean validOperation = true;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("Invalid operation! Use +, -, *, or /");
                    validOperation = false;
            }

            if (validOperation) {
                System.out.println("Result: " + result);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format. Please enter valid numbers.");
        }
    }
}

