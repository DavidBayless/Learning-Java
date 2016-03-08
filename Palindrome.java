public class Palindrome {
  public static void main(String [] args) {
    String str = args[0];
    String revStr = new StringBuilder(str).reverse().toString();
    String [] strArr = str.split(" ", -1);
    String [] revStrArr = revStr.split(" ", -1);
    str = String.join("", strArr);
    revStr = String.join("", revStrArr);
    System.out.println(revStr);
    System.out.println(str);
    if (revStr.equals(str)) {
      System.out.println("Is a Palindrome");
    } else {
      System.out.println("Is not Palindrome");
    }
  }
}
