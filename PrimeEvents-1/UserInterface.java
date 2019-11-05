import java.util.*;
/**
 * The CustomerInterface class provides the interface to customer.
 * @author (Fan Zhang) 
 * @version (2019.10.16)
 */
public class UserInterface
{

    /**
     * Constructor for objects of class CustomerInterface
     */
    public UserInterface()
    {

    }

    /**
     * display the information to inspire user to enter the required informationfor register as student
     * @return give back ArrayList<String> which contains register information
     */
    public static ArrayList<String> displayRegisterAsNormalUser()
    {
        IntuiativeMessage.clear();
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+"); 
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");           
        System.out.println("");
        System.out.println("---Register as Normal User---");
        System.out.println("##Please Enter The Required Information and Press Enter to Confirm##");
        System.out.println(" ");
        System.out.println("1.Name");
        String name = Receiver.getStringInput();
        System.out.println("2.Email");
        String email = Receiver.getStringInput();
        System.out.println("3.Password");
        System.out.println("Hint: no more than twelve characters.");
        System.out.println("Hint: no less than six characters.");
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
        System.out.println("6.Preferred Payment(please enter the index and press Enter)");
        System.out.println("1.Cash");
        System.out.println("2.Card");
        boolean ifPreferredPaymentIsCash;
        int temp = Receiver.getIntInput();
        while (temp < 1 || temp > 2)
        {
            System.out.println("Please enter a valid index.");            
            temp = Receiver.getIntInput();
        }
        if (temp == 1)
        {
            ifPreferredPaymentIsCash = true;
        }
        ifPreferredPaymentIsCash = false;   

        ArrayList<String> param = new ArrayList<String>();
        param.add(name);
        param.add(email);
        param.add(password);
        param.add(address);
        param.add(phoneNumber);
        param.add(Boolean.toString(ifPreferredPaymentIsCash));
        return param;
    }

    /**
     * display the information to inspire user to enter the required informationfor register as non student
     * @return give back ArrayList<String> which contains register information
     */
    public static ArrayList<String> displayRegisterAsNonNormalUser()
    {
        IntuiativeMessage.clear();
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+"); 
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");   
        System.out.println("");
        System.out.println("---Register as Discount User---");
        System.out.println("##Please Enter The Required Information and Press Enter to Confirm##");
        System.out.println(" ");
        System.out.println("1.Name");
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
        System.out.println("6.Preferred Payment(please enter the index and press Enter)");
        System.out.println("1.Cash");
        System.out.println("2.Card");
        boolean ifPreferredPaymentIsCash;
        int temp = Receiver.getIntInput();
        while (temp < 1 || temp > 2)
        {
            System.out.println("Please enter a valid index.");            
            temp = Receiver.getIntInput();
        }
        if (temp == 1)
        {
            ifPreferredPaymentIsCash = true;
        }
        ifPreferredPaymentIsCash = false;   

        ArrayList<String> param = new ArrayList<String>();
        param.add(name);
        param.add(email);
        param.add(password);
        param.add(address);
        param.add(phoneNumber);
        param.add(Boolean.toString(ifPreferredPaymentIsCash));
        return param;
    }

    /**
     * display the information to inspire user to enter the required informationfor to login
     * @return give back ArrayList<String> which contains login information
     */
    public static ArrayList<String> displayLoginAsUser()
    {
        IntuiativeMessage.clear();
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+"); 
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"); 
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");           
        System.out.println("");
        System.out.println("----------------------------Login------------------------------------------------");
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
     * display the information to inspire user to select the function they want to use.
     * @return give back the index which user select.
     */
    public static int displaySearchPage()
    {
        IntuiativeMessage.clear();
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+"); 
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"); 
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+"); 
        System.out.println("");
        System.out.println("--------------------------------Search Page--------------------------------------");
        System.out.println("");        
        
        System.out.println("1.Show all the running Halls");
        System.out.println("2.Check Cart");        
        System.out.println("3.Check Order History");
        System.out.println("4.Log Out");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Please enter the index and press enter: ");
        int input = Receiver.receiveSearchSelectionFromUser();
        return input;              
    }      

    /**
     * display the information 
     */
    public static void displaysearchablehall()
    {
        IntuiativeMessage.clear();
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");   
        System.out.println("-----Search by Hall-----");
        System.out.println(" ");
        System.out.println("List of Searchable Hall"); 
    }

    /**
     * display the information 
     */
    public static void displaysearchablesuburb()
    {
        IntuiativeMessage.clear();
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");    
        System.out.println("------------------------------Search by Suburb-----------------------------------");
        System.out.println(" ");
        System.out.println("List of Searchable Suburb");
    }

    /**
     * display the information 
     */
    public static void displayLastHalfOfSearch()
    {
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");   
        System.out.println("Please search according to the list above.");
        System.out.println("tips: case insensitive.");    
        System.out.println("Please enter the keyword to begin searching...... ");     
    }

    /**
     * display the information 
     */
    public static void displayAllHall()
    {
        IntuiativeMessage.clear();
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");            
        System.out.println("");
        System.out.println("-----List of Hall-----");
        System.out.println(" ");
    }

    /**
     * display the information 
     */
    public static void displayItem1()
    {
        IntuiativeMessage.clear();
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");   
        System.out.println("");
        System.out.println("-------Please select the item-------"); 
    }
    
    /**
     * display the information 
     */
    public static void displayItem2()
    {
        System.out.println("");        
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Please enter the index and press enter: ");

    }

    /**
     * display the information 
     */
    public static void displayCart1()
    {
        IntuiativeMessage.clear();
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");     
        System.out.println("");
        System.out.println("-------Prime Cart-------");  
        System.out.println("");        
    }

    /**
     * display the information to inspire user to select the function they want to use.
     * @return give back the index which user select.
     */
    public static int displayCart2()
    {
        System.out.println("");
        System.out.println("");        
        System.out.println("1. Delete Items");
        System.out.println("2. Check Out");
        System.out.println("3. Back to search page");
        System.out.println("Please enter the index and press enter: ");
        int input = Receiver.receiveSelectionFromUser();
        return input;
    }

    /**
     * display the information 
     */
    public static void displayDeleteItem1()
    {
        IntuiativeMessage.clear();
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");   
        System.out.println("");
        System.out.println("-----------------------------Delete Item from Cart-------------------------------");  
        System.out.println("");        
    }
    
    public static void displayDeleteHalls()
    {
        IntuiativeMessage.clear();
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");   
        System.out.println("");
        System.out.println("-------Delete Halls-------");  
        System.out.println("");        
    }
    
    

    /**
     * display the information 
     */
    public static void displayDeleteItem2()
    {
        System.out.println("");
        System.out.println("");        
        System.out.println("Please enter the index and press enter: ");
    }

    /**
     * display the information 
     */
    public static void displayOrder1()
    {
        IntuiativeMessage.clear();
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");   
        System.out.println("");
        System.out.println("----------------------------Order Information------------------------------------");  
        System.out.println("");        
    }

    /**
     * display the information and hold up until user press enter
     */
    public static void displayOrder2()
    {
        System.out.println("");
        System.out.println("");        
        System.out.println("                  " + "Press Enter To Continue......" );
        IntuiativeMessage.pause();
    }

    /**
     * display the information 
     */
    public static void displayOrderHistory1()
    {
        IntuiativeMessage.clear();
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");  
        System.out.println("");
        System.out.println("-------------------------Order History-------------------------------------------");  
        System.out.println("");        
    }

    /**
     * display the information 
     */
    public static void displayOrderHistory2()
    {
        System.out.println("");
        System.out.println("");        
    }
}
