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

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */
        //Scanner
        Scanner s = new Scanner(System.in);
        String strNumberOfTestCases = s.nextLine();                 // Reading input from STDIN
        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT


        // Write your code here
        int numberOfTestCases = Integer.parseInt(strNumberOfTestCases);
        System.out.println("numberOfTestCases:" + numberOfTestCases);

        for (int i = 0; i < numberOfTestCases; i++) {
            String strTestCase = s.nextLine();
            int indexOfSpace = strTestCase.indexOf(" ");
            System.out.println("indexOfSpace:" + indexOfSpace);
            int deckSize = Integer.parseInt(strTestCase.substring(0, indexOfSpace));
            // System.out.println("deckSize:" + deckSize);
            
            int cardPosition = Integer.parseInt(strTestCase.substring(indexOfSpace + 1));
            // System.out.println("cardPosition:" + cardPosition);
        }

        s.close();
    }
}
