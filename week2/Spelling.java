import java.util.Scanner;

public class Spelling {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.nextLine();
    int c = 1;
    while(sc.hasNextLine()) {
      String s = sc.nextLine();
      String r = "";
      int prev = 0;
      for (int i = 0; i < s.length(); i++) {
        int ch;
        switch (s.charAt(i)) {
          case 'a': ch = 2; break;
          case 'b': ch = 22; break;
          case 'c': ch = 222; break;
          case 'd': ch = 3; break;
          case 'e': ch = 33; break;
          case 'f': ch = 333; break;
          case 'g': ch = 4; break;
          case 'h': ch = 44; break;
          case 'i': ch = 444; break;
          case 'j': ch = 5; break;
          case 'k': ch = 55; break;
          case 'l': ch = 555; break;
          case 'm': ch = 6; break;
          case 'n': ch = 66; break;
          case 'o': ch = 666; break;
          case 'p': ch = 7; break;
          case 'q': ch = 77; break;
          case 'r': ch = 777; break;
          case 's': ch = 7777; break;
          case 't': ch = 8; break;
          case 'u': ch = 88; break;
          case 'v': ch = 888; break;
          case 'w': ch = 9; break;
          case 'x': ch = 99; break;
          case 'y': ch = 999; break;
          case 'z': ch = 9999; break;
          default: ch = 0; break;
        }
        if ((prev % 10) == (ch % 10)) {
          r += " " + ch;
        } else {
          r += ch;
        }
        prev = ch;
      }
      System.out.printf("Case #%d: %s\n", c, r);
      c++;
    }
  }
}
