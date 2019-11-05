import java.util.*;
/**
 * The Receiver class implement several functions in regards to receive the input from users and validate the input to 
 * check if it follows instruction. Return the boolean data and display the intuiative message.
 * @author (Fan Zhang) 
 * @version (2019.10.16)
 */
public class Receiver
{

    public Receiver()
    {  
    }

    /**
     * receive input which the data type is String.
     * @return give back String which is the input of users.
     */
    public static String getStringInput()
    {
        Scanner console = new Scanner(System.in);
        String acceptInput;                
        acceptInput = console.nextLine();
        while (checkIfInputIsBlank(acceptInput))
        {
            System.out.println("Input cannot be blank!!!");
            System.out.println("Please enter again......");
            acceptInput = console.nextLine();
        }
        return acceptInput;
    }

    /**
     * get input which the data type is int
     * @return give back int input of users
     */
    public static int getIntInput()
    {
        Scanner receive = new Scanner(System.in); 
        String s = receive.nextLine();
        while (!isNumber(s))
        {
            System.out.println("Invalid input!!!");
            System.out.println("Please enter again......");
            s = receive.nextLine();
        }
        int acceptInput = Integer.parseInt(s);
        return acceptInput;    
    }

    /**
     * @param input in type String
     * @return give back the result of check if the input is blank.
     */
    private static boolean checkIfInputIsBlank(String input)
    {
        String inputWithoutSpace = input.replaceAll(" ","");
        if (inputWithoutSpace.length() == 0)
        {
            return true;
        }
        else{
            return false;
        }                
    }

    /**
     * @param input in type String
     * @return give back the result of check if the input is numberic.
     */
    private static boolean isNumber(String checkString)
    {
        if (checkIfInputIsBlank(checkString))
        {
            System.out.println("Input cannot be blank!!!");
            return false;
        }

        for (int i = 0; i < checkString.length(); i++)
        {
            if(!Character.isDigit(checkString.charAt(i)))
            {
                System.out.println("Index must be nemeric!!!");
                return false;                                
            }
        }
        return true;
    }

    /**
     * check if the input follows instruction. if not, display the message to inspire user.
     * @param input in type String
     * @return give back the result of check if the input is numberic.
     */
    public static boolean isIndex(String checkString)
    {
        for (int i = 0; i < checkString.length(); i++)
        {
            if(Character.isDigit(checkString.charAt(i)))
            {
                System.out.println("Please enter the hall name instead of index!!!");
                return true;                                
            }
        }
        return false;
    }

    /**
     * check if the input follows instruction. if not, display the message to inspire user.
     * @param input in type String
     * @return give back the result of check if the input is numberic.
     */
    public static boolean ifPhoneNumberIsNumeric(String checkString)
    {        
        for (int i = 0; i < checkString.length(); i++)
        {
            if(!Character.isDigit(checkString.charAt(i)))
            {
                System.out.println("Please input valid phoneNumber.");
                return false;                                
            }
        }
        return true;
    }

    /**
     * check if the input follows instruction. 
     * @param input in type String
     * @return give back the result of check if the input is in required range.
     */
    public static boolean stringLengthWithinRange(String input, int minimum, int maximum)
    {
        if (checkIfInputIsBlank(input))
        {
            return false;
        }
        else{        
            if (input.length() >= minimum && input.length() <= maximum)
            {
                return true;
            }
            else{
                return false;
            }
        }
    }

    /**
     * check if the input follows instruction. 
     * @param receive the input from users
     * @return give back the int input after validating.
     */
    public static int receiveSelectionFromUser()
    {
        int input = Receiver.getIntInput();
        while (input < 1 || input > 3)
        {
            IntuiativeMessage.displayInputIsInValid();
            input = Receiver.getIntInput();
        }
        return input;       
    }

    /**
     * check if the input follows instruction. if is valid, return the input received.
     * @param input in type int
     * @return give back the result of check if the input is numberic and not less than 1 as well as not greater than 6.
     */
    public static int receiveSearchSelectionFromUser()
    {
        int input = Receiver.getIntInput();
        while (input < 1 || input > 6)
        {
            IntuiativeMessage.displayInputIsInValid();
            input = Receiver.getIntInput();
        }
        return input;       
    }
}
