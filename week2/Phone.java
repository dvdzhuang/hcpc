import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Phone {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.next();
    while (sc.hasNext()) {
      boolean consis = true;
      ArrayList<String> nums = new ArrayList<>();
      int t = sc.nextInt();
      for (int i = 0; i < t; i++) {
        nums.add(sc.next());
      }
      Collections.sort(nums);
      for (int j = 0; j < t - 1; j++) {
        String s = nums.get(j);
        String s2 = nums.get(j + 1);
        if (s2.length() >= s.length() && s2.substring(0, s.length()).equals(s)) {
          consis = false;
          break;
        }
        if (!consis) {
          break;
        }
      }
      if (consis) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}
