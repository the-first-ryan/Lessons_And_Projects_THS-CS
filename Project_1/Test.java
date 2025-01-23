import java.util.Scanner;

public class Test{
  static String playerMove = "";
  static String playerText = "";

    public static void main(String[] args){
         

        Scanner scanner = new Scanner(System.in);
        Scanner scannerText = new Scanner(System.in);

        while (true) { 
 system.out.println("u/U: Update
f/F: Find & Replace
t/T: Transform
s/S: Statistics
e/E: Exit");
          playerMove = scanner.nextLine();

if (playerMove.equalsIgnoreCase("u" || "f" || "t" || "s" || "e"))
          {
         break;
        } else {
        System.out.println("Please type one of the actions");
          }
}
        
    

        if (playerMove.equalsIgnoreCase("u")) {
          system.out.println("Type the text you want to change, then hit enter!");
         
           playerText = scannerText.nextLine();
           

        } else if (playerMove.equalsIgnoreCase("f")) {
          system.out.println("Type the text you want to change, then hit enter!");
    
           playerText = scannerText.nextLine();

          

        } else if (playerMove.equalsIgnoreCase("t")) {
         system.out.println("Type the text you want to change, then hit enter!");
          
           playerText = scannerText.nextLine();


        } else if (playerMove.equalsIgnoreCase("s")) {
          system.out.println("Type the text you want to change, then hit enter!");
         
           playerText = scannerText.nextLine();


        } else if (playerMove.equalsIgnoreCase("e")) {
          system.out.println("Thanks for playing!");
      close();
        }

    }
}