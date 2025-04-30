
package util;
public class Car{
   public String make;
  private String model;
   public double speed; 

public Car (String make, String model, double speed){
  this.make = make;
  this.model = model;
  this.speed = speed;
}//end constructor 
     public double go(double hours){
    return this.speed * hours;

 }//end go()

  public String getModel(){
    return this.model;
  }//end getModel

  public void setModel(String model){
    this.model = model;
  }//end setModel

  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("make: ").append(this.make).append("\n");
      sb.append("model: ").append(this.model).append("\n");
      sb.append("speed: ").append(this.speed);
      return sb.toString();
  }//end to String()

}//end Car class
