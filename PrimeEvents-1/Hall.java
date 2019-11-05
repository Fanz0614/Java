import java.util.*;
/**
 * The Hall class is an entity class.
 * provides basic funtions of hall.
 * @author (Fan Zhang) 
 * @version (2019.10.16)
 */
public class Hall
{
    private int index;
    private final int hallId;
    private String hallName;
    private String hallAddress;
    private String phoneNumber;
    private String suburb;
    private String function;
    private List list;

    public Hall(int index,int hallId,String hallName,String hallAddress,String phoneNumber, String suburb, String function) {
        this.index = index;
        this.hallId = hallId;
        this.hallName = hallName;
        this.hallAddress = hallAddress;
        this.phoneNumber = phoneNumber;
        this.suburb = suburb;
        this.function = function;
        this.list = new List(this.hallId);
    }

    public int getIndex()
    {
        return index;
    }

    public void setIndex(int index)
    {
        this.index = index;
    }

    public int getHallId() 
    {
        return hallId;
    }

    public String getHallAddress() 
    {
        return hallAddress;
    }

    public void setHallAddress(String hallAddress) 
    {
        this.hallAddress = hallAddress;
    }

    public String getHallName() 
    {
        return hallName;
    }

    public void setHallName(String hallName)
    {
        this.hallName = hallName;
    }

    public String getPhoneNumber() 
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getSuburb()
    {
        return suburb;
    }

    public void setSuburb(String suburb)
    {
        this.suburb = suburb;
    }

    public String getFunction()
    {
        return function;
    }

    public void setFunction(String function) 
    {
        this.function = function;
    }

    public List getList()
    {
        return list;
    }

    public void setList(List list)
    {
        this.list = list;
    }

    public void addEventsIntoList(Events events)
    {
        list.addEventsIntoEventsList(events);
    }

    /**
     * classify the types contained in the list via different categories, then display the corresponding information.
     */
    public void displayList()
    {
        int temp;
        String eventsName;
        
        ArrayList<Events> Wc = list.generateWcList();
        ArrayList<Events> Wr = list.generateWrList();
        ArrayList<Events> Br = list.generateBrList();
        
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");        
        System.out.println("");
        System.out.println("-------Wedding ceremony-------");
        for(int i = 0; i < Wc.size(); i++)
        {
            temp = i + 1;
            Events events = Wc.get(i);
            eventsName = events.getEventsName();
            
            System.out.println(temp + ". " + eventsName);   
              
        }
        System.out.println("");
        System.out.println("-------Wedding reception-------");  
        for(int i = 0; i < Wr.size(); i++)
        {
            temp = i + 1;
            Events events = Wr.get(i);
            eventsName = events.getEventsName();
            
            System.out.println(temp + ". " + eventsName);   
             
        }
        System.out.println("");
        System.out.println("-------Birthday-------");
        for(int i = 0; i < Br.size(); i++)
        {
            temp = i + 1;   
            Events events = Br.get(i);
            eventsName = events.getEventsName();
            
            System.out.println(temp + ". " + eventsName);   
            
        }
         
    }
}
