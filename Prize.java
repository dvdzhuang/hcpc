import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Prize {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    sc.nextInt();
    int max = sc.nextInt();
    ArrayList<Integer> prices = new ArrayList<>();
    while (sc.hasNextInt()) {
      prices.add(sc.nextInt());
    }
    System.out.print(horn(max, prices));
  }

  static int horn(int max, ArrayList<Integer> prices) {
    ArrayList<Integer> arr = prices;
    Collections.sort(arr);
    if (arr.get(0) > max) {
      return 1;
    }
    int horns = prices.size();
    for (int i = arr.size() - 1; i > 0; i--) {
      if (arr.get(i) + arr.get(i - 1) > max) {
        horns--;
      } else {
        return horns;
      }
    }
    return horns;
  }
}
