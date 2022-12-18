package lesson_6;

public enum WeekDays {

  MONDAY("Bazar ertəsi", 1),
  TUESDAY("Çərşənbə axşamı", 2),
  WEDNESDAY ("Çərşənbə", 3),
  THURSDAY ("Cümə axşamı", 4),
  FRIDAY("Cümə", 5),
  SATURDAY("Şənbə", 6),
  SUNDAY("Bazar", 7);

  String ad;
  int number;

  WeekDays(String ad, int number) {
    this.ad = ad;
    this.number = number;
  }

}
