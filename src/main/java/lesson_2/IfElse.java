package lesson_2;

public class IfElse {


  public static void main(String[] args) {

    /*
      IF, IF ... ELSE, IF ... ELSE IF, IF ... ELSE IF ... ELSE
     */

    int n = 5;
    int o = 4;

    // IF
    if (n > o) {
      System.out.println("n > 0");
    }

    // IF ... ELSE
    if (n < o) {
      System.out.println("n < o");
    } else {
      System.out.println("n > o");
    }

    // IF ... ELSE IF
    if (n < o) {
      System.out.println("n < o");
    } else if (n == o) {
      System.out.println("n == o");
    } else {
      System.out.println("n > o");
    }
  }

}
