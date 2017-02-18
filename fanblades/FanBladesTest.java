package boxfan;
import boxfan.fanblades.FanBlades;

class FanBladesTest{

  public static void main(String... args){
    FanBlades fanBlades = new FanBlades();
    for(int i=0; i<4; i++){
      fanBlades.setFanBladeLength(i);
      assert(fanBlades.getFanBladeLength()==i);
    }
  }
}
