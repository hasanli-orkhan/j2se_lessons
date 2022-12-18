package lesson_6;

public class Main {

  /**
   * This is main method
   * @param args This is arguments
   */
  public static void main(String[] args) {

    StaticKeywordTest.doJob();

    StaticKeywordTest staticKeywordTest = new StaticKeywordTest();
    staticKeywordTest.nonStaticMethod();

    // This is one line comment

    /*
      This is multiline
      comment
     */

  }

  /**
   * This is javadoc
   * @param abc
   * @param i
   * @return method returns double
   */
  public static double testJavaDoc(String abc, int i) {
    Math.pow(2, 4);
    return 0;
  }

}
