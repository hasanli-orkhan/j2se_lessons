package lessson_4;

import lessson_4.testing_package_friendly.Truck;

public class Main {

  public static void main(String[] args) {
    
    Vehicle vehicle = new Vehicle();
//    car.color = "Red"; // Giriş əldə etmək olmur çünki private açar sözü istifadə edilib
    vehicle.setColor("Red");
    String color = vehicle.getColor();
    System.out.println(color);
    vehicle.engine = 1;
//    double engine = car.getEngine();
    System.out.println(vehicle.engine);
    vehicle.model = "Mercedes";
    System.out.println(vehicle.model);
    vehicle.doorsNum = 5;

    Truck truck = new Truck();
    truck.doorsNum = 5;

    Vehicle vehicle1 = new Vehicle("blue", "Audi", 2.0, 2);
    System.out.println(vehicle1);
        vehicle1.showInfo();
  }

}
