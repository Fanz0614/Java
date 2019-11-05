import java.util.*;
/**
 * The class List is an entity class
 * provides basic funtion of category
 * @author (Fan Zhang) 
 * @version (2019.10.06)
 */
public class List
{	
    private ArrayList<Events> eventsList;
    private int hallId;

    public List(int hallId) 
    {
        this.eventsList = new ArrayList<Events>();
        this.hallId = hallId;
    }

    public void setEventsList(ArrayList<Events> eventsList)
    {
        this.eventsList = eventsList;
    }

    public ArrayList<Events> getEventsList() 
    {
        return eventsList;
    }

    public int getHallId()
    {
        return hallId;
    }

    public void setHallId(int hallId)
    {
        this.hallId = hallId;
    }    

    public Events getEventsViaIndex(int index) 
    {
        Events events = eventsList.get(index);
        return events;
    }

    public void addEventsIntoEventsList(Events events)
    {
        eventsList.add(events);
    }

    public void removeEventsFromEventsList(int index) 
    {
        eventsList.remove(index);
    }

    public Events selectEventsByIndex(int index) 
    { 
        return eventsList.get(index);
    } 

    public void display()
    {
        int temp;
        String eventsName;
        int normalPrice;
        int discountPrice;
        for(int i = 0; i < eventsList.size(); i++)
        {
            temp = i + 1;
            Events events = eventsList.get(i);
            eventsName = events.getEventsName();
            normalPrice = events.getNorPrice();
            discountPrice = events.getDisPrice();
            System.out.println(temp + ". " + eventsName);   
            
        }
    }

    public void display(Events events)
    {
        System.out.println("HallName: " + events.getEventsName());
        System.out.println("HallName: " + events.getHallName());
        System.out.println("HallDescription: " + events.getEventsDes());
        System.out.println("normalPrice: " + events.getNorPrice());
        System.out.println("DiscountPrice: " + events.getDisPrice());
        System.out.println("category: " + events.getCat());    
    }

    public ArrayList<Events> generateWcList()
    {
        ArrayList<Events> Wc = new ArrayList<Events>();
        String param1 = "Wedding ceremony";
        for (int i = 0; i < eventsList.size(); i ++)
        {
            if (eventsList.get(i).checkIfCategoryIs(param1))            
            {
                Wc.add(eventsList.get(i));
            }   
        }
        return Wc;
    }

    public ArrayList<Events> generateWrList()
    {
        ArrayList<Events> Wr = new ArrayList<Events>();
        String param2 = "Wedding reception";
        for (int i = 0; i < eventsList.size(); i ++)
        {
            if (eventsList.get(i).checkIfCategoryIs(param2))            
            {
                Wr.add(eventsList.get(i));
            }
        }
        return Wr;
    }

    public ArrayList<Events> generateBrList()
    {
        ArrayList<Events> Br = new ArrayList<Events>();
        String param3 = "Birthday";
        for (int i = 0; i < eventsList.size(); i ++)
        {
            if (eventsList.get(i).checkIfCategoryIs(param3))            
            {
                Br.add(eventsList.get(i));
            } 
        }
        return Br;
    }
}
