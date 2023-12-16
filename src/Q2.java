import java.util.Scanner;

public class Q2 {

    // 7 •	Array of objects (Students) first make a class Students
    public static void main(String[] args) {
//        Students ArrayStuobj[] = new Students[3];
//        ArrayStuobj[0] = new Students(1, "Azad");
//        ArrayStuobj[1] = new Students(2, "Nosibah");
//        ArrayStuobj[2] = new Students(3, "Fatima");
//
//        ArrayStuobj[1].toString();
//
//        inputAllBaseTypes(); // 8
//        isMultiple(10,20);
        iaEven(20);
    }

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*****************<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    // 8 . Write a short Java method, inputAllBaseTypes, that inputs a different value of each base type
    // from the standard input device and prints it back to the standard output device.
    public static void inputAllBaseTypes() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter text:");
        System.out.println(scanner.nextLine());

        System.out.println("enter integer:");
        while (!scanner.hasNextInt()) { // extra (if the user input a text rather than integer;
            scanner.nextLine();
            System.out.println("input error, try again:");
        }
        int integer = scanner.nextInt();
        System.out.println(integer);


        System.out.println("enter boolean:");
        while (!scanner.hasNextBoolean()) {
            scanner.nextLine();
            System.out.println("no number! try again:");
        }
        boolean boll = scanner.nextBoolean();
        System.out.println(boll);

        System.out.println("enter float:");
        System.out.println(scanner.nextFloat());

    }
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>**********<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    // 9 . Suppose that we create an array A of GameEntry objects, which has an integer scores field, and we clone A and store the result in an array B.
    // If we then immediately set A[4].score equal to 550, what is the score value of the GameEntry object referenced by B[4]?

    // Answer: the B[4] = the same value in A[4] which is 550;

// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*********<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    // 10 . Write a short Java method, isMultiple, that takes two long values, n and m, and returns
    // true if and only if n is a multiple of m, that is, n = mi for some integer i.
    public static void isMultiple(long n, long m) {
        if (n / m == 0) {
            System.out.println("true");

        } else {
            System.out.println("false");
        }

    }

    public static void iaEven(int i) {
        int integer = i;
        while( i / 2 > 0) {
            i = i - 2;
        }
        if (i == 0) {
            System.out.println(integer + " is even");
        } else {
            System.out.println(integer + " is odd");
        }
    }
}
