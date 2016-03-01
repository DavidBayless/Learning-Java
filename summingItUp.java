class Sum  {
  public static void main(String [] args) {
    System.out.println(sum(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    System.out.println(multiply(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    System.out.println(divide(Double.parseDouble(args[0]), Double.parseDouble(args[1])));
    System.out.println(subtract(Integer.parseInt(args[0]), Integer.parseInt(args[1])));

  }

  public static int sum(int x, int y) {
    return x + y;
  }

  public static int multiply(int x, int y) {
    return x * y;
  }

  public static double divide(double x, double y) {
    return x / y;
  }

  public static int subtract(int x, int y) {
    return x - y;
  }
}
