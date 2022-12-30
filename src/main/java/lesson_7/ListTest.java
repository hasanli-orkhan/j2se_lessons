package lesson_7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTest {

  public static void main(String[] args) {

    List<String> names = new ArrayList<>();
    names.add("Hello");
    names.add("World");
    names.add("Orkhan");
    names.add("Elizamin");
    printList(names);

    boolean isExists = names.contains("World");
    if (isExists) {
      System.out.println("Element var");
    }

    System.out.println("Bir element: " + names.get(2));
    System.out.println("---------");

    names.remove("World");
    printList(names);

    names.add("Salam");


    // ArrayList list = new ArrayList();

    List<String> list2 = new ArrayList<>();

    // adding element to list
    list2.add("world");
    list2.add("test");
    list2.add("Hello");
    printList(list2);

    // checking if element contains in list
    boolean world = list2.contains("world");
    System.out.println(world);

    // removing element from list
    list2.remove("test");
    printList(list2);

    // getting element by index from list
    String s = list2.get(0);
    System.out.println(s);

  }

  public static void printList(List<String> list) {
    // for loop - size();
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
    System.out.println("-----------");
  }

  public static void printList_2(List<String> list) {
    for (String s : list) {
      System.out.println(s);
    }
  }

}
