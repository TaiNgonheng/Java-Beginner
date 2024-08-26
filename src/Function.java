public class Function {
  public static void main(String[] args) {
    int[] numbers  = {1,21,3,4,5,6,7,8,9,10};
    int maxFound = getMax(numbers );
    System.out.println(maxFound);
  }
  public static int getMax(int[] numbers ) {
    int max = numbers[0];
    for (int number : numbers){
      if (number > max ){
          max = number;
      }
    }
    return max;
  }
}
