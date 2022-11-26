package lesson_3;

public class Cassier extends Device {

  @Override
  public void print() {
    System.out.println("Hello from Cassier class");
  }

  @Override
  public void write() {
    System.out.println("Writing data with Cassier");
  }

}
