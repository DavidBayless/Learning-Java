class Powers {
  public static void main( String[]args ) {
    int base = 4;
    int exp = 3;
    int value = 1;
    for(int i = 1; i <= exp; i++) {
      value *= base;
    }
    System.out.println(value);
  }
}
