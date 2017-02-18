package boxfan.fancase;
import boxfan.fanblades.FanBlades;

public class FanCase{

  private int height;
  private int length;
  private int width;

  public FanCase(){
    this.height = 2;
    this.length = this.height;
    this.width = 1;
  }

  public int getFanCaseHeight(){return this.height;}
  public int getFanCaseLength(){return this.length;}
  public int getFanCaseWidth(){return this.width;}

  public void setFanCaseHeight(int height){
    this.height = height;
    this.length = this.height;

  }
  public void setFanCaseWidth(int width){
    this.width = width;
  }
}
