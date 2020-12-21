import java.util.Random;

class AllRandomIntInRange {

  public static void main(String[] args) {
    // input range of random integer values
    int startRange = 1, endRange = 100;
    if (startRange > endRange) {
      System.out.println("Invalid input range! Start should be greater than or equal to end");
      return;
    }
    // create an empty array of the size [(endRange - startRange) + 1]
    int[] arr = new int[(endRange - startRange) + 1];

    // fill the array initially starting from startRange up to endRange
    for (int i = 0; i < arr.length; i++) {
      arr[i] = startRange + i;
    }

    int pivot = arr.length - 1;

    while (pivot > 0) {
      //System.out.println("pivot:" + pivot);
      // generate a random int in the range startRange to pivot
      int randomInt = new Random().nextInt(pivot);
      //System.out.println("randomInt:" + randomInt);

      //System.out.println("Before swap:" + arr[randomInt] + " , " + arr[pivot]);
      // swap values at randomInt and pivot
      arr[randomInt] = arr[randomInt] + arr[pivot];
      //arr[2]       =      arr[2]   +    arr[10]
      //    12       =         2     +     10
      arr[pivot] = arr[randomInt] - arr[pivot];
      //arr[10]      =      arr[2]   -    arr[10]
      //    2       =         12    -      10
      arr[randomInt] = arr[randomInt] - arr[pivot];
      //arr[2]      =      arr[2]   -    arr[10]
      //    2       =         12    -      10
      //System.out.println("After swap:" + arr[randomInt] + " , " + arr[pivot]);

      // decrease pivot by 1
      pivot--;
    }

    // print output
    printArray(arr);
  }

  private static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);

      if (i == arr.length - 1) {
        System.out.println();
      } else {
        System.out.print(", ");
      }
    }
  }
}


//              50 (1 - 100)
//
//         27 (1-49)      60 (51-100)
//     
//     1 (1-26)   (27-48)