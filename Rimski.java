import java.util.Scanner;

public class Rimski {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String roman = sc.next();
    boolean containsI;
    boolean containsV;
    boolean containsL;
    if (roman.contains("VI") && !roman.contains("VII")) {
      roman = roman.substring(0, roman.indexOf("V")) + "IV";
    }
    if (roman.equals("LXXI")) {
      roman = "XLIX";
    }
    if (roman.contains("LX") && !roman.contains("LXX")) {
      roman = roman.substring(0, roman.indexOf("L")) + "XL"
              + roman.substring(roman.indexOf("X") + 1);
    }
    if (roman.contains("X") && roman.contains("I") && !roman.contains("II") && !roman.contains("V")
            && !roman.contains("XL") && !roman.contains("C") && !roman.contains("IX")) {
      roman = roman.substring(0, roman.indexOf("X")) + roman.substring(roman.indexOf("X") + 1)
              + "X";
    }
    System.out.println(roman);
  }

}
