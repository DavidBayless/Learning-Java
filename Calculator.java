import java.io.Console;
import java.util.Arrays;
import java.io.IOException;

public class Calculator {

  public static void main (String [] args) throws IOException {
    Console console = System.console();
    if (console == null) {
      System.err.println("No console.");
      System.exit(1);
    }
    double total = 0;
    boolean calculating = true;
    while (calculating ==  true) {
      String opAndNum = console.readLine();
      if (opAndNum.equals("end")) {
        System.out.println("Calculator Ended");
        calculating = false;
      } else {
        double num = Double.parseDouble(opAndNum);
        total += num;
        System.out.println(total);
      }
    }
  }
}
