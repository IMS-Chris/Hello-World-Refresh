/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package HelloWorld;

import java.util.Scanner;
/**
 *
 * @author chrishardin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String myName;
        
        myName = getName();

        System.out.println("Hi " + myName);
    }

    public static String getName(){
        String getMyName;

        System.out.println("What is your Name");

        Scanner keyboard = new Scanner(System.in);

        getMyName = keyboard.nextLine();

        return getMyName;

    }

}
