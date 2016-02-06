class FirstVariable {
  public static void main ( String[]args ) {
    String message = "Initial value";
    System.out.println(message);
  }
}

class SecondVariable {
  public static void main ( String[]args ) {
    String blahblah = "Blah Blah Blah";
    System.out.println("I like to say: "+blahblah);
  }
}

class DataTypes {
  public static void main ( String[]args ) {
    String string = "String";
    char character = 'C';
    int number = 2;
    float decimal = 98.6f;
    boolean isTrue = false;
    byte smallNum = 127;
    short smallishNum = 32767;
    long bigNum = 2140000001;
    double lotsOfDecimals = 2.340583405830927037452348509238405893059;

    System.out.println("String: " + string);
    System.out.println("char: " + character);
    System.out.println("int: " + number);
    System.out.println("float: " + decimal);
    System.out.println("boolean: " + isTrue);
    System.out.println("byte: " + smallNum);
    System.out.println("short: " + smallishNum);
    System.out.println("long: " + bigNum);
    System.out.println("double: " + lotsOfDecimals);


  }
}
