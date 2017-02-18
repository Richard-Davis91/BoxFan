package boxfan;
import boxfan.controlswitch.ControlSwitch;

class ControlSwitchTest{

  public static void main(String... args)throws Exception{
    ControlSwitch controlSwitch = new ControlSwitch();
    try{
      for (int i = 0; i < 4; i++){
        controlSwitch.setFanPower(i);
        assert(controlSwitch.getFanPower()==i);
      }
    }catch (Exception e){
      System.out.println("Invalid type");
    }
  }
}
