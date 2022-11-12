package lesson_2;

public class Loops {

  public static void main(String[] args) {

    int[] a = {-125, 0, 1, 2, 3, 4, 5};

    // FOR
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }

    for (int i = 0; i < a.length; i++) {
      if (a[i] == 3) { // Əgər a 3 bərabərdirsə onda mətni çat et və döngüdən çıx
        System.out.println("This is happened");
        break;
      }
      System.out.println(a[i]);
    }

    // WHILE

    // DO .. WHILE

  }

}
