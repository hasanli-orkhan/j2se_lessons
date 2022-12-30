package lesson_7;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

  public static void main(String[] args) {

    Map<Long, String> nameMap = new HashMap<>();
    nameMap.put(1L, "Elizamin");
    nameMap.put(2L, "Orkhan");
    nameMap.put(3L, "Qoshqar");

    Map<Integer, String> map = new HashMap<>();
    // putting elements to mup
    map.put(1, "Əsəd");
    map.put(null, "Əsəd");
    map.put(2, "Əsəd");
    map.put(3, "Orxan");
    map.put(4, "Əsəd");

    // getting element from map by key
    String s = map.get(2);
    System.out.println(s);

    printData(map);
  }

  public static void printData(Map<Integer, String> map) {
    // using enhanced for loop. Getting Entry<K, V> from entrySet
    for (Entry<Integer, String> entry : map.entrySet()) {
      System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
    }
    System.out.println("------");
  }

}
