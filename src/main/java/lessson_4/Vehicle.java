package lessson_4;

public class Vehicle extends Object {

  /*
    Fields
   */

  private String color; // this field is private  // UML - minus
  String model; // this field if default (package-friendly) // UML ~ tilda
  public double engine; // this field is public. // UML + plus
  protected int doorsNum; // this field is protected  // UML # sharp

  // Constructors
  public Vehicle() {}

  public Vehicle(String color, String model, Double engine, Integer doorsNum) {
    this.color = color;
    this.engine = engine;
    this.model = model;
    this.doorsNum = doorsNum;
  }


  /*
    Getters
   */
  public String getColor() {
    return color;
  }

/*  public double getEngine() {
    return engine;
  }*/

/*  public int getDoorsNum() {
    return doorsNum;
  }*/

  /*
      Setters
     */
  public void setColor(String color) {
    this.color = color;
  }

  public void showInfo() {
    System.out.println(color);
    System.out.println(model);
    System.out.println(engine);
    System.out.println(doorsNum);
  }

  @Override
  public String toString() {
    return "Vehicle{" +
        "color='" + color + '\'' +
        ", model='" + model + '\'' +
        ", engine=" + engine +
        ", doorsNum=" + doorsNum +
        '}';
  }
}
