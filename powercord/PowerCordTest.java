package boxfan;
import boxfan.powercord.PowerCord;

class PowerCordTest{

  public static void main(String... args){
    PowerCord powerCord = new PowerCord();

    for(int i=0; i<3; i++){
      if(powerCord.isPluggedIn()){
        powerCord.unPlug();
        assert(powerCord.isPluggedIn()==false);
      }else{
        powerCord.plugIn();
        assert(powerCord.isPluggedIn()==true);
      }
      powerCord.setPowerCordLength(i);
      assert(powerCord.getPowerCordLength()==i);
    }
  }
}
