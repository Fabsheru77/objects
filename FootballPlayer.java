
// FARIS
package util;
public class FootballPlayer{
   public String name;
   public String team;
   public double touchdowns; 

public FootballPlayer (String name, String team, double touchdowns){
  
  this.name = name;
  this.team = team;
  this.touchdowns = touchdowns;
}//end constructor 
     public double tdPerGame(double games){
    return this.touchdowns / games;
       
 }//end go()
  
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("name: ").append(this.name).append("\n");
      sb.append("team: ").append(this.team).append("\n");
      sb.append("touchdowns: ").append(this.touchdowns);
      return sb.toString();
  }//end to String()
  
}//end FootballPlayer class
