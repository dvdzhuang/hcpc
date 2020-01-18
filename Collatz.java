import java.util.Scanner;

public class Collatz {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long num = sc.nextLong();
    System.out.print(collatz(num, 0));
  }

  static long collatz(long cur, long sum) {
    if (cur == 1) {
      return sum + 1;
    } else if (cur % 2 == 0) {
      return collatz(cur / 2, sum + cur);
    } else {
      return collatz(3 * cur + 1, sum + cur);
    }
  }

}
