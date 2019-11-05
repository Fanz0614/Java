import java.util.*;
/**
 * The IndexGenerator class provide the funtions in regards to generating the index for userId, hallId, and OrderId
 * and make sure those id won't be repeated
 * @author (Fan Zhang) 
 * @version (2019.10.16)
 */
public class IndexGenerator 
{
    private int minimumValueForUser;
    private int maximumValueForUser;
    private int minimumValueForHall;
    private int maximumValueForHall;
    private int maximumValueForBooking;
    private int minimumValueForBooking;
    
    private ArrayList<Integer> userIndexPool = new ArrayList<Integer>();
    private ArrayList<Integer> hallIdPool = new ArrayList<Integer>();
    private ArrayList<Integer> orderIdPool = new ArrayList<Integer>();

    public IndexGenerator(int minimumValueForUser, int maximumValueForUser,int minimumValueForHall,int maximumValueForHall,int minimumValueForBooking,int maximumValueForBooking)
    {
        this.minimumValueForUser = minimumValueForUser;
        this.maximumValueForUser = maximumValueForUser;
        this.minimumValueForHall = minimumValueForHall;
        this.maximumValueForHall = maximumValueForHall;
        this.minimumValueForBooking = minimumValueForBooking; 
        this.maximumValueForBooking = maximumValueForBooking; 
    }

    public int getMinimumValueForUser()
    {
        return minimumValueForUser;
    }

    public void setMinimumValueForUser(int minimumValueForUser)
    {
        this.minimumValueForUser = minimumValueForUser;
    }

    public int getMaximumValueForUser() 
    {
        return maximumValueForUser;
    }

    public void setMaximumValueForUser(int maximumValueForUser)
    {
        this.maximumValueForUser = maximumValueForUser;
    }

    public int getMinimumValueForHall()
    {
        return minimumValueForHall;
    }

    public void setMinimumValueForHall(int minimumValueForHall)
    {
        this.minimumValueForHall = minimumValueForHall;
    }

    public int getMaximumValueForHall() 
    {
        return maximumValueForHall;
    }

    public void setMaximumValueForHall(int maximumValueForHall)
    {
        this.maximumValueForHall = maximumValueForHall;
    }

    public int getMinimumValueForOrder()
    {
        return minimumValueForBooking;
    }

    public void setMinimumValueForOrder(int minimumValueForBooking) 
    {
        this.minimumValueForBooking = minimumValueForBooking;
    }

    public int getMaximumValueForOrder() 
    {
        return maximumValueForBooking;
    }

    public void setMaximumValueForOrder(int maximumValueForBooking)
    {
        this.maximumValueForBooking = maximumValueForBooking;
    }

    public ArrayList<Integer> getUserIndexPool() 
    {
        return userIndexPool;
    }

    public void setUserIndexPool(ArrayList<Integer> userIndexPool) 
    {
        this.userIndexPool = userIndexPool;
    }

    public ArrayList<Integer> getHallIdPool() 
    {
        return hallIdPool;
    }

    public void setHallIdPool(ArrayList<Integer> hallIdPool) 
    {
        this.hallIdPool = hallIdPool;
    }

    public ArrayList<Integer> getOrderIdPool() 
    {
        return orderIdPool;
    }

    public void setOrderIdPool(ArrayList<Integer> orderIdPool) 
    {
        this.orderIdPool = orderIdPool;
    }

    private void addUserIndexIntoUserIndexPool(int index)
    {
        userIndexPool.add(index);
    }

    private void addOrderIdIntoOrderIdPool(int index)
    {
        orderIdPool.add(index);
    }

    private void addHallIdIntoHallIdPool(int index)
    {
        hallIdPool.add(index);
    }

    private int getIndexForUser()
    {
        Random generator = new Random();
        int randomNumber = generator.nextInt(maximumValueForUser - minimumValueForUser + 1); 
        return randomNumber + minimumValueForUser;
    }    

    private int getHallId()
    {
        Random generator = new Random();
        int randomNumber = generator.nextInt(maximumValueForHall - minimumValueForHall + 1); 
        return randomNumber + minimumValueForHall;
    }

    private int getIndexForOrder()
    {
        Random generator = new Random();
        int randomNumber = generator.nextInt(maximumValueForBooking - minimumValueForBooking + 1); 
        return randomNumber + minimumValueForBooking;
    }

    private boolean checkIfUserIndexIsRepeated(int index)
    {
        for(int i = 0; i < userIndexPool.size(); i++)
        {
            int temp = userIndexPool.get(i);
            if (temp == index)
            {
                return true;
            }
        }
        return false;
    }

    private boolean checkIfOrderIndexIsRepeated(int index)
    {
        for(int i = 0; i < orderIdPool.size(); i++)
        {
            int temp = orderIdPool.get(i);
            if (temp == index)
            {
                return true;
            }
        }
        return false;
    }

    private boolean checkIfHallIdIsRepeated(int index)
    {
        for(int i = 0; i < hallIdPool.size(); i++)
        {
            int temp = hallIdPool.get(i);
            if (temp == index)
            {
                return true;
            }
        }
        return false;
    }

   /**
     * generate Index for hall and store id into the id pool before check the repeatibility.
     * @return give back unique HallId
     */    
    public int generateHallId()
    {
        int index = getHallId();
        
        while (checkIfHallIdIsRepeated(index))
        {
            index = getHallId();            
        }
        addHallIdIntoHallIdPool(index);
        return index;
    }

     /**
     * generate Index for user and store id into the id pool before check the repeatibility.
     * @return give back unique UserId
     */    
    public int generateIndexForUser()
    {
        int index = getIndexForUser();
        while (checkIfUserIndexIsRepeated(index))
        {
            index = getIndexForUser();            
        }
        addUserIndexIntoUserIndexPool(index);
        return index;
    }
    /**
     * generate Index for orders and store id into the id pool before check the repeatibility.
     * @return give back unique OrderId
     */      
    public int generateIndexForOrder()
    {
        int index = getIndexForOrder();
        while (checkIfOrderIndexIsRepeated(index))
        {
            index = getIndexForOrder();            
        }
        addOrderIdIntoOrderIdPool(index);
        return index;
    }

}