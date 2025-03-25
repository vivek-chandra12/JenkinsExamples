public class arithmeticCLI {

    public static void main(String[] args) {
        
        double num1 = Integer.parseInt(args[0]); 
        double num2 = Integer.parseInt(args[1]);  
        
        
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        
        
        System.out.println("Results:");
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        
        
        if (num2 != 0) {
            System.out.println("Division: " + quotient);
        } else {
            System.out.println("Division: Undefined (cannot divide by zero)");
        }
    }
}

