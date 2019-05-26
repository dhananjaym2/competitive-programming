/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class TestClass {

    public static void main(String args[]) throws Exception {
        /*
         * Sample code to perform I/O: Use either of these methods for input
         * 
         * //BufferedReader BufferedReader br = new BufferedReader(new
         * InputStreamReader(System.in)); String name = br.readLine(); // Reading input
         * from STDIN System.out.println("Hi, " + name + "."); // Writing output to
         * STDOUT
         * 
         */
        // Scanner
        Scanner s = new Scanner(System.in);
        // String strNumberOfTestCases = s.nextLine(); // Reading input from STDIN
        // System.out.println("Hi, " + name + "."); // Writing output to STDOUT

        // Write your code here
        int numberOfTestCases = Integer.parseInt(s.nextLine());
        // System.out.println("numberOfTestCases:" + numberOfTestCases);

        for (int i = 0; i < numberOfTestCases; i++) {
            int carsAtFullSpeed = 0;
            int numOfCars = Integer.parseInt(s.nextLine());
            // System.out.println("numOfCars:" + numOfCars);

            for (int j = 0; j < numOfCars; j++) {
                String carSequence = s.nextLine();

                int indexOfPreviousSpace = 0;
                int indexOfSpace = carSequence.indexOf(" ");
                int previousCarSpeed = 0;
                while (indexOfSpace != -1 || j == numOfCars) {
                    int carSpeed;
                    indexOfSpace = carSequence.indexOf(" ", indexOfPreviousSpace);
                    // System.out.println(""+indexOfPreviousSpace + " " + indexOfSpace + " ");
                    if (indexOfSpace == -1) {
                        carSpeed = Integer.parseInt(carSequence.substring(indexOfPreviousSpace));
                    } else {
                        carSpeed = Integer.parseInt(carSequence.substring(indexOfPreviousSpace, indexOfSpace));
                    }
                    // System.out.println("carSpeed:" + carSpeed);

                    if (indexOfPreviousSpace == 0) {
                        previousCarSpeed = carSpeed;
                    }
                    if (previousCarSpeed >= carSpeed) {
                        carsAtFullSpeed++;
                    }
                    previousCarSpeed = carSpeed;
                    indexOfPreviousSpace = indexOfSpace + 1;
                }
                System.out.println("carsAtFullSpeed:" + carsAtFullSpeed);
                carsAtFullSpeed = 0;
            }
        }
        s.close();
    }
}
