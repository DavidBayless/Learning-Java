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
      System.out.println("falsy string");
    } else {
      System.out.println("truthy string");
    }

    if (zero ==  3) {
      System.out.println("falsy num");
    } else {
      System.out.println("truthy num");
    }

    if (notEmpty == "") {
      System.out.println("falsy string");
    } else {
      System.out.println("truthy string");
    }

    if (one == 1) {
      System.out.println("falsy num");
    } else {
      System.out.println("truthy num");
    }
  }
}
