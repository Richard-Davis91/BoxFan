package boxfan;
import boxfan.FanCase;

class FanCaseTest{

  public static void main(String... args){
    FanCase fanCase = new FanCase();
    for(int i=0; i<5; i++){
      fanCase.setFanCaseHeight(i);
      fanCase.setFanCaseWidth(i);
      assert(fanCase.getFanCaseHeight()==i);
      assert(fanCase.getFanCaseLength()==i);
      assert(fanCase.getFanCaseWidth()==i);
    }

  }
}
