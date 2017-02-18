package boxfan.controlswitch;
import boxfan.powercord.PowerCord;

public class ControlSwitch{
  private PowerCord powerCord;
  private int fanPowerSetting;

  public ControlSwitch(){this.fanPowerSetting = 0;}

  public int getFanPower(){
    switch (this.fanPowerSetting){
      case 0: System.out.println("Fan is off");
              return this.fanPowerSetting;
      case 1: System.out.println("Fan is on Low");
              return this.fanPowerSetting;
      case 2: System.out.println("Fan is on Med");
              return this.fanPowerSetting;
      case 3: System.out.println("Fan is on High");
              return this.fanPowerSetting;
    }return this.fanPowerSetting;
  }
  public int setFanPower(int fanPowerSetting)throws Exception{
    try{
      if(fanPowerSetting>3 || fanPowerSetting<0){
      System.out.println("Fan settings only go from 0-3");
      return this.fanPowerSetting = 0;
      }
      return this.fanPowerSetting = fanPowerSetting;
    }catch(Exception e){
      System.out.println("Fan settings only go from 0-3");
      return this.fanPowerSetting = 0;
    }
  }
}
