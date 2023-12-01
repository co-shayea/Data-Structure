import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
//        System.out.println("hello world");             // 1 •	Hello world program
//        for (int i = 1; i < 11; i++) {                 // 2 •	Print numbers from 1-10
//            System.out.println(i);
//
//           int array [] ={1,2,3,4};                    // 3 •	Print array elements
//            for (int j = 0; j < array.length; j++) {
//                System.out.println(array[j]);
//            }
                                                         // 4 •	Input array elements
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter size of Array:");
            int size = scanner.nextInt();

            int Array1 [] = new int[size];
            System.out.println("put elements:");
            for (int j = 0; j < Array1.length; j++) {
                Array1[j] = scanner.nextInt();
            }
                                                        // extra
        for (int i = 0; i < Array1.length; i++) {
            System.out.println(Array1[i]);
        }
        PrintArrayElements();
        InputElements();
     }
                                                       // 5 • Define method to print array elements
     public static void PrintArrayElements(){
         int array [] ={1,2,3,4};
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[j]);
            }
     }
                                                       // 6 • Define method to print array elements
      public static void InputElements(){
        Scanner scanner = new Scanner(System.in);
          System.out.println("input elements:");
          int inputTome [] = new int[4];
          for (int i = 0; i < inputTome.length; i++) {
              inputTome[i] = scanner.nextInt();

          }
      }

}