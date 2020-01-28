import java.util.Scanner;

public class Matrix {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ca = 1;
    while(sc.hasNextInt()) {
      int a = sc.nextInt();
      int b = sc.nextInt() * -1;
      int c = sc.nextInt() * -1;
      int d = sc.nextInt();
      int det = a * d - b * c;
      a /= det;
      b /= det;
      c /= det;
      d /= det;
      System.out.printf("Case %d:\n%d %d\n%d %d\n", ca, d, b, c, a);
      ca++;
    }
  }
}
