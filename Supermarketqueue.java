
import java.util.Scanner;

public class Supermarketqueue {
    private static final int MAX = 100;
    private static String[] queue = new String[MAX];
    private static int front = 0, rear = -1, count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add customer");
            System.out.println("2. Serve customer");
            System.out.println("3. Display queue");
            System.out.println("4. Number of customers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    addCustomer(name);
                    break;
                case 2:
                    serveCustomer();
                    break;
                case 3:
                    displayQueue();
                    break;
                case 4:
                    System.out.println("Total customers: " + count);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }

    public static void addCustomer(String name) {
        if (count == MAX) {
            System.out.println("Queue is full");
            return;
        }
        queue[++rear] = name;
        count++;
    }

    public static void serveCustomer() {
        if (count == 0) {
            System.out.println("No customers to serve");
            return;
        }
        System.out.println("Served: " + queue[front++]);
        count--;
    }

    public static void displayQueue() {
        if (count == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Current queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}
