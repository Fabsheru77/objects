
package util;
import java.util.Scanner;
public class Numbers{
  public static int getInt(String  input){
     Scanner scanner = new Scanner(System.in); 
       int num = 0;//will hold number returned 
       boolean getInt = false;// will go true when approprate
       String str = ""; 

       while(!getInt){
           System.out.println(input);
           str = scanner.nextLine();
        try{
          num = Integer.parseInt(str); 
               getInt = true;
          }catch(Exception e){
     System.out.println("That is NOT an Integer " + str);

     }//end try/catch
   }//end while
       scanner.close();
     return num;

  }//end getInteger()

   public static double getDouble(String  input){
     Scanner scanner = new Scanner(System.in); 
       double num = 0;//will hold number returned 
       boolean gotDouble = false;// will go true when approprate
       String str = ""; 

       while(!gotDouble){
           System.out.println(input);
           str = scanner.nextLine();
        try{
          num = Double.parseDouble(str); 
               gotDouble = true;
          }catch(Exception e){
     System.out.println("That is NOT a number" + str);

     }//end try/catch

   }//end while
       scanner.close();
     return num;
  }//end getDouble() 


}//end Numbers class
