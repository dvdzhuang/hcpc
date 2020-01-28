import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Wood {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.nextInt();
    while (sc.hasNextInt()) {
      int count = sc.nextInt();
      ArrayList<Integer> cus = new ArrayList<>();
      for (int i = 0; i < count; i++) {
        int cc = sc.nextInt();
        int num = 0;
        for (int j = 0; j < cc; j++) {
          num += sc.nextInt();
        }
        cus.add(num);
      }
      Collections.sort(cus);
      double a = 0;
      double sum = 0;
      for (int i = 0; i < cus.size(); i++) {
        a += cus.get(i);
        sum += a;
      }
      sum /= cus.size();
      System.out.println(sum);
    }
  }
}
