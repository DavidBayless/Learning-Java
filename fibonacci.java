class Fibonacci {
  public static void main( String[]args ) {
    int currNum = 1;
    int prevNum = 0;
    int numHold = 0;
    int degree = 100;

    for (int i = 0; i < degree; i++ ) {
      if (i == 0) {
        System.out.println(i);
      } else {
        System.out.println(currNum);
        numHold = currNum;
        currNum += prevNum;
        prevNum = numHold;
      }
    }
  }
}
