import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Datum {

  public static void main(String[] args) {
    ArrayList<Integer> ms = new ArrayList<>(Arrays.asList(31, 28, 31, 30, 31, 30, 31, 31, 30, 31,
            30, 31));
    Scanner sc = new Scanner(System.in);
    int date = sc.nextInt();
    int month = sc.nextInt();
    int sum = 0;
    for (int i = 0 ; i < month - 1; i++) {
      sum += ms.get(i);
    }
    sum += date;
    int day = sum % 7;
    switch (day) {
      case 0:
        System.out.print("Wednesday");
        break;
      case 1:
        System.out.print("Thursday");
        break;
      case 2:
        System.out.print("Friday");
        break;
      case 3:
        System.out.print("Saturday");
        break;
      case 4:
        System.out.print("Sunday");
        break;
      case 5:
        System.out.print("Monday");
        break;
      default:
        System.out.print("Tuesday");
        break;
    }
  }
}
