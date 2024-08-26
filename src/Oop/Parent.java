package Oop;

public class Parent {
  public static void main(String[] args) {
    car car1 = new car("tesla","2024 ","red",2);
    car car2 = new car("BMW", "M5 CS","Black",4);
    System.out.println("This is the Car II :"+car2.getName());
    System.out.println(car2.getModel());
    System.out.println(car2.getColor());
    System.out.println(car2.getDoor());

  }
}
