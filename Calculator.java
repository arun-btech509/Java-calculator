import java.util.Scanner;

class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        System.out.println("=== ARUN BTech 509 - ADVANCED CALCULATOR ===");

        do {
            System.out.println("\n--- MENU DA ARUN ---");
            System.out.println("1. Add (+)");
            System.out.println("2. Subtract (-)");
            System.out.println("3. Multiply (*)");
            System.out.println("4. Divide (/)");
            System.out.println("5. Exit");
            System.out.print("Choose option (1-5): ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("First number: ");
                double a = sc.nextDouble();
                System.out.print("Second number: ");
                double b = sc.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Result: " + a + " + " + b + " = " + (a + b));
                        break;
                    case 2:
                        System.out.println("Result: " + a + " - " + b + " = " + (a - b));
                        break;
                    case 3:
                        System.out.println("Result: " + a + " * " + b + " = " + (a * b));
                        break;
                    case 4:
                        if (b != 0)
                            System.out.println("Result: " + a + " / " + b + " = " + (a / b));
                        else
                            System.out.println("Dei 0 la divide panna koodathu da!");
                        break;
                }
            } else if (choice == 5) {
                System.out.println("Calculator closed da ARUN! Bye da!");
            } else {
                System.out.println("Wrong choice da! 1-5 kulla kudu da!");
            }

        } while (choice != 5);

        sc.close();
    }
}