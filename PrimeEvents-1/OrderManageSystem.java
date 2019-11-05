import java.util.*;
/**
 * OrderManageSystem class is one of controllers, which provide the function about managing order.
 * @author (Fan Zhang) 
 * @version (2019.10.16)
 */
public class OrderManageSystem
{
    private ArrayList<Order> orderList;

    /**
     * Constructor for objects of class SHIPLIST
     */
    public OrderManageSystem()
    {
        // initialise instance variable of ship list
        this.orderList = new ArrayList<Order>();
    }

    public ArrayList<Order> getOrderList()
    {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList)
    {
        this.orderList = orderList;
    }

    public void addOrderIntoOrderList(Order order)
    {
        this.orderList.add(order);
    }

    public void removeOrderFromOrderList(int index)
    {
        this.orderList.remove(index);
    }

    public int getSize()
    {
        return orderList.size();
    }

    public Order getOrder(int index)
    {
        return orderList.get(index);
    }

    /**
     * display the detailed information about order.
     */    
    public void display(Order order)
    {
        System.out.println("");
        System.out.println("");
        System.out.println("Hall ID: " + order.getHallId());
        System.out.println("Hall Name: " + order.getHallName());
        System.out.println("Hall Owner Index: " + order.getHallOwnerIndex());
        System.out.println("Order Id: " + order.getOrderId());
        System.out.println("Date & Time: " + order.getDateAndTime());
        System.out.println("Status: " + order.getStatus());
        System.out.println("Email: " + order.getEmail());
        System.out.println("Customer Index: " + order.getCustomerIndex());
        System.out.println("");
        System.out.println("");
        System.out.println("Total Price:                                                                " + "$" + order.getTotalPrice());
    }

}
