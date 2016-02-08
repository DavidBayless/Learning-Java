class FunctionTesting {
  public static void foo() {
    System.out.println("Foo");
  }

  public static void main( String[]args ) {
    foo();
    bar();
    System.out.println("FooBar!");
  }

  public static void bar() {
    System.out.println("Bar");
  }
}

class Kata {
  public static int rentalCarCost(int d) {
    // Your solution here
    int total = 40;
    total *= d;
    if (d > 6) {
      total -= 50;
    } else if (d > 2) {
      total -= 20;
    }
    System.out.println(total);
    return total;
  }

  public static void main( String[]args ) {
    rentalCarCost(1);
    rentalCarCost(2);
    rentalCarCost(3);
    rentalCarCost(6);
    rentalCarCost(7);
    rentalCarCost(9);


  }
}
