import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exam {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    ArrayList<Integer> rooms = new ArrayList<>();
    for (int i = 0; i < a; i++) {
      rooms.add(sc.nextInt());
    }
    ArrayList<Integer> copy = new ArrayList<>();
    copy.addAll(rooms);
    Collections.sort(copy);
    Collections.reverse(copy);
    int sum = 0;
    for (int i = 1; i < copy.size(); i++) {
      sum += copy.get(i);
    }
    if (sum < copy.get(0)) {
      System.out.println("impossible");
    } else {
      for (int i = 0; i < copy.size(); i++) {
        ArrayList<Integer> temp = new ArrayList<>();
        temp.addAll(rooms);
        int count = 0;
        while (temp.contains(copy.get(i))) {
          System.out.printf("%d ", temp.indexOf(copy.get(i)) + count + 1);
          temp.remove(temp.indexOf(copy.get(i)));
          count++;
        }
        i += count - 1;
      }
    }
  }
}
