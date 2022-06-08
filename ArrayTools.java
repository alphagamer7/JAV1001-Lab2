// Name:- Athif Ahamed Mohamed Shaffy
// Student Id:- A00256229

import java.util.Scanner;
public class ArrayTools {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        displayPromptMenu();

        while (isRunning) {
            try {

                int choice = scanner.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Caeser cipher");
                        System.out.println("Enter original string to encrypt");
                        String originalString = scanner.next();
                        System.out.println("Enter shift value in numeric only");
                        int shiftValue = scanner.nextInt();
                        String encryptedResult = caesarCipher(originalString, shiftValue);
                        System.out.println("Encrypted String:  " + encryptedResult);
                        String decryptedResult = caesarCipher(encryptedResult, -shiftValue);
                        System.out.println(" Decrypting " + encryptedResult + " with -" + shiftValue + "  ...." + decryptedResult);
                        displayPromptMenu();
                        break;

                    case 2:
                        System.out.println("Average");
                        System.out.println("enter size of array in numeric only");
                        int arraySizeOriginal = scanner.nextInt();
                        double originalArray[] = new double[arraySizeOriginal];
                        System.out.println("enter " + arraySizeOriginal + " elements of array , only numeric values accepted");

                        for (int i = 0; i < arraySizeOriginal; i++) {
                            double element = scanner.nextDouble();
                            originalArray[i] = element;
                        }

                        System.out.print("\nTesting methods with[");
                        for (int i = 0; i < arraySizeOriginal; i++) {
                            System.out.print(originalArray[i]);
                            if (i < arraySizeOriginal - 1) {
                                System.out.print(" ");
                            }
                        }
                        System.out.print("]\n");

                        double average = arrayAvg(originalArray);
                        System.out.println("\nAverage of array elements is " + average);

                        System.out.println("\nenter element to search in numeric value");
                        double searchItem = scanner.nextDouble();
                        boolean existOrNot = arrayContains(originalArray, searchItem);
                        if (existOrNot) {
                            System.out.println("\nArray contain " + searchItem);
                        } else {
                            System.out.println("\nArray does not  contain " + searchItem);
                        }

                        double arrayAfterReversal[] = reverse(originalArray);
                        System.out.print("\nThe array reversed is  [");

                        for (int i = 0; i < arraySizeOriginal; i++) { 
                            // Output array
                            System.out.print(arrayAfterReversal[i]);
                            if (i < arraySizeOriginal - 1) {
                                System.out.print(" ");
                            }
                        }
                        System.out.print("]\n");
                        displayPromptMenu();

                        break;

                    case 3:
                        System.out.println("array contain");
                        System.out.println("enter size of array in numeric only");
                        int arraySizeOriginal2 = scanner.nextInt();
                        double originalArray2[] = new double[arraySizeOriginal2];
                        System.out.println("enter " + arraySizeOriginal2 + " elements of array , only numeric values accepted");

                        for (int i = 0; i < arraySizeOriginal2; i++) {
                            double element = scanner.nextDouble();
                            originalArray2[i] = element;
                        }

                        System.out.print("\n Running method with[");
                        for (int i = 0; i < arraySizeOriginal2; i++) {
                            System.out.print(originalArray2[i]);
                            if (i < arraySizeOriginal2 - 1) {
                                System.out.print(" ");
                            }
                        }
                        System.out.print("]\n");

                        System.out.println("\nenter element to search in numeric value");
                        double searchItem1 = scanner.nextDouble();
                        boolean existOrNot1 = arrayContains(originalArray2, searchItem1);
                        if (existOrNot1) {
                            System.out.println("\nArray contain " + searchItem1);
                        } else {
                            System.out.println("\nArray does not  contain " + searchItem1);
                        }
                        displayPromptMenu();
                        break;

                    case 4:
                        System.out.println("array reverse");
                        System.out.println("enter size of array in numeric only");
                        int arraySizeOriginal3 = scanner.nextInt();
                        double originalArray3[] = new double[arraySizeOriginal3];
                        System.out.println("enter " + arraySizeOriginal3 + " elements of array , only numeric values accepted");

                        for (int i = 0; i < arraySizeOriginal3; i++) {
                            double element = scanner.nextDouble();
                            originalArray3[i] = element;
                        }

                        System.out.print("\nTesting method with[");
                        for (int i = 0; i < arraySizeOriginal3; i++) {
                            System.out.print(originalArray3[i]);
                            if (i < arraySizeOriginal3 - 1) {
                                System.out.print(" ");
                            }
                        }
                        System.out.print("]\n");

                        double arrayAfterReversal1[] = reverse(originalArray3);
                        System.out.print("\nThe array reversed is  [");
                        for (int i = 0; i < arraySizeOriginal3; i++) {
                            System.out.print(arrayAfterReversal1[i]);
                            if (i < arraySizeOriginal3 - 1) {
                                System.out.print(" ");
                            }
                        }
                        System.out.print("]\n");
                        displayPromptMenu();
                        break;


                    case 5:
                        displayPromptMenu();
                        break;

                    case 6:
                        isRunning = false;
                        System.out.println("\nProgram Exit");
                }

            } catch (Exception ex) {
                System.out.println("\ninvalid input program stopped , enter only numeric data and run again");
                break;
            }

        }

    }


    /*
        Display prompt menu
    */
    public static void displayPromptMenu() {
        System.out.println("\ninput choice from 1-6\n1.Caesar cipher\n2.Array Average\n3.Array Contain\n4.Array Reverse\n5.Menu \n6.Exit\n");
    }

    /*
        Caesar Cipher, accepting string and shifting ascii value 
    */
    public static String caesarCipher(String inputString, int shiftValue) {
        int stringSize = inputString.length();
        String encryptedString = "";
        for (int i = 0; i < stringSize; i++) {
            char singleCharacter = inputString.charAt(i);
            singleCharacter = (char)(singleCharacter + shiftValue);
            encryptedString = encryptedString + singleCharacter;
        }
        return encryptedString;
    }

    /*
       Averages array item
    */
    public static double arrayAvg(double inputArray[]) {
        int arraySize = inputArray.length;
        double averageOfArrayElements = 0.0;
        double sumOfArrayElements = 0.0;

        for (int i = 0; i < arraySize; i++) {
            sumOfArrayElements += inputArray[i];
        }

        averageOfArrayElements = sumOfArrayElements / arraySize; //find average after dividing sun of array elements to total no of elements
        return averageOfArrayElements;
    }

    /*
       Checks if item exist in array
     */
    public static boolean arrayContains(double inputArray[], double searchValue) {
        boolean containOrNot = false;
        int arraySize = inputArray.length;

        for (int i = 0; i < arraySize; i++) {
            if (inputArray[i] == searchValue) {
                containOrNot = true;
                break;
            }
        }

        return containOrNot;
    }

    /*
      Reverses array
    */
    public static double[] reverse(double inputArray[]) {
        int arraySize = inputArray.length;

        double reversedArray[] = new double[arraySize];
        int j = 0;

        for (int i = arraySize - 1; i >= 0; i--) {
            reversedArray[j] = inputArray[i];
            j++;
        }
        return reversedArray;
    }
}
