package lesson_3.overload;

public class TestCalculator {

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    calculator.printSumData(4, 5, 2, 3, 1);

    // println is overloaded method
    System.out.println(5);
    System.out.println("abc");
    System.out.println('v');
  }

}
