package lesson_6;

import java.util.Arrays;

public class EnumTest {

  // This is constants
  public static final String MONDAY = "Bazar ertəsi";
  public static final String TUESDAY = "Çərşənbə axşamı";

  public static void main(String[] args) {
    WeekDays[] weekDays = WeekDays.values();
    for (int i = 0; i < weekDays.length; i++) {
      System.out.println(weekDays[i].ad);
      System.out.println(weekDays[i].number);
    }
  }


}
