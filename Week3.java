import java.util.Scanner;

public class Week3 {
    // 1
    public static void odd(int n) {
        System.out.println("\n1. Finding odd numbers up to " + n);
        System.out.print("Odd numbers: ");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 2
    public static void Numberofdays(int d) {
        System.out.println("\n2. Converting " + d + " days");
        int y = d / 365;
        int ny = d % 365;
        int m = ny / 30;
        int da = ny % 30;
        System.out.println(d + " days = " + y + " years, " + m + " months, and " + da + " days.");
    }

    // 3
    public static void wc(String a) {
        System.out.println("\n3. Counting words in: \"" + a + "\"");
        int count = 0;
        int i = 0;
        int len = a.length();
    
        while (i < len) {
            while (i < len && (a.charAt(i) == ' ' || a.charAt(i) == '\t' || a.charAt(i) == '\n')) {
                i++;
            }
            if (i < len) {
                count++;
                while (i < len && !(a.charAt(i) == ' ' || a.charAt(i) == '\t' || a.charAt(i) == '\n')) {
                    i++;
                }
            }
        }
        System.out.println("Word count: " + count);
    }

    // 4
    public static void isHarshad(int num) {
        System.out.println("\n4. Checking if " + num + " is Harshad number");
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println(num + (num % sum == 0 ? " is" : " is NOT") + " a Harshad number.");
    }

    // 5
    public static void compoundInterest(double p, double r, double t) {
        System.out.println("\n5. Calculating Compound Interest");
        System.out.println("Principal: " + p);
        System.out.println("Rate: " + r + "%");
        System.out.println("Time: " + t + " years");
        double amount = p * Math.pow((1 + r/100), t);
        double ci = amount - p;
        System.out.println("Compound Interest: " + ci);
    }

    // 7
    public static void swapWithTemp(int x, int y) {
        System.out.println("\n7. Swapping with temp variable");
        System.out.println("Before Swap: x = " + x + ", y = " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After Swap: x = " + x + ", y = " + y);
    }

    // 8
    public static void swapWithoutTemp(int x, int y) {
        System.out.println("\n8. Swapping without temp variable");
        System.out.println("Before Swap: x = " + x + ", y = " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swap: x = " + x + ", y = " + y);
    }

    // 9
    public static void sumNatural(int n) {
        System.out.println("\n9. Sum of first " + n + " natural numbers");
        int sum = n * (n + 1) / 2;
        System.out.println("Sum = " + sum);
    }

    // 10
    public static void printFactors(int n) {
        System.out.println("\n10. Finding factors of " + n);
        System.out.print("Factors: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // 11
    public static void cube(int n) {
        System.out.println("\n11. Finding cube of " + n);
        System.out.println("Cube = " + (n * n * n));
    }

    // 12
    public static void isDuck(int n) {
        System.out.println("\n12. Checking if " + n + " is Duck number");
        String s = String.valueOf(n);
        System.out.println(n + (s.contains("0") && s.charAt(0) != '0' ? " is" : " is NOT") + " a Duck number.");
    }

    // 13
    public static void printTables() {
        System.out.println("\n13. Printing multiplication tables");
        for (int i = 1; i <= 10; i++) {
            System.out.println("\nTable of " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println("---------------");
        }
    }

    // 14
    public static void sumSquares(int n) {
        System.out.println("\n14. Sum of squares of digits in " + n);
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        System.out.println("Sum of squares = " + sum);
    }

    // 15
    public static void countCase(String s) {
        System.out.println("\n15. Counting cases in: \"" + s + "\"");
        int upper = 0, lower = 0, digits = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) upper++;
            else if (Character.isLowerCase(c)) lower++;
            else if (Character.isDigit(c)) digits++;
        }
        System.out.println("Uppercase letters: " + upper);
        System.out.println("Lowercase letters: " + lower);
        System.out.println("Digits: " + digits);
    }

    // 17
    public static void reverseInt(int n) {
        System.out.println("\n17. Reversing number " + n);
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println("Reversed number = " + rev);
    }

    // 18
    public static void fibonacci(int n) {
        System.out.println("\n18. Generating Fibonacci series up to " + n + " terms");
        int a = 0, b = 1;
        System.out.print("Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }

    // 19
    public static void asciiValue(char c) {
        System.out.println("\n19. Finding ASCII value of '" + c + "'");
        System.out.println("ASCII value = " + (int)c);
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\n1. Enter a number for odd numbers: ");
        odd(sc.nextInt());

        System.out.print("2. Enter number of days: ");
        Nofdays(sc.nextInt());

        System.out.print("3. Enter a sentence for word count: ");
        sc.nextLine(); // Clear buffer
        wc(sc.nextLine());

        System.out.print("4. Enter a number to check if Harshad: ");
        isHarshad(sc.nextInt());

        System.out.println("5. Enter details for Compound Interest:");
        System.out.print("   Principal amount: ");
        double p = sc.nextDouble();
        System.out.print("   Rate of interest: ");
        double r = sc.nextDouble();
        System.out.print("   Time (in years): ");
        double t = sc.nextDouble();
        compoundInterest(p, r, t);

        System.out.println("7. Enter two numbers to swap (with temp):");
        System.out.print("   First number: ");
        int x1 = sc.nextInt();
        System.out.print("   Second number: ");
        int y1 = sc.nextInt();
        swapWithTemp(x1, y1);

        System.out.println("8. Enter two numbers to swap (without temp):");
        System.out.print("   First number: ");
        int x2 = sc.nextInt();
        System.out.print("   Second number: ");
        int y2 = sc.nextInt();
        swapWithoutTemp(x2, y2);

        System.out.print("9. Enter a number for sum of natural numbers: ");
        sumNatural(sc.nextInt());

        System.out.print("10. Enter a number to find factors: ");
        printFactors(sc.nextInt());

        System.out.print("11. Enter a number to find cube: ");
        cube(sc.nextInt());

        System.out.print("12. Enter a number to check if Duck number: ");
        isDuck(sc.nextInt());

        System.out.println("13. Printing multiplication tables...");
        printTables();

        System.out.print("14. Enter a number for sum of squares of digits: ");
        sumSquares(sc.nextInt());

        System.out.print("15. Enter a string to count cases: ");
        sc.nextLine(); // Clear buffer
        countCase(sc.nextLine());

        System.out.print("17. Enter a number to reverse: ");
        reverseInt(sc.nextInt());

        System.out.print("18. Enter number of terms for Fibonacci series: ");
        fibonacci(sc.nextInt());

        System.out.print("19. Enter a character to find ASCII value: ");
        asciiValue(sc.next().charAt(0));

        sc.close();
    }
}
