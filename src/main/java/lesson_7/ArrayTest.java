package lesson_7;

import java.util.Arrays;

public class ArrayTest {

  public static void main(String[] args) {
    String[] names = new String[5];
    names[0] = "Hello";
    names[1] = "World";
    names[2] = "Orkhan";
    names[3] = "Salam";
    names[4] = "Əlizamin";
    printData(names);

    String[] newArray = addElementToArray("Necesen", names);
    printData(newArray);

    String[] testsArr = addElementToArray_2("Test", names);
    printData(testsArr);

  }

  public static String[] addElementToArray(String name, String[] names) {
    String[] newArray = new String[names.length + 1];
    for (int i = 0; i < names.length; i++) {
      newArray[i] = names[i];
    }
    newArray[newArray.length - 1] = name;
    return newArray;
  }

  public static String[] addElementToArray_2(String name, String[] names) {
    String[] newArray = Arrays.copyOf(names, names.length);
    newArray[names.length - 1] = name;
    return newArray;
  }

  public static void printData(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    System.out.println("--------------");
  }

}
