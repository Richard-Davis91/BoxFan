package boxfan;
import boxfan.motor.Motor;

class MotorTest{

  public static void main(String... args){

    Motor motor = new Motor();

    for(int i=0; i<2; i++){
      if(motor.isMotorOn()){
        motor.turnMotorOff();
        assert(motor.isMotorOn()==false);
      }else{
        motor.turnMotorOn();
        assert(motor.isMotorOn()==true);
      }
    }
  }
}
