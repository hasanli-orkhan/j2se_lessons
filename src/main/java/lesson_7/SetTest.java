package lesson_7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {

  public static void main(String[] args) {

//    List<String> list = new ArrayList<>();
//    // adding elements to Set
//    list.add("Salam");
//    list.add("hello");
//    list.add("world");
//    list.add("Salam");
//    printData(list);

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

  public static void printData(List<String> list) {
    for (String s : list) {
      System.out.println(s);
    }
    System.out.println("--------");
  }
}
