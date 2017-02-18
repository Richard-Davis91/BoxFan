package boxfan.motor;

public class Motor{
  private boolean motorOn;

  public Motor(){
    this.motorOn = false;
  }
  public boolean isMotorOn(){return this.motorOn;}
  public boolean turnMotorOn(){return this.motorOn = true;}
  public boolean turnMotorOff(){return this.motorOn = false;}
}
