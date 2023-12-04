/*
 * Rohan Mirza
 * CMSY-166-003
 * Program that tracks phones and plans being purchased
 */
import java.util.ArrayList;
import java.util.Scanner;

public class EventKiosk {
    
    public static void main (String[] args){
        
        ArrayList<Phone> newCustomers = new ArrayList<>();
        Scanner keyboardInput = new Scanner( System.in );
        
        boolean memberCA;
        String newPhone;
        String newCarrier;
        
        
        
        System.out.println("Is there a customer wanting to buy a new phone? (Y/N):  " );
        while ( keyboardInput.nextLine().equalsIgnoreCase("y") ) {

            System.out.println("Is the customer a CA member? (Y/N):  ");
            memberCA = ( keyboardInput.nextLine().equalsIgnoreCase("y") );
            
            System.out.println("What type of phone (iPhone or Android or Moto):  ");
            newPhone = keyboardInput.nextLine();
            
            System.out.println("What carrier? (Verizon, AT&T, or T-Mobile):  ");
            newCarrier = keyboardInput.nextLine();
            
            switch ( newPhone ) {
                case "iPhone": {
                	Phone nextPhone = new IPhone(newCarrier);
                	nextPhone.initialize(memberCA);
                    newCustomers.add( nextPhone  );
                    break;
                }//Close iPhone case
                case "Android": {
                	Phone nextPhone = new Android(newCarrier);
                	nextPhone.initialize(memberCA);
                    newCustomers.add( nextPhone  );
                    break;
                }//Close Android case
                case "Moto": {
                	Phone nextPhone = new Moto(newCarrier);
                	nextPhone.initialize(memberCA);
                	newCustomers.add(nextPhone);
                	break;
                }//Close Moto case
                default: {
                    System.out.println("Unrecognized phone.  Try Again.");
                    break;
                }//Close default case
            }//Close switch statment
                    
            System.out.println("Is there a customer wanting to buy a new phone? (Y/N):  " );
        }//Close while loop
        
        
        
        printReport( newCustomers );
        keyboardInput.close();
    }//Close main
    
    public static void printReport( ArrayList<Phone> newCustomers ) {

        System.out.printf("%s%n%s%n%s%n%n",
            "==========================================================",
            "=       Columbia 50th Annversary Phone Signup Drive      =",
            "==========================================================" );

        System.out.println("New Customers:\n");
        
        for ( Phone phone : newCustomers ) {
            System.out.printf("%s%n", phone.toString() );
        }//Close for loop

    }//Close printReport method
    
}//Close Event Kiosk class
