import java.util.*;
/**
 * The Customer class is an entity class
 * sub class User class.
 * provide basic function that customer can operate.
 * @author (Fan Zhang) 
 * @version (2019.10.16)
 */
public class Customer extends User
{
    private boolean ifItIsNonNormaluser;
    private boolean ifPreferredPaymentIsCash;
    private ArrayList<Order> orderHistory;
    private ArrayList<Events> cart;

    public Customer(int index,String name,String address,String email,String password,String phoneNumber,boolean ifItIsNonNormaluser, boolean ifPreferredPaymentIsCash) 
    {
        super(index,name,address,email,password,phoneNumber);
        this.ifItIsNonNormaluser = ifItIsNonNormaluser;
        this.ifPreferredPaymentIsCash = ifPreferredPaymentIsCash;
        this.orderHistory = new ArrayList<Order>();
        this.cart = new ArrayList<Events>();
    }

    public boolean getIfItIsNonNormaluser() 
    {
        return ifItIsNonNormaluser;
    }

    public void setIfItIsNonNormaluser(boolean ifItIsNonNormaluser) 
    {
        this.ifItIsNonNormaluser = ifItIsNonNormaluser;
    }

    public boolean getIfPreferredPaymentIsCash() {
        return ifPreferredPaymentIsCash;
    }

    public void setIfPreferredPaymentIsCash(boolean ifPreferredPaymentIsCash) {
        this.ifPreferredPaymentIsCash = ifPreferredPaymentIsCash;
    }

    public void setOrderHistory(ArrayList<Order> orderHistory) 
    {
        this.orderHistory = orderHistory;
    }

    public ArrayList<Order> getOrderHistory() 
    {
        return orderHistory;
    }

    public void setCart(ArrayList<Events> cart) 
    {
        this.cart = cart;
    }

    public ArrayList<Events> getCart() 
    {
        return cart;
    }

    public Order makeAnOrder(ArrayList<Events> list,int hallId, String hallName,int orderId,String dateAndTime,int totalPrice,String email,int customerIndex,int hallOwnerIndex)
    {
        Order newOrder = new Order(list,hallId,hallName,orderId,dateAndTime,totalPrice,email,customerIndex,hallOwnerIndex);    
        return newOrder;
    }

    public void addEventsIntoCart(Events events)
    {
        cart.add(events);        
    }

    public void removeEventsFromCart(int index)
    {
        cart.remove(index);
    }

    public void addOrderIntoHistory(Order order)
    {
        orderHistory.add(order);
    }

    public void displayCart()
    {
        String eventsName;
        for(int i = 0; i < cart.size(); i++)
        {
            Events events = cart.get(i);
            eventsName = events.getEventsName();
            System.out.println("---------------------" + eventsName + "       *1");   
        }
    }

    public void displayCartToDelete()
    {
        String eventsName;
        int temp;
        for(int i = 0; i < cart.size(); i++)
        {
            temp = i + 1;
            Events events = cart.get(i);
            eventsName = events.getEventsName();
            System.out.println(temp + ". " + eventsName + "       *1");   
        }
    }

    public boolean checkCart()
    {
        String name;
        if (cart.size() < 1)
        {
            System.out.print('\u000c');
            System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
            System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
            System.out.println("");            
            System.out.println("                          " + "The cart is empty!!!");
            System.out.println("             " + "Please add hall into your cart before check out");
            System.out.println("                        " + "Press Enter To Continue......" );
            Scanner console = new Scanner(System.in);
            String acceptInput;                
            acceptInput = console.nextLine();
            return false;
        }
        name = cart.get(0).getHallName();
        for (int i = 0; i < cart.size(); i ++)
        {
            Events events = cart.get(i);
            if (!events.getHallName().equals(name))
            {
                System.out.print('\u000c');
                System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                System.out.println("");            
                System.out.println("         " + "For each order can only contain items from the same hall!!!");
                System.out.println("                          " + "Please reorder your cart.");
                System.out.println("                        " + "Press Enter To Continue......" );
                Scanner console = new Scanner(System.in);
                String acceptInput;                
                acceptInput = console.nextLine();
                return false;
            }
        }
        return true;
    }

    public int calculateTotalAmount()
    {
        int totalAmount = 0;
        if (ifItIsNonNormaluser)
        {            
            for (int i = 0; i < cart.size(); i ++)
            {
                Events events= cart.get(i);
                totalAmount = totalAmount + events.getDisPrice();                
            }            
        } 
        else{
            for (int i = 0; i < cart.size(); i ++)
            {
                Events events = cart.get(i);
                totalAmount = totalAmount + events.getNorPrice();                
            }             
        }
        return totalAmount;
    }

    public void clearCart()
    {
        cart.clear();
    }

    public void displayOrderHistory()
    {
        int temp;
        for(int i = 0; i < orderHistory.size(); i++)
        {
            temp = i + 1;
            Order order = orderHistory.get(i);
            System.out.println(temp + ". " + order.getDateAndTime());               
            System.out.println("Hall Name: " + order.getHallName());
            System.out.println("Status: " + order.getStatus());
        }
    }
    
    public int historySize()
    {
        return orderHistory.size();
    }
    
    public Order getOrderByIndex(int index)
    {
        return orderHistory.get(index);
    }
}