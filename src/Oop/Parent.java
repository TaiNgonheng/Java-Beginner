package Oop;

public class Parent {
  public static void main(String[] args) {
    car car1 = new car("tesla","2024 ","red",2);
    car car2 = new car("BMW", "M5 CS","Black",4);
    car car3 = new car();
//    car Car = new car();
    System.out.println("This is the Car II :"+car2.getName());
    System.out.println(car2.getModel());
    System.out.println(car2.getColor());
    System.out.println(car2.getDoor());
    car2.move();

    System.out.println("This is the Car I :"+car1.getName());
    System.out.println(car1.getModel());
    System.out.println(car1.getColor());
    System.out.println(car1.getDoor());
    car1.stop();


  }
}
class plane{
  private String name;
  private String model;
  private String color;
  private int door;
  private int engine;
  public plane(String name, String model, String color, int door, int engine){
    this.name = name;
    this.model= model;
    this.color= color;
    this.door = door;
    this.engine = engine;
  }
}

