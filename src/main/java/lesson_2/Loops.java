package lesson_2;

public class Loops {

  public static void main(String[] args) {

    int[] aArr = {-125, 0, 1, 2, 3, 4, 5};

    // FOR
    for (int i = 0; i < aArr.length; i++) {
      System.out.println(aArr[i]);
    }

    for (int i = 0; i < aArr.length; i++) {
      if (aArr[i] == 3) { // Əgər a 3 bərabərdirsə onda mətni çat et və döngüdən çıx
        System.out.println("This is happened");
        break;
      }
      System.out.println(aArr[i]);
    }

    // ENHANCED FOR
    for (int number : aArr) {
      System.out.println(number);
    }

    String[] wordArr = {"Hello", "from", "Java", "world"};

    for (int i = 0; i < wordArr.length; i++) {
      System.out.print(wordArr[i] + " ");
    }

    for (String word : wordArr) { // söz hansıki wordArr massivinin içindədir
      System.out.println(word);
    }


    // SONSUZ FOR LOOP
//    for (;;) {
//      System.out.println("Hello world");
//    }


    // WHILE
    int i = 10;
    while (i < 0) { // ilk öncə şərt yoxlanılacaq. Əgər true-dursa onda yerinə yetiriləcək.
      System.out.println(i);
      i--;
    }

    // DO .. WHILE
    int m = 0;
    do { // Ən azı 1 dəfə yerinə yetiriləcək və sonra şərt yoxlanılacaq.
      System.out.println(m);
      m++;
    } while (m == 0);

  }

}
