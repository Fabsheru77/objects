
//FARIS
/*
1) We need to read from a file, input.txt
2) We need to break up the lines on the comma
3) We need to turn each item in the array created into an object
4) Pass our objects into an ArrayList
5) We need to round the tds (2.11 not 2.11234432)       
*/
import util.FootballPlayer;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;  
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
  //Moved above try block so it exists in advance
ArrayList<FootballPlayer> list = new ArrayList<FootballPlayer>();
  try{//dangerous code goes here!
    File file = new File("input.txt");
    Scanner scanner = new Scanner(file);

    while(scanner.hasNextLine()){
      String str = scanner.nextLine();

// We now have individual data items
      String[] strArr = str.split(", ");
      double num = Double.parseDouble(strArr[2]);
      list.add(new FootballPlayer("strArr[0]", "strArr[1]", num));

    for(String myStr : strArr){
      System.out.println(myStr);
  }// end for
      //System.out.println(Str);
  }// end while
    scanner.close();
  }catch(FileNotFoundException e){
    System.out.println("File does NOT exist");
  }//end try/catch

  for (FootballPlayer player : list) {     
    System.out.println(player); 
    System.out.println(" "); 

    }//end FootballPlayer player: list

      }//end main
        }//end Main Class
