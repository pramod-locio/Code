import java.util.Random;

public class NumberGenerator {

  public int randNum(int min, int max){
    Random random = new Random();
    return (random.nextInt(max - min + 1) + min);
  }
  public String GeneratedNumber(String name)
  {
    int min=6; // Setting the minimum range for random number
    int max=15; // Setting the maximum range for random number
    int rndNum = randNum(min, max);
    String finalString = name + rndNum;
    return finalString;
  }
  
  public static void main(String args[]) {
    NumberGenerator s=new NumberGenerator();
    String response = s.GeneratedNumber("test string");
    System.out.println(response);
  }
}
