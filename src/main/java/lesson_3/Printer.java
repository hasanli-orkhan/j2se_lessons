package lesson_3;


public class Printer extends Device {

  Cartridge cartridge;
  Paper paper;

  public void print() {
    System.out.println("Hello from Printer class");
  }

  public void write() {
    System.out.println("Writing data with Printer");
  }

  void scan() {
    System.out.println("Wait for scanning data");
  }
}
