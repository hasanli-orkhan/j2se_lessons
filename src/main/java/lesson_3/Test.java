package lesson_3;

public class Test {

  public static void main(String[] args) {

//    Device device = new Device(); // abstrakt sinifin instance-ı yaradıla bilməz
    Printer printer = new Printer();
    printer.scan();

    Device device = new Printer();
    device.print();
//    device.scan(); type erasure example. scan metodunu çağıra bilmərik
    ((Printer) device).scan(); // scan metodunu çağıra bilərik

  }

}
