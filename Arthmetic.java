public class Arthmetic {
    public static void main(String[] args) {

        // Check if two inputs are provided
        if (args.length < 2) {
            System.out.println("Please provide two numbers");
            return;
        }

        // Convert arguments to integers
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        // Perform operations
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
    }
}
