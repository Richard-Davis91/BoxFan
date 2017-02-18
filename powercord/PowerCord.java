package boxfan.powercord;

public class PowerCord{
  private boolean pluggedIn;
  private int cordLength;

  public PowerCord(){
    pluggedIn = true;
    cordLength = 4;
  }
  public int getPowerCordLength(){return this.cordLength;}
  public void setPowerCordLength(int length){
    this.cordLength = length;
  }
  public boolean isPluggedIn(){return this.pluggedIn;}

  public boolean plugIn(){return pluggedIn = true;}
  public boolean unPlug(){return pluggedIn = false;}

}
