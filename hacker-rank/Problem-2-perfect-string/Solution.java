import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'perfectSubstring' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static int perfectSubstring(String s, int k) {
    // Write your code here
    Map<Integer, Integer> countKeeper = new HashMap<>();
    int inputStringLength = s.length();
    for(int i = 0; i < inputStringLength; i++) {
      for (int pivotIndex = i; pivotIndex < (inputStringLength - pivotIndex); pivotIndex++) {
        int key = Integer.parseInt("" + s.charAt(i));
        countKeeper = upsertMap(key, countKeeper);
        if (isCountGreaterThanAllowed(countKeeper, k)) {
          countKeeper.clear();
          continue;
        }
      }
    }
    return 0;
    }

    private static boolean isCountGreaterThanAllowed(Map<Integer, Integer> countKeeper, int allowedLimit) {
      if (countKeeper != null) {
        for (int key: countKeeper.keySet()) {
          if (countKeeper.get(key) > allowedLimit) {
            return true;
          }
        }
      } return false;
    }

    private static Map<Integer, Integer> upsertMap(int key, Map<Integer, Integer> countKeeper) {
      if (countKeeper == null) {
        countKeeper = new HashMap<>();
      }
      if (countKeeper.containsKey(key)) {
        countKeeper.put(key, countKeeper.get(key) + 1);
      } else {
        countKeeper.put(key, 1);
      }
      return countKeeper;
    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.perfectSubstring(s, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
