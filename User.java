
package devmetech;

import java.util.Scanner;

public class User implements properties {
 String pro="User";
    String argument = "";

    Scanner scan = new Scanner(System.in);
    public void savemovie() {
     System.out.println("Developers TECH_MET_PRO");
        System.out.println(" Save movie?");
        String ar ="";
        ar=scan.nextLine();
        System.out.println("  You saved the movie as "+pro);
        System.out.println("Thanks for visiting DEVELOPER TECH_MET_PRO");

    }

    public void savebook() {  System.out.println("Developers TECH_MET_PRO");
        System.out.println(" Save Book");
        String ar ="";
        ar=scan.nextLine();
        System.out.println("  You saved the BOOK  as "+pro);
        System.out.println("Thanks for visiting DEVELOPER TECH_MET_PRO");

    }

    public void ratemovie() {

    }

    public void ratebook() {

    }

    public void postreview() {

    }

    public void saveweblink() {

    }

}
