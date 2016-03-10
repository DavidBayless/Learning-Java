public class Palindrome {
  public static void main(String [] args) {
    String str = args[0];
    String revStr = new StringBuilder(str).reverse().toString();
    String [] strArr = str.split("", -1);
    String [] revStrArr = revStr.split("", -1);
    for (int i = 0; i < strArr.length; i++) {
      if (strArr[i].equals(",") || strArr[i].equals("!") || strArr[i].equals(";") || strArr[i].equals("\\") || strArr[i].equals("\"") || strArr[i].equals("?") || strArr[i].equals(".") || strArr[i].equals(":") || strArr[i].equals("(") || strArr[i].equals(")") || strArr[i].equals("'")) {
        strArr[i] = " ";
      }
    }
    for (int i = 0; i < revStrArr.length; i++) {
      if (revStrArr[i].equals(",") || revStrArr[i].equals("!") || revStrArr[i].equals(";") || revStrArr[i].equals("\\") || revStrArr[i].equals("?") || revStrArr[i].equals(".") || revStrArr[i].equals("\"") || revStrArr[i].equals(":") || revStrArr[i].equals("(") || revStrArr[i].equals(")") || revStrArr[i].equals("'")) {
        revStrArr[i] = " ";
      }
    }
    str = String.join("", strArr).toLowerCase();
    revStr = String.join("", revStrArr).toLowerCase();
    strArr = str.split(" ", -1);
    revStrArr = revStr.split(" ", -1);
    str = String.join("", strArr).toLowerCase();
    revStr = String.join("", revStrArr).toLowerCase();
    System.out.println(revStr);
    System.out.println(str);
    if (revStr.equals(str)) {
      System.out.println("Is a Palindrome");
    } else {
      System.out.println("Is not Palindrome");
    }
  }
}
