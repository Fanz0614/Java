/**
 * HomeInterface class provide the main interface to user of Bookinghall.
 * @author (Fan Zhang) 
 * @version (2019.10.16)
 */
public class HomeInterface
{

    public HomeInterface()
    {

    }

    /**
     * display the information to inspire user choose the function they want to use.
     * @return give back the selection of user
     */
    public static int displayHomePage()
    {
        IntuiativeMessage.clear();
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");         
        System.out.println("                          " + "Prime Events");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+"); 
        System.out.println("1.Register");
        System.out.println("2.Login");
        
        System.out.println("");
        System.out.println("");
        System.out.println("Please Enter the Index and Press Enter......");
        int input = Receiver.receiveSelectionFromUser();   
        return input;
    }
    
    public static int displayRegisterPage()
    {
        IntuiativeMessage.clear();
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");         
        System.out.println("                          " + "Register");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+"); 
        System.out.println("1.Register as user");
        System.out.println("2.Register as owner");
        System.out.println("3.Return to Home");
        
        System.out.println("");
        System.out.println("");
        System.out.println("Please Enter the Index and Press Enter......");
        int input = Receiver.receiveSelectionFromUser();   
        return input;
    }

    /**
     * display the information to inspire user choose the function they want to use.
     * @return give back the selection of user
     */
    public static int displayHome2()
    {
        IntuiativeMessage.clear();
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+"); 
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");   
        System.out.println("");
        System.out.println("---Register as User---");
        System.out.println("1.Normal User");
        System.out.println("2.Discount User");
        System.out.println("3.Return");
        System.out.println("--------------------------");
        System.out.println("Please enter the index and press enter: ");  
        int input = Receiver.receiveSelectionFromUser();   
        return input; 
    }

    /**
     * display the information to inspire user choose the function they want to use.
     * @return give back the selection of user
     */
    public static int displayLoginPage()
    {
        IntuiativeMessage.clear();
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+"); 
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");           
        System.out.println("");
        System.out.println("-----------Login-----------");
        System.out.println("1.Login");
       
        System.out.println("2.Return to Home");
        System.out.println("---------------------------");
        System.out.println("Please enter the index and press enter: "); 
        int input = Receiver.receiveSelectionFromUser();   
        return input;
    }
}
