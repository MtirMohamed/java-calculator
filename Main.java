import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("=== Java Calculator ===");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            int choice = input.nextInt();

            if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.print("Enter number 1: ");
            double a = input.nextDouble();

            System.out.print("Enter number 2: ");
            double b = input.nextDouble();

            double result = 0;

            switch (choice) {
                case 1: result = a + b; break;
                case 2: result = a - b; break;
                case 3: result = a * b; break;
                case 4:
                    if (b == 0) {
                        System.out.println("Cannot divide by zero!");
                        continue;
                    }
                    result = a / b;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    continue;
            }

            System.out.println("Result: " + result);
            System.out.println();
        }

        input.close();
    }
}
