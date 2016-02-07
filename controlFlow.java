class BasicBranching {
  public static void main ( String[]args ) {
    String blah = "Hello";
    if (blah == "Hello") {
      System.out.println(blah + " World!");
    } else {
      System.out.println(blah + " Loser!");
    }
  }
}

class TruthyAndFalsy {
  public static void main ( String[]args ) {
    String empty = "";
    String notEmpty = "blah";
    int zero = 0;
    int one = 1;

    if (empty == "") {
      System.out.println("truthy string empty");
    } else {
      System.out.println("falsy string empty");
    }

    if (zero ==  3) {
      System.out.println("truthy num zero");
    } else {
      System.out.println("falsy num zero");
    }

    if (notEmpty == "") {
      System.out.println("truthy string notEmpty");
    } else {
      System.out.println("falsy string notEmpty");
    }

    if (one == 1) {
      System.out.println("truthy num one");
    } else {
      System.out.println("falsy num one");
    }
  }
}
