/**
 * Aim: to reverse the input String but the hash(#) in it will remain at its position.
 * 
 * Sample Input: apple#iphone#good
 * Sample Output: dooge#nohpie#lppa
 */

class ReverseStringButIgnoreHash {

  public static void main(String[] args) {
    if (args.length < 1) {
      System.out.println("Please provide input arguments!");
      return;
    }

    char[] inputArr = args[0].toCharArray();
    int i = 0;
    int j = inputArr.length - 1;

    while (i < inputArr.length / 2) {

      if (inputArr[i] != '#') {
        if (inputArr[j] != '#') {

          //swap the character value at the index i with index j
          char temp = inputArr[i];
          inputArr[i] = inputArr[j];
          inputArr[j] = temp;

          i++;// move i ahead 
          j--;// move j backwards
        } else {
          
          j--;// move j backwards
        }
      } else {
        i++;// move i ahead 
      }
    }
    System.out.println(inputArr);
  }
}