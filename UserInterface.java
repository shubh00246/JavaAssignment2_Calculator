import java.util.Scanner;

public class UserInterface {

    private Scanner sc = new Scanner(System.in);
    private Calculator calc = new Calculator();

    public void performAddition() {
        System.out.println("Choose addition type:");
        System.out.println("1. Add two integers");
        System.out.println("2. Add two doubles");
        System.out.println("3. Add three integers");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter first integer: ");
                int a1 = sc.nextInt();
                System.out.print("Enter second integer: ");
                int b1 = sc.nextInt();
                System.out.println("Result: " + calc.add(a1, b1));
                break;
            case 2:
                System.out.print("Enter first double: ");
                double a2 = sc.nextDouble();
                System.out.print("Enter second double: ");
                double b2 = sc.nextDouble();
                System.out.println("Result: " + calc.add(a2, b2));
                break;
            case 3:
                System.out.print("Enter three integers: ");
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                System.out.println("Result: " + calc.add(x, y, z));
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    public void performSubtraction() {
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        System.out.println("Result: " + calc.subtract(a, b));
    }

    public void performMultiplication() {
        System.out.print("Enter first double: ");
        double a = sc.nextDouble();
        System.out.print("Enter second double: ");
        double b = sc.nextDouble();
        System.out.println("Result: " + calc.multiply(a, b));
    }

    public void performDivision() {
        System.out.print("Enter numerator: ");
        int a = sc.nextInt();
        System.out.print("Enter denominator: ");
        int b = sc.nextInt();
        double result = calc.divide(a, b);
        if (b != 0)
            System.out.println("Result: " + result);
    }

    public void mainMenu() {
        int choice;
        do {
            System.out.println("\n=== Welcome to the Calculator Application ===");
            System.out.println("1. Add Numbers");
            System.out.println("2. Subtract Numbers");
            System.out.println("3. Multiply Numbers");
            System.out.println("4. Divide Numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> performAddition();
                case 2 -> performSubtraction();
                case 3 -> performMultiplication();
                case 4 -> performDivision();
                case 5 -> System.out.println("Exiting... Thank you!");
                default -> System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);
    }

    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.mainMenu();
    }
}
