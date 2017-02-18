package boxfan.fancolor;
import boxfan.fancolor.FanColor;

class FanColorTest{
  public static void main(String... args)throws Exception{
    FanColor fanColor = new FanColor();

    for(int i=0; i<3; i++){
      fanColor.setFanColor(i);
      switch (i){
        case 0: assert((fanColor.getFanColor()).equals("White"));
                break;
        case 1: assert((fanColor.getFanColor()).equals("Black"));
                break;
        case 2: assert((fanColor.getFanColor()).equals("Grey"));
                break;
      }
    }
  }
}
