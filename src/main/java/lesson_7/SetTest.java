package lesson_7;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

  public static void main(String[] args) {

    Set<String> set = new HashSet();
    // adding elements to Set
    set.add("Salam");
    set.add("hello");
    set.add("world");
    set.add("Salam");
    printData(set);

  }

  public static void printData(Set<String> set) {
    for (String s : set) {
      System.out.println(s);
    }
    System.out.println("--------");
  }

}
