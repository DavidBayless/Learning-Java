class DieRoller {
  public static void main( String[]args ) {
    int numSides = Integer.parseInt(args[0]);
    double fRoll = Math.random() * numSides;
    double roll = Math.ceil(fRoll);
    System.out.println("A " + args[0] + " die rolled a : " + roll);
  }
}
