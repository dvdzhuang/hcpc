import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class RoomWidths {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int room = sc.nextInt();
    sc.nextInt();
    ArrayList<Integer> parts = new ArrayList<>();
    while (sc.hasNextInt()) {
      parts.add(sc.nextInt());
    }
    String s = "";
    for (Integer i : widths(room, parts)) {
      s += i + " ";
    }
    s += room;
    System.out.print(s);
  }

  static ArrayList<Integer> widths(int room, ArrayList<Integer> parts) {
    HashMap<Integer, Integer> ws = new HashMap();
    for (int i = 0; i < parts.size(); i++) {
      for (int j = 0; j < i; j++) {
        ws.put(parts.get(i) - parts.get(j), 1);
      }
      ws.put(room - parts.get(i), 1);
      ws.put(parts.get(i), 1);
    }
    ArrayList<Integer> wds = new ArrayList<>();
    wds.addAll(ws.keySet());
    Collections.sort(wds);
    return wds;
  }
}
