package lesson_3.overload;

import java.util.Arrays;

public class Calculator {

  int sum(int a, int b) {
    return a + b;
  }

  int sum(int... nums) {
    int result = 0;
    for (int i = 0; i < nums.length; i++) {
      result += nums[i];
    }
//    for (int number : nums) {
//      result += number;
//    }
    return result;
  }

  void printSumData(int ... numbers) {
    int sum = sum(numbers);
    System.out.println(sum);
  }

}
