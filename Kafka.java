import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Kafka {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.nextInt();
    ArrayList<Integer> clerks = new ArrayList<>();
    while (sc.hasNextInt()) {
      clerks.add(sc.nextInt());
    }
    System.out.print(passes(clerks));
  }

  static int passes(ArrayList<Integer> clerks) {
    int passes = 1;
    for (int i = 0; i < clerks.size() - 1; i++) {
      if (clerks.get(i) > clerks.get(i + 1)) {
        passes++;
      }
    }
    return passes;
  }
}
