import java.util.*;
/**
 * OwnerInterface class provide interaction interface to owner.
 * @author (Fan Zhang) 
 * @version (2019.10.16)
 */
public class OwnerInterface
{

    public OwnerInterface()
    {

    }

    /**
     * display the information to inspire user choose the function they want to use.
     * @return give back the selection of user
     */
    
    /**
     * display the information to Owner while logging in.
     * @return give back the selection of user
     */
    public static ArrayList<String> displayLoginAsOwner()
    {
        IntuiativeMessage.clear();
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("");
        System.out.println("-----Login-----");
        System.out.println("**Please Enter The Required Information and Press Enter to Confirm**");
        System.out.println(" ");
        System.out.println("1.Email");
        String email = Receiver.getStringInput();   
        System.out.println("2.Password");
        String password = Receiver.getStringInput();
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        ArrayList<String> param = new ArrayList<String>();
        param.add(email);   
        param.add(password);
        return param;
    }
    
       /**
     * display the information to inspire user choose the function they want to use.
     * @return give back the selection of user
     */
    public static ArrayList<String> displayLogin()
    {
        IntuiativeMessage.clear();
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("");
        System.out.println("-----Login-----");
        System.out.println("**Please Enter The Required Information and Press Enter to Confirm**");
        System.out.println(" ");
        System.out.println("1.Email");
        String email = Receiver.getStringInput();   
        System.out.println("2.Password");
        String password = Receiver.getStringInput();
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

        ArrayList<String> param = new ArrayList<String>();
        param.add(email);   
        param.add(password);
        return param;
    }
    
    public static ArrayList<String> displayRegisterAsOwner()
    {
        IntuiativeMessage.clear();
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("");
        System.out.println("---Register as Owner---");
        System.out.println("**Please Enter The Required Information and Press Enter to Confirm**");
        System.out.println(" ");
        System.out.println("1.Real Name");
        String name = Receiver.getStringInput();
        System.out.println("2.Email");
        String email = Receiver.getStringInput();
        System.out.println("3.Password");
        System.out.println("Hint: no less than six characters.");
        System.out.println("Hint: no more than twelve characters.");
        String password = Receiver.getStringInput();
        while (!Receiver.stringLengthWithinRange(password,6,12))
        {
            System.out.println("Please input valid password.");
            password = Receiver.getStringInput();
        }
        System.out.println("4.Address");
        String address = Receiver.getStringInput();
        System.out.println("5.Phone Number");
        System.out.println("Hint: Each chracter of Phone number should be digital.");
        String phoneNumber = Receiver.getStringInput();
        
        while (!Receiver.ifPhoneNumberIsNumeric(phoneNumber))
        {
            phoneNumber = Receiver.getStringInput();
        }
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

        ArrayList<String> param = new ArrayList<String>();
        param.add(name);
        param.add(email);
        param.add(password);
        param.add(address);
        param.add(phoneNumber);
        return param;
    }

    
    
        public static ArrayList<String> displayLoginPage()
    {
        IntuiativeMessage.clear();
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("");
        System.out.println("-----Login-----");
        System.out.println("##Please Enter The Required Information and Press Enter to Confirm##");
        System.out.println(" ");
        System.out.println("1.Email");
        String email = Receiver.getStringInput();   
        System.out.println("2.Password");
        String password = Receiver.getStringInput();

        ArrayList<String> param = new ArrayList<String>();
        param.add(email);   
        param.add(password);
        return param;
    }

    /**
     * display the information to inspire user choose the function they want to use.
     * @return give back the selection of user
     */
        
    public static int displayDelete()
    {
        IntuiativeMessage.clear();
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("");
        System.out.println("-------------------------------Delete Halls--------------------------------------"); 
        System.out.println("1.Delete the halls");
        System.out.println("2.Back to home page");
       
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Please enter the index and press enter: ");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        int input = Receiver.receiveSelectionFromUser();   
        return input;
    }
      /**
     * display the operations to the Owner Interface
     * @return give back the selection of user
     */
    public static int displayOperation()
    {
        IntuiativeMessage.clear();
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("");
        System.out.println("-------------------------------Owner Page----------------------------------------"); 
        System.out.println("1.View the list of halls");
        System.out.println("2.Register new halls");
        
        System.out.println("3.Log out");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Please enter the index and press enter: ");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        int input = Receiver.receiveSelectionFromUser();   
        return input;
    }
     
    /**
     * display the form to register new hall
     * @return give back the selection of user
     */
    public static ArrayList<String> displayRegisterNewHall()
    {
        IntuiativeMessage.clear();
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");         
        System.out.println("");
        System.out.println("-------------------------------Register A New Hall-------------------------------");     
        System.out.println("##Please Enter The Required Information and Press Enter to Confirm##");  
        System.out.println(" ");        
        System.out.println("1. Hall Name");
        String name = Receiver.getStringInput();        
        System.out.println("2. Hall Address");
        String address = Receiver.getStringInput();        
        System.out.println("3. Phone Number");
        System.out.println("Hint: Each chracter of Phone number should be digital.");
                String phoneNumber = Receiver.getStringInput();
        while (!Receiver.ifPhoneNumberIsNumeric(phoneNumber))
        {
            phoneNumber = Receiver.getStringInput();
        }        
        System.out.println("4. Suburb");
        String suburb = Receiver.getStringInput();
        System.out.println("5. Functions");
        String function = Receiver.getStringInput();  
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

        ArrayList<String> param = new ArrayList<String>();
        param.add(name);
        param.add(address);
        param.add(phoneNumber);
        param.add(suburb);
        param.add(function);
        return param;        
    }
     /**
     * display hall Details header
     * @return give back the selection of user
     */
    public static void theHallOwned()
    {
        IntuiativeMessage.clear();
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");        
        System.out.println("------Halls List---------");
    }
}
