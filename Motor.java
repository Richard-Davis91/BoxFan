package boxfan;
import boxfan.ControlSwitch;

class Motor{
  boolean motorOn;
  ControlSwitch controlSwitch;

  private Motor(){
    this.motorOn = false;
  }
  public boolean isMotorOn(){return this.motorOn;}
  public boolean turnMotorOn(){return this.motorOn = true;}
  public boolean turnMotorOff(){return this.motorOn = false;}
}
