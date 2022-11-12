package lesson_1;

public class JavaOperators {

  public static void main(String[] args) {

    /*
      UNARY operator
     */

    // Prefix
    int a = 5;
    System.out.println("a: " + ++a);
    int b = 5;
    System.out.println("b: " + --b);

    // Postfix
    int c = 5;
    System.out.println("c: " + c++);
    System.out.println("c: " + c);

    // ~ - !
    int c1 = 10;
    System.out.println("c1: " + -c1);
    System.out.println("c1: " + -c1);
    boolean c2 = true;
    System.out.println("c2: " + !c2);

    /*
      Arithmetic operators
     */

    // +, -, *, /, %
    int d = 1;
    int e = 4;
    int f = d + e;
    System.out.println("Sum result: " + f);

    /*
      Shift operators << >> >>>
     */
    // < > <= >= instanceof == !=
    int g = 5;
    int h = 6;
    boolean isGreater = g > h;
    boolean isLess = g < h;
    boolean notEquals = g != h;
    System.out.println("isGreater: " + isGreater);
    System.out.println("isLess: "  + isLess);
    System.out.println("not equals: " + notEquals);

    /*
      Bitwise operators
     */
    // bitwise AND - &
    int i = 4;
    int j = 5;
    boolean andExample1 = (i > 0) & (j > 0);
    System.out.println("andExample1: " + andExample1);

    boolean andExample2 = (i < 0) & (j > 0);
    System.out.println("andExample2: " + andExample2);

    // bitwise inclusive OR - |
    boolean orExample = (i < 0) | (j > 0);
    System.out.println("orExample: " + orExample);

    // bitwise exclusive OR - ^
    boolean exclusiveOrExample = (i < 0) ^ (j > 0);
    System.out.println("exclusiveOrExample: " + exclusiveOrExample);

    /*
      Logical operators
     */

    // AND - &&
    boolean logicalAndExample = (i < 0) && (j > 0);
    System.out.println("logicalAndExample: " + logicalAndExample);

    // OR - ||
    boolean logicalOrExample = (i < 0) || (j > 0);
    System.out.println("logicalOrExample: " + logicalOrExample);

    /*
      Ternary operator ? :
     */
    String k = (i < 0) ? "i sıfırdan azdır" : "i sıfırdan çoxdur";
    System.out.println("k: " + k);

    /*
      Assignment operators
      = += -= *= /= %= &= ^= |= <<= >>= >>>=
     */
    int l = 5;
    System.out.println("l: " + l);
    int m = l+=2; // m = l + 2
    System.out.println("m: " + m);

    int kkk = 5;
    kkk = kkk + 2;
    kkk += 2;

  }

}
