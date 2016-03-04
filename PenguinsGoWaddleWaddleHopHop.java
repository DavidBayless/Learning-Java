public class PenguinsGoWaddleWaddleHopHop {

  public static void main(String [] args) {
    String[] words = args[0].split(" ");
    for (int i = 0; i < words.length; i++) {
      String firstLetter = words[i].substring(0, 1);
      int length = words[i].length();
      String remainder = words[i].substring(1, length);
      words[i] = firstLetter.toUpperCase() + remainder;
    }
    String capitalized = String.join(" ", words);
    System.out.println(capitalized);
  }
}
