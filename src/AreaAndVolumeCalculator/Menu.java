package AreaAndVolumeCalculator;

import java.util.Iterator;

/**
 *
 * @author Duncan
 */
public class Menu {
    
    //menu system needs work. 
    public static void menu(){
        int iInput = -1;
        
        do { // start of do while
            System.out.println("Please select one of the following: \n" +
                            "1. Area \n" + 
                            "2. Volume \n" +
                            "0. Exit"
            );      
            
            while(!InputFactory.SC.hasNextInt()){//start of while loop
                System.out.println("must be a whole number");
                InputFactory.SC.next();//advances scanner to next line so program doesnt
                                       //get caught in a loop
            }//end of while loop
            
            iInput = InputFactory.SC.nextInt();//storing user input to iInput
            
            if(iInput == 1){//if 1. see above menu
                areaMenu();// call to method
                break;
            } else if (iInput == 2){
                volumeMenu();
                break;
            } 
            
        } while(iInput != 0);//will run the loop until the user enters a zero
        
        System.exit(0);//closes the program
     
    } //end of our method
    
    public static void menuPopulation(){
        int count = 1;
        Iterator it = DataStore.shapeSet.iterator();
        
        while(it.hasNext()){
            System.out.println(count + ". " + it.next());
            count++;
        }
    }

    public static void areaMenu(Shape shape){
        System.out.println("area menu");
    }

    public static void volumeMenu(Shape shape){
        System.out.println("volume menu");
    }
}