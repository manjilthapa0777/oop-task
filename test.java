// q1- D
// q2- D
// q3- A
// q4- B
// q5- B
// q6- C
// q7- D
// q8- D


// Q-2
// import java.util.Scanner;

// public class test {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scn.nextInt();
//         int sum = 0;

//         while (number != 0) {
//             int digit = number % 10;
//             sum += digit;
//             number /= 10;
//         }

//         System.out.println("Sum of digits: " + sum);
//         scn.close();
//     }
// }

// Q_3
// import java.util.scanner;
// public class test {
// public static void main(String[] args) {
// for(int i=1;i<=5;i++){
// for(int j=1;j<=i;j++){
// System.out.print(j);
// }
// System.out.println();
//     }
//    }
//   }

// Q-1
// import java.util.Scanner;

// public class test {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a word: ");
//         String word = scanner.nextLine();
//         StringBuilder reversedWord = new StringBuilder();
//         int length = word.length();
//         while (length > 0) {
//             reversedWord.append(word.charAt(length - 1));
//             length--;
//         }
//         System.out.println("Reversed word: " + reversedWord.toString());
//         scanner.close();
//     }
// }

// public class test {
//     static int add(int a, int b){
//         return a+b;
//     }
//     static void multiply(int a, int b){
//         System.out.println(a*b);
//     }
//     void add1(int a, int b){
//         System.out.println(a+b);
//     }
//     public static void main(String[] args) {
//        int sum=add(3, 2);
//        System.out.println(sum);
//        multiply(3,2);

//        test Test1=new test();
//        Test1.add(3,2);
//     }
// }


// public class test {
//     public static void greet() {
//         System.out.println("Hello");
//     }

//     public static void main(String[] args) {
//         greet(); // calling the method
//     }
// }

// public class test {

//     public static void greet() {
//         System.out.println("Hello!");
//     }

//     public static void welcome() {
//         System.out.println("hi.");
//     }

//     public static void sayGoodbye() {
//         System.out.println("Good bye.");
//     }

//     public static void thank() {
//         System.out.println("thank you.");
//     }

//     public static void main(String[] args) {
//         greet();
//         welcome();
//         sayGoodbye();
//         thank();
//     }
// }

// public class test {
//     public static void main(String[] args) {
//         int number = 17; // You can change this number
//         if (isPrime(number)) {
//             System.out.println(number + " is Prime");
//         } else {
//             System.out.println(number + " is Not Prime");
//         }
//     }

//     public static boolean isPrime(int n) {
//         if (n <= 1) {
//             return false;
//         }
//         for (int i = 2; i < n; i++) {
//             if (n % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }   

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num = ");
        int num = sc.nextInt();
        sc.close();

        if (isEven(num)) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}











    