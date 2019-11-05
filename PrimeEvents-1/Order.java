import java.util.*;
/**
 * Order class is an entity class 
 * provides basic functions of orders.
 * @author (Fan Zhang) 
 * @version (2019.10.16)
 */
public class Order
{
    private ArrayList<Events> chosenEvents;
    private final int hallId;
    private final String hallName;
    private final int orderId;
    private final String dateAndTime;
    private final String email;
      
    private int totalPrice;
    private String status;
    private final int customerIndex;
    private final int hallOwnerIndex;

    public Order(ArrayList<Events> cart,int hallId, String hallName,int orderId,String dateAndTime,int totalPrice,String email,int customerIndex,int hallOwnerIndex)
    {
        this.chosenEvents = cart;
        this.hallId = hallId;  
        this.hallName = hallName; 
        this.orderId = orderId; 
        this.dateAndTime = dateAndTime;   
        this.totalPrice = totalPrice; 
        this.status = "Booked";
        this.email = email;
        this.customerIndex = customerIndex;
        this.hallOwnerIndex = hallOwnerIndex;
    }

    public ArrayList<Events> getOrderEventsList()
    {
        return chosenEvents;
    }

    public int getHallId()
    {
        return hallId;
    }

    public String getHallName()
    {
        return hallName;
    }

    public int getOrderId()
    {
        return orderId;
    }

    public String getDateAndTime()
    {
        return dateAndTime;
    }

    public int getTotalPrice()
    {
        return totalPrice;
    }

    public String getStatus()
    {
        return status;
    }

    public String getEmail()
    {
        return email;
    }

    public int getCustomerIndex()
    {
        return customerIndex;
    }

    public int getHallOwnerIndex()
    {
        return hallOwnerIndex;
    }

    public void setChosenEvents(ArrayList<Events> cart)
    {
        this.chosenEvents = cart;        
    }

    public void setTotalPrice(int theTotPrice)
    {
        totalPrice = theTotPrice;
    }

    public void setStatus(String theStatus)
    {
        status = theStatus;
    }

    public void displayEvents()
    {
        String eventsName;
        for(int i = 0; i < chosenEvents.size(); i++)
        {
            Events events = chosenEvents.get(i);
            eventsName = events.getEventsName();
            System.out.println("---------------------" + eventsName + "       *1");   
        }
    }
}