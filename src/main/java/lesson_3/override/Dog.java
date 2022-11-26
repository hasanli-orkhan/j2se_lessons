package lesson_3.override;

public class Dog extends Animal {

  @Override // overloaded method
  void speak() {
    System.out.println("Woof");
  }
}
