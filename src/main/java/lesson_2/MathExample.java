package lesson_2;

import lesson_2.calc.SimpleCalculator;

public class MathExample {

  public static void main(String[] args) {
    double result = Math.pow(2, 3);
    System.out.println(result);
    int intResult = (int) result;
    System.out.println(intResult);
    int resultOfSum = SimpleCalculator.sum(5, 132);
    System.out.println(resultOfSum);
  }

}
