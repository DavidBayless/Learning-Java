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
