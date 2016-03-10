import java.io.*;

public class Readfile {
  public static void main(String [] args) {

    try {
      Reader reader = new FileReader(args[0]);
      try {
        int data = reader.read();
        int characters = 0;
        int words = 0;
        int lines = 0;
        while (data != -1) {
          char curr = (char) data;
          if(curr == '\r' || curr == '\n') {
            words++;
            lines++;
          } else if (curr == ' ') {
            words++;
          } else {
            characters++;
          }
        }
        System.out.println(characters);
        System.out.println(words);
        System.out.println(lines);
        reader.close();
      } catch (IOException error) {
        System.out.println(error);
      }
    } catch (FileNotFoundException err) {
      System.out.println(err);
    }

    // while (data != -1) {
    //   char dataChar = (char) data;
    //   data = reader.read();
    // }
  }
}
