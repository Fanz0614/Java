import java.util.*;

/**
 * Bookhall class is the high level controller which integrates all the components of Booking hall system.
 * @author (Fan Zhang) 
 * @version (2019.10.16)
 */
public class Bookahall 
{
    private AccountManageSystem accounts;
    private HallManageSystem halls;
    private OrderManageSystem orders;
    private Customer currentCustomer;
    private Owner currentOwner;
    private Owner owner01;
    

    public Bookahall()
    {
        this.accounts = new AccountManageSystem();
        this.halls = new HallManageSystem();
        this.orders = new OrderManageSystem();
        
        
    }

    /**
     * Main method of the system, this is the place to start the bookhall system.
     */
    public void main()
    {
       
        
        
        while(true)
        {
            int option = HomeInterface.displayHomePage();
            
            switch (option)
            {
                case 1:
                register();
                break;
                case 2:
                login();
                
                break;
                           
                default:
                break;
            }
        }
    }

    /**
     * provide login functionality which combine the display information, receive information and check the information.
     */
    private void login()
    {
        int option = HomeInterface.displayLoginPage();
       
        switch (option)
        {   
            case 1:            
          
            
            if(login1()){
            search();
            
            }  
            
            else if(login2()){
            operation();
            
            }
            break;
            
            case 2:
             
            break;       
            default:
            break;
        }
    }

   
    

   
    
    private boolean login2()
    {
        
        ArrayList<String> param = OwnerInterface.displayLoginAsOwner();
        String e = param.get(0);   
        String p = param.get(1);
        if (accounts.checkOwner(e,p))
        {
            IntuiativeMessage.displaySuccessfulLogin();
            currentOwner = accounts.getOwner(e,p);
            IntuiativeMessage.displaySuccessfulLogin();
            accounts.display(currentOwner);
            IntuiativeMessage.pause();
            return true;
        }
        else{
      
        IntuiativeMessage.displayRefuseToLogin();
        return false;
    }
    }
    
     private boolean login1()
    {
        
        ArrayList<String> param = UserInterface.displayLoginAsUser();
        String e = param.get(0);   
        String p = param.get(1);
        
        if (accounts.checkCustomer(e,p))
        {
            IntuiativeMessage.displaySuccessfulLogin();
            currentCustomer = accounts.getCustomer(e,p);
            IntuiativeMessage.displaySuccessfulLogin();
            accounts.display(currentCustomer);
            IntuiativeMessage.pause();
            return true;
        }
        IntuiativeMessage.displayRefuseToLogin();
        return false;
    }
    
    private void register()
    {
        int option = HomeInterface.displayRegisterPage();
        switch (option)
        {
            case 1:
            registerAsUser();
            break;
            case 2:
            registerAsOwner();
            break;
            case 3:        
            break;              
            default:
            break;
        }
    }

    /**
     * provide the functionality for customer to register
     */
    private void registerAsUser()
    {
        int option = HomeInterface.displayHome2();
        switch (option)
        {
            case 1:
            registerAsNormalUser();
            break;
            case 2:
            registerAsNonNormalUser();
            break;
            case 3:
            //return previous           
            break;              
            default:
            break;
        }
     
    }

    /**
     * provide the funtionality of register as normal user.
     */
    private void registerAsNormalUser()
    {
        ArrayList<String> param1 = UserInterface.displayRegisterAsNormalUser();        
        String name = param1.get(0);
        String email = param1.get(1);
        String password = param1.get(2);
        String address = param1.get(3);
        String phoneNumber = param1.get(4);
        String temp1 = param1.get(5);
        boolean ifPreferredPaymentIsCash = Boolean.parseBoolean(temp1);
        IndexGenerator iG = new IndexGenerator(10000,99999,1000,9999,10000000,99999999);
        int index = iG.generateIndexForUser();
        boolean ifItIsDiscountUser = true;
        accounts.registerUserAsCustomer(index,name,address,email,password,phoneNumber,ifItIsDiscountUser,ifPreferredPaymentIsCash);
        IntuiativeMessage.displaySuccessfulRegister();
    }

    /**
     * provide the funtionality of register as dsicount user.
     */
    private void registerAsNonNormalUser()
    {
        ArrayList<String> param1 = UserInterface.displayRegisterAsNormalUser();        
        String name = param1.get(0);
        String email = param1.get(1);
        String password = param1.get(2);
        String address = param1.get(3);
        String phoneNumber = param1.get(4);
        String temp1 = param1.get(5);
        boolean ifPreferredPaymentIsCash = Boolean.parseBoolean(temp1);
        IndexGenerator iG = new IndexGenerator(10000,99999,1000,9999,10000000,99999999);
        int index = iG.generateIndexForUser();
        boolean ifItIsDiscountUser = false;
        accounts.registerUserAsCustomer(index,name,address,email,password,phoneNumber,ifItIsDiscountUser,ifPreferredPaymentIsCash);
        IntuiativeMessage.displaySuccessfulRegister();
    }

    /**
     * provide the funtionality of register as owner.
     */
    
    public void registerAsOwner()
    {
        ArrayList<String> param = OwnerInterface.displayRegisterAsOwner();
        String name = param.get(0);
        String email = param.get(1);
        String password = param.get(2);
        String address = param.get(3);
        String phoneNumber = param.get(4);
        IndexGenerator iG = new IndexGenerator(10000,99999,1000,9999,10000000,99999999);
        int index = iG.generateIndexForUser();
        int hallId = iG.generateHallId();     
        accounts.registerUserAsOwner(index,name,address,email,password,phoneNumber);
        IntuiativeMessage.displaySuccessfulRegister();
        this.owner01 = accounts.createOwner(index,name,address,email,password,phoneNumber);
        
        
        
        
        
       
        
        
        
        accounts.addOwnerIntoOwnerArray(owner01);
        accounts.addUserIntoUserArray(owner01);
        
    }

    /**
     * provide structure of searching functionality.
     */
    private void search()
    {
            int option = UserInterface.displaySearchPage();
            switch (option)
            {
             
                case 1:
                Hall hal3 = showAllHall();
                
                if (hal3 == null)
                {
                    halls.displayNoMachingError();
                    search();
                    break;
                }
                hal3.displayList();//displayHall
                IntuiativeMessage.pressEnterToContinue();
                UserInterface.displayItem1();
                hal3.getList().display();
                int quit3 = hal3.getList().getEventsList() .size() + 1;
                System.out.println();
                System.out.println(quit3 + ". " + "Back to Search Page");     
                UserInterface.displayItem2(); 
                int input3 = Receiver.getIntInput();  
                while (input3 > hal3.getList().getEventsList().size() + 1 || input3 < 1)//gethall().gethalllist()
                {
                    IntuiativeMessage.displayInputIsInValid();
                    input3 = Receiver.getIntInput();
                }
                if (input3 == quit3)
                {
                    search();
                    break;
                }
                Events food3 = hal3.getList().selectEventsByIndex(input3 - 1); 
                addItemIntoCart(food3);  
                search();
                break; 
                case 2:
                checkCart();
                
                break; 
                case 3:
                checkOrder();
                break; 
                case 4:
                 
                 
                break;                 
                default:
                break;
            }     
       
    }
    
    private void viewHall()
    {
        OwnerInterface.theHallOwned();
        if (currentOwner.getAmountOfHallOwned() > 0)
        {   currentOwner.displayTheHallOwned(currentOwner.getHallOwned());
            System.out.println("");
            System.out.println("Please Enter the hall name to view the detailed information about the selected halls");
            System.out.println("                   " + "Press Enter To Continue......" );            
            int index = Receiver.getIntInput();
            while (index > currentOwner.getAmountOfHallOwned() || index < 1)
            {
                IntuiativeMessage.displayInputIsInValid();
                index = Receiver.getIntInput();
            }
            Hall hal = currentOwner.getHallViaIndex(index - 1);
            halls.display(hal);
            IntuiativeMessage.pause();
            
        } else {
            System.out.println("You don't have any selected halls.");
            System.out.println("Please regiseter your halls.");
            System.out.println("");
            System.out.println("                     " + "Press Enter To Continue......" );
            IntuiativeMessage.pause();
            
        }
    }

    /**
     * provide the funtion of searching by category.
     */
    private Hall searchByFunction()
    {
        UserInterface.displaysearchablehall();
        halls.hintOfSearchableFunction();
        UserInterface.displayLastHalfOfSearch();   
        String function = Receiver.getStringInput();
        
        while (Receiver.isIndex(function))
        {
            System.out.println("      " + "Invalid Input, Please Follow the Instruction and Enter Again." + " ");            
            function = Receiver.getStringInput();
        }
        if (halls.searchByFunction(function) == null)
        {
           
            System.out.println("                   " + "Press Enter To Continue......" );               
            IntuiativeMessage.pause();            
            return null;
        }
        ArrayList<Hall> cui = halls.searchByFunction(function);
        halls.displaySearchingResult(cui);
        int index = Receiver.getIntInput();
        while (index > cui.size() || index < 1)
        {
            IntuiativeMessage.displayInputIsInValid();
            index = Receiver.getIntInput();
        }
        Hall hal = cui.get(index - 1);
        halls.display(hal);
        IntuiativeMessage.pause();
        return hal;
    }

    /**
     * provide the funtion of searching by suburb.
     */
    
    private Hall searchBySuburb()
    {
        UserInterface.displaysearchablesuburb();
        halls.hintOfSearchableSuburb();
        UserInterface.displayLastHalfOfSearch();
        String suburb = Receiver.getStringInput();
        while (Receiver.isIndex(suburb))
        {
            System.out.println("      " + "Invalid Input, Please Follow the Instruction and Enter Again." + " ");            
            suburb = Receiver.getStringInput();
        }
        if (halls.searchBySuburb(suburb) == null)
        {
            halls.displayNoMachingError();
            System.out.println("                   " + "Press Enter To Continue......" );               
            IntuiativeMessage.pause();            
            return null;
        }
        ArrayList<Hall> sub = halls.searchBySuburb(suburb);
        halls.displaySearchingResult(sub);
        int index = Receiver.getIntInput();
        while (index > sub.size() || index < 1)
        {
            IntuiativeMessage.displayInputIsInValid();
            index = Receiver.getIntInput();
        }
        Hall hal = sub.get(index - 1);
        halls.display(hal);
        IntuiativeMessage.pause();
        return hal;        
    }

    /**
     * list all the halls stored in the system.
     */
    private Hall showAllHall()
    {
        UserInterface.displayAllHall();
        halls.displayHallList();
        System.out.println("----------------------------");
        System.out.println("Please enter the index and press enter: ");
        int input = Receiver.getIntInput();
        while (input < 1 || input > halls.getHallListSize())
        {
            input = Receiver.getIntInput();
        }
        halls.display(halls.selectHallByIndex(input - 1));
        IntuiativeMessage.pause();
        return halls.selectHallByIndex(input - 1);
    }

    /**
     * choose the events and add the events into cart
     */
    private void addItemIntoCart(Events food)
    {
        currentCustomer.getCart().add(food); 
        IntuiativeMessage.displaySuccessfullyAddItemIntoCart();
    }

    /**
     * provide the function to review and operation about cart.
     */
    private void checkCart()
    {
        UserInterface.displayCart1();
        currentCustomer.displayCart();
        int option = UserInterface.displayCart2();
        switch (option)
        {
            case 1:
            deleteHalls();
            search();
            break;
            case 2:
            checkOut();
            search();
            break;
            case 3:
            search();
            //return previous           
            break;              
            default:
            break;
        }
    }    

    /**
     * select the item inthe cart and remove it from cart.
     */
    
    //
    private void deleteItem()
    {
        UserInterface.displayDeleteItem1();
        currentCustomer.displayCartToDelete();
        int quit = currentCustomer.getCart().size() + 1;
        System.out.println();
        System.out.println(quit + ". " + "Back to Search Page");
        UserInterface.displayDeleteItem2();
        int input = Receiver.getIntInput();
        while (input > currentCustomer.getCart().size() + 1 || input < 1)
        {
            input = Receiver.getIntInput();
        }
        if (input == quit)
        {
            search();
            return;
        }
        currentCustomer.getCart().remove(input - 1);
        IntuiativeMessage.displaySuccessfullyRemoveItemFromCart();
    }
    
    private void deleteHalls()
    {
        OwnerInterface.displayDelete();
        currentOwner.displayhallToDelete();
        int quit = currentCustomer.getCart().size() + 1;
        System.out.println();
        System.out.println(quit + ". " + "Back to Search Page");
        UserInterface.displayDeleteItem2();
        int input = Receiver.getIntInput();
        while (input > currentCustomer.getCart().size() + 1 || input < 1)
        {
            input = Receiver.getIntInput();
        }
        if (input == quit)
        {
            search();
            return;
        }
        currentCustomer.getCart().remove(input - 1);
        IntuiativeMessage.displaySuccessfullyRemoveItemFromCart();
    }

    /**
     * confirm the choosen events and make an order.
     */
    private void checkOut()
    {        
        ArrayList<Events> chosenEvents = new ArrayList<Events>();        
        String hallName;
        int orderId;
        String dateAndTime;
        String email;
        int totalPrice;
        int customerIndex;
        int hallId;
        int hallOwnerIndex;
        if (currentCustomer.checkCart())
        {
            totalPrice = currentCustomer.calculateTotalAmount();
            //if (totalPrice > 25)
            //{
                IndexGenerator iG = new IndexGenerator(10000,99999,1000,9999,10000000,99999999);
                DateUtils date = new DateUtils();
                ArrayList<Events> list = currentCustomer.getCart();
                for (int i = 0 ; i < list.size(); i ++)
                {
                    chosenEvents.add(list.get(i));                    
                }
                hallName = currentCustomer.getCart().get(0).getHallName();
                orderId = iG.generateIndexForOrder();
                dateAndTime = date.getNowDate("yyyy-MM-dd HH:mm:ss");
                email = currentCustomer.getEmail();
                customerIndex = currentCustomer.getIndex();                
                hallId = currentCustomer.getCart().get(0).getHallId();
                hallOwnerIndex = currentCustomer.getCart().get(0).getHallOwnerIndex();
                Order order = currentCustomer.makeAnOrder(chosenEvents,hallId,hallName,orderId,dateAndTime,totalPrice,email,customerIndex,hallOwnerIndex);
                currentCustomer.addOrderIntoHistory(order);  
                orders.addOrderIntoOrderList(order);
                Owner owner = accounts.getOwner(hallOwnerIndex);
                owner.addOrderIntoList(order);
                IntuiativeMessage.displayCheckOutSuccessfully();
                UserInterface.displayOrder1();
                currentCustomer.displayCartToDelete();
                orders.display(order);
                UserInterface.displayOrder2();
                currentCustomer.clearCart();
                return;
            //} else{
            //    IntuiativeMessage.displayTotalPriceLessThan25();
            //    return;
            //}
        }
        return;
    }

    /**
     * review the previous order
     */
    private void checkOrder()
    {
        UserInterface.displayOrderHistory1();
        currentCustomer.displayOrderHistory();
        UserInterface.displayOrderHistory2();
        int quit = currentCustomer.historySize() + 1;
        System.out.println();
        System.out.println(quit + ". " + "Back to Search Page");
        System.out.println();
        System.out.println();
        System.out.println("Please enter the index and press enter: ");
        int input = Receiver.getIntInput();
        while (input < 1 || input > currentCustomer.historySize() + 1)
        {
            input = Receiver.getIntInput();
        }
        if (input == quit)
        {
            search();
            return;
        }
        Order order = currentCustomer.getOrderByIndex(input - 1);
        UserInterface.displayOrder1();
        order.displayEvents();
        orders.display(order);
        IntuiativeMessage.pressEnterToContinue();
        search();
    }

    /**
     * provide the funtionality of manage halls for owner.
     */
    private void operation()
    {
        //while(true)
        //{
            int option = OwnerInterface.displayOperation();
            switch (option)
            {
                case 1:
                viewHalls();
                operation();
                break;
                case 2:
                registerNewHall();
                operation();
                break;
                case 3:
                      
                break;   
                
                default:
                break;
            }     
        //}
    }

    /**
     * check the condition of the hall owned.
     */
    //viewHalls()
    private void viewHalls()
    
    {
        OwnerInterface.theHallOwned();
        if (currentOwner.getAmountOfHallOwned() > 0)  //getAmountOfHallsOwned
        {   currentOwner.displayTheHallOwned(currentOwner.getHallOwned());//displayTheHallOwned
            System.out.println("");
            System.out.println("Please Enter the Index to view the detailed information about the selected halls");
            System.out.println("                   " + "Press Enter To Continue......" );            
            int index = Receiver.getIntInput();
            while (index > currentOwner.getAmountOfHallOwned() || index < 1)
            {
                IntuiativeMessage.displayInputIsInValid();
                index = Receiver.getIntInput();
            }
            Hall hal = currentOwner.getHallViaIndex(index - 1);
            halls.display(hal);
            IntuiativeMessage.pause();
            
        } else {
            System.out.println("You don't have any selected halls.");
            System.out.println("Please regiseter your halls.");
            System.out.println("");
            System.out.println("                     " + "Press Enter To Continue......" );
            IntuiativeMessage.pause();
            
        }
    }

    /**
     * provide the function for owner to register new hall.
     */

    public void registerNewHall()
    
    
    {
        
        ArrayList<String> param1 = OwnerInterface.displayRegisterNewHall();
        String name = param1.get(0);
        String address = param1.get(1);
        String phoneNumber = param1.get(2);
        String suburb = param1.get(3);
        String function = param1.get(4);  
        IndexGenerator iG = new IndexGenerator(10000,99999,1000,9999,10000000,99999999);
        int hallId = iG.generateHallId();     
        int index = currentOwner.getIndex();
        Hall hal = halls.createHall(index,hallId,name,address,phoneNumber,suburb,function);
             
    
        
        String Name11 = "Wedding ceremony";
        String hallName11 = name;
        String hallDescription11 = "Wedding ceremony.";
        int normalPrice11 = 160;
        int discountPrice11 = 110;
        String category11 = "Wc";
        Events f111 = owner01.createEvents(Name11,hallName11,hallDescription11,normalPrice11,discountPrice11,category11,hallId,index);

        String Name12 = "Wedding reception";
        String hallName12 = name;
        String hallDescription12 = "Wedding reception.";
        int normalPrice12 = 190;
        int discountPrice12 =140;
        String category12 = "Wr";
        Events f121 = owner01.createEvents(Name12,hallName12,hallDescription12,normalPrice12,discountPrice12,category12,hallId,index);

        String Name13 = "Birthday";
        String hallName13 = name;
        String hallDescription13 = "Birthday.";
        int normalPrice13 = 170;
        int discountPrice13 = 120;
        String category13 = "Br";
        Events f131 = owner01.createEvents(Name13,hallName13,hallDescription13,normalPrice13,discountPrice13,category13,hallId,index);   
        
        hal.addEventsIntoList(f111);
        hal.addEventsIntoList(f121);
        hal.addEventsIntoList(f131);
        halls.registerHallIntoSystem(hal);
        owner01.registerHallIntoHallOwnedList(hal);
        
        
        
        
        
        
        
        halls.registerHallIntoSystem(hal);
        currentOwner.registerHallIntoHallOwnedList(hal);
        IntuiativeMessage.displaySuccessfulRegisterNewHall();
        
        
        
        
        
        
        
        
        
        
    }    


    
}
