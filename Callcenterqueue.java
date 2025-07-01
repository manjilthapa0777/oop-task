
import java.util.Scanner;

public class Callcenterqueue {
    private static final int MAX = 100;
    private static String[] callQueue = new String[MAX];
    private static int front = 0, rear = -1, count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add incoming call");
            System.out.println("2. Serve next call");
            System.out.println("3. Display call queue");
            System.out.println("4. Display number of pending calls");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter caller name: ");
                    String name = scanner.nextLine();
                    addCall(name);
                    break;
                case 2:
                    serveCall();
                    break;
                case 3:
                    displayCalls();
                    break;
                case 4:
                    System.out.println("Pending calls: " + count);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }

    public static void addCall(String name) {
        if (count == MAX) {
            System.out.println("Call queue is full");
            return;
        }
        callQueue[++rear] = name;
        count++;
    }

    public static void serveCall() {
        if (count == 0) {
            System.out.println("No calls to serve");
            return;
        }
        System.out.println("Handled call from: " + callQueue[front++]);
        count--;
    }

    public static void displayCalls() {
        if (count == 0) {
            System.out.println("Call queue is empty");
            return;
        }
        System.out.print("Current call queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(callQueue[i] + " ");
        }
        System.out.println();
    }
}
