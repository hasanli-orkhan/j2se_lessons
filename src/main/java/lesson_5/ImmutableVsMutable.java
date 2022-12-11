package lesson_5;

public class ImmutableVsMutable {

  public static void main(String[] args) {

    String a = "Hello";
    System.out.println(a);

    StringBuilder aBuilder = new StringBuilder();
    aBuilder.append("Hello");
    aBuilder.append(" ");
    aBuilder.append("World");
    System.out.println(aBuilder.toString());

  }

}
