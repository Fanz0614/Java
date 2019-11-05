import java.util.*;
/**
 * Owner is an entity class as well as sub class of super class user.
 * contains the basic funtions about owner.
 * @author (Fan Zhang) 
 * @version (2019.10.15)
 */
public class Owner extends User
{
    private ArrayList<Hall> hallOwned;
    private ArrayList<Order> orders;

    public Owner(int index,String name,String address,String email,String password,String phoneNumber) 
    {
        super(index,name,address,email,password,phoneNumber);
        this.hallOwned = new ArrayList<Hall>();
        this.orders = new ArrayList<Order>();
    }

    public ArrayList<Hall> getHallOwned() 
    {
        return hallOwned;
    }

    public void setHallOwned(ArrayList<Hall> hallOwned)
    {
        this.hallOwned = hallOwned;
    }

    public ArrayList<Order> getOrders()
    {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders)
    {
        this.orders = orders;
    }

    public void registerHallIntoHallOwnedList(Hall hall)
    {
        hallOwned.add(hall);        
    }

    public void removeHallForOwner(int index)
    {
        hallOwned.remove(index);
    }

    public void addOrderIntoList(Order order)
    {
        orders.add(order);
    }

    public int getAmountOfHallOwned()
    {
        return hallOwned.size();
    }

    public Hall getHallViaIndex(int index)
    {
        return hallOwned.get(index);
    }

    public Events createEvents(String theEventsName, String theHallName, String theEventsDes, int theNorPrice, int discountPrice, String theCat,int a, int b)
    {
        Events events = new Events(theEventsName,theHallName,theEventsDes,theNorPrice,discountPrice,theCat,a,b);
        return events;       
    }

    /**
     * display the all the hall belongs to current owner.
     * @param hallOwned ArrayList<Hall> contains corresponding hall information.
     */    
    public void displayTheHallOwned(ArrayList<Hall> hallOwned)
    {            
        int temp;
        String halName;
        for (int i = 0; i < hallOwned.size(); i++)
        {
            temp = i + 1;
            Hall hal = hallOwned.get(i);
            halName = hal.getHallName();
            System.out.println(temp + ". " + halName);
        }
    }

    private boolean checkIfDontOwnHall(ArrayList<Hall> hallOwned)
    {
        if (hallOwned.size() == 0)
        {
            return true;
        }
        return false;
    }    
    
    public void displayhallToDelete()
    {
        String hal;
   
    }
    
}
