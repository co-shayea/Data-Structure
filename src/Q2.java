import java.util.Scanner;

public class Q2 {
                                 // 7 •	Array of objects (Students) first make a class Students
         public static void main(String[] args) {
//             Students ArrayStuobj[] = new Students[3];
//             ArrayStuobj[0] = new Students(1,"Azad");
//             ArrayStuobj[1] = new Students(2,"Nosibah");
//             ArrayStuobj[2] = new Students(3,"Fatima");
          inputAllBaseTypes();
         }


                                  // 8 . Write a short Java method, inputAllBaseTypes, that inputs a different value of each base type
                                  // from the standard input device and prints it back to the standard output device.
 public static void inputAllBaseTypes(){

     Scanner scanner = new Scanner(System.in);

     System.out.println("enter text:");
     System.out.println(scanner.nextLine());

     int counter = 0;
     while (counter < 3) { // extra (if the user input a text rather than integer;
         try {
             System.out.println("enter integer:");
             int integer = scanner.nextInt();
             System.out.println(integer);

             break;
         }catch (Exception e) {
             System.out.println(e);

         }

     }


     System.out.println("enter boolean:");
     System.out.println(scanner.nextBoolean());

     System.out.println("enter float:");
     System.out.println(scanner.nextFloat());

 }
    // 9 . Suppose that we create an array A of GameEntry objects, which has an integer scores field, and we clone A and store the result in an array B.
    // If we then immediately set A[4].score equal to 550, what is the score value of the GameEntry object referenced by B[4]?

    // Answer: the B[4] = the same value in A[4] which is 550;

}
