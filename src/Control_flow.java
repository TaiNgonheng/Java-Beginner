import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Control_flow {
  public static Scanner a = new Scanner(System.in);
  public static void main(String[] args) {
    String babe = "sorry Babe";
    for (int i = 1 ; i <= 10; i++){
      System.out.println(i+" "+babe);
    }


    int age = 20;
    if ( age+2 >= 22){
      System.out.println("You are an adult.");
    }else {
      System.out.println("You are a child");
    }

    boolean active = false;
    if(!active){
      System.out.println("The user is online.");
    }else {
      System.out.println("The user is not online.");
    }

    int myNumber = 20;
    if (!(myNumber>=20)){
      System.out.println("This is my age.");
    }else{
      System.out.println("It's not ma age.");
    }

    int year = 18;
    if (year != 18){
      System.out.println("You are an adult.");
    }else{
      System.out.println("You are an adult and u have learning for "+(year-6)+" years old");
    }

    int score = 100;
    boolean attandent = true;
    if (score == 100 && attandent == true){
      System.out.println("You are a good student");
    }else {
      System.out.println("You are going to retake and exam ");
    }

    System.out.println("please enter the number for each month: ");
    int month = a.nextInt();
    switch (month){
      case 1:
        System.out.println("january.");
        break;
      case 2:
        System.out.println("Febuary.");
        break;
      case 3:
        System.out.println("March.");
        break;
      case 4:
        System.out.println("April.");
        break;
      case 5:
        System.out.println("May.");
        break;
      case 6:
        System.out.println("June.");
        break;
      case 7:
        System.out.println("july");
        break;
      case 8:
        System.out.println("August");
        break;
      case 9:
        System.out.println("September");
        break;
      case 10:
        System.out.println("October");
        break;
      case 11:
        System.out.println("November");
        break;
      case 12:
        System.out.println("December");
        break;
    }
    sayHello("Ngonheng", 19);
    System.out.println(compare(2,1));
  }
  public static void sayHello(String name, int age){
    System.out.println("Hello "+name+" are u "+age+"?");
  }

  public static int compare(int a, int b){
    if (a>b){
      return a;
    }else {
      return b;
    }

  }

}
