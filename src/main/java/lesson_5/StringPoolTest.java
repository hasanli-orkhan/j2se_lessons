package lesson_5;

public class StringPoolTest {

  public static void main(String[] args) {

    String a = "hello";
    String b = "hello";

    Long customLong = 5L;

    // ==
    System.out.println(a == b);

    // equals()
    System.out.println(a.equals(b));

    // new String()
    String c = new String("hello");
    System.out.println(a == c);

    // intern();
    String d = c.intern();
    System.out.println(d == c);
    System.out.println(d == a);


  }

}
