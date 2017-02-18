package boxfan.driver;
import boxfan.fancase.FanCase;
import boxfan.fanblades.FanBlades;
import boxfan.motor.Motor;
import boxfan.controlswitch.ControlSwitch;
import boxfan.fancolor.FanColor;
import java.util.Scanner;

public class BoxFan{

  public static void main(String[] args)throws Exception{
    FanCase fanCase = new FanCase();
    FanBlades fanBlades = new FanBlades();
    ControlSwitch controlSwitch = new ControlSwitch();
    Motor motor = new Motor();
    FanColor fanColor = new FanColor();

    setFanCase(fanCase);
    //because fan blades have to fit in the case
    fanBlades.setFanBladeLength(fanCase.getFanCaseHeight()-1);

    setFanCaseColor(fanColor);


  }//end of main method
  private static FanCase setFanCase(FanCase fanCase)throws Exception{
    int integerHolder = 2;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("How tall would you like your fan to be?" +
                     " (whole numbers only)");
    try{
      integerHolder = keyboard.nextInt();
    }catch (Exception e){
      System.out.println("I said whole numbers. Fan height set to 2ft.");
    }
    fanCase.setFanCaseHeight(integerHolder);
    return fanCase;
  }

  private static FanColor setFanCaseColor(FanColor fanColor)throws Exception{
    Scanner keyboard = new Scanner(System.in);
    System.out.println("What color do you want your fan to be?" +
                       "0 for White, 1 for Black, 2 for Grey.");
    try{
      fanColor.setFanColor(keyboard.nextInt());
    }catch (Exception e){
      System.out.println("Only choices are 0, 1, 2. Fan will be White.");
      fanColor.setFanColor(0);
    }
    return fanColor;
  }
}
