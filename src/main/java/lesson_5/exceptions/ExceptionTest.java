package lesson_5.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

  public static void main(String[] args){

//    example1();
//    example2();
    try {
      example3();
    } catch (Exception e) {
      System.out.println("Istisna bash verdi");
    }

  }

  public static void example1() {
    String a = null;
    try {
      System.out.println(a.intern());
    } catch (Exception e) {
      System.out.println("Istisna bash verdi");
    }
  }

  public static void example2() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Reqem daxil edin: ");
    Integer b = null;
    try {
      b = scanner.nextInt();
    } catch (InputMismatchException i) {
      System.out.println("Siz reqem daxil etmemisiniz");
    }  catch (RuntimeException r) {
      System.out.println("Run zamani istisna bash verdi");
    } finally {
      System.out.println("Final");
    }
    System.out.println("Daxil etdiyiniz reqem: " + b);
  }

  public static void example3() throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Reqem daxil edin: ");
    Integer b = null;
    try {
      b = scanner.nextInt();
    } catch (InputMismatchException i) {
      throw new Exception();
    }
  }

}
