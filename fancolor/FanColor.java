package boxfan.fancolor;

public class FanColor{
  private String fanColor;

  public FanColor(){}

  public void setFanColor(int color)throws Exception{
    try{
      switch(color){
        case 0: this.fanColor = "White";
                break;
        case 1: this.fanColor = "Black";
                break;
        case 2: this.fanColor = "Grey";
                break;
        default: this.fanColor = "White";
                 break;
      }
    }catch (Exception e){this.fanColor = "White";}
  }
  public String getFanColor(){return this.fanColor;}
}
