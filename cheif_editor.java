package devmetech;
import java.util.Scanner;

public class cheif_editor  extends Products implements properties { 
     String pro="CHEIF EDITOR";
    Scanner scan =new Scanner(System.in);
   
    // SAVE MOVIE METHOD
    public  void savemovie(){System.out.println("Developers TECH_MET_PRO");
        System.out.println(" Save movie?");
        String ar ="";
        ar=scan.nextLine();
        System.out.println("  You saved the movie as "+pro);
        System.out.println("Thanks for visiting DEVELOPER TECH_MET_PRO");}  
    
    
    // SAVE BOOK METHOD 
    public  void savebook(){  System.out.println("Developers TECH_MET_PRO");
        System.out.println(" Save Book?");
        String ar ="";
        ar=scan.nextLine();
        System.out.println("  You saved the movie as "+pro);
        System.out.println("Thanks for visiting DEVELOPER TECH_MET_PRO");}
      
    public  void ratemovie(){}
    public void ratebook(){}
    public void postreview(){}
    public  void saveweblink(){}
   
    
    
    
    
}
