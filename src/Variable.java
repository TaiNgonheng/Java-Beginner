public class Variable {
  public static void main(String[] args) {
    String name = "Heng";
    int age = 19;
    boolean active = true;
    double height = 1.76;
    int max = Integer.MAX_VALUE;
    int min = Integer.MIN_VALUE;
    byte smallest = Byte.MAX_VALUE;
    byte Biggest = Byte.MIN_VALUE;
    Long maxLong = Long.MAX_VALUE;
    Long minLong = Long.MIN_VALUE;
    float weight = 54.5f;
    char letter = 'a';

    System.out.println("this is the char in Java"+letter);
    System.out.println("this is ma whole weight: "+weight );
    System.out.println("This is the Maximum value for max Integer: "+max);
    System.out.println("this is the minimum value for min Integer: "+min);
    System.out.println("this is the smallest of Byte: "+smallest);
    System.out.println("this is the Biggest of Byte: "+ Biggest);
    System.out.println("this is the smallest of long: "+ minLong);
    System.out.println("this is the Biggest of long: "+ maxLong);



    System.out.println("Hello "+ name);
    System.out.println("I am "+age+"years old");
    System.out.println("U're reading my text :-)."+active);
    System.out.println("I have "+height+"m");
  }
}
