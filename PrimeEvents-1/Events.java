/**
 * The Events class is an entity class
 * provide basic funtions of events.
 * @author (Fan Zhang) 
 * @version (2019.10.16)
 */
public class Events
{
    private String eventsName;
    private String hallName;    
    private String eventsDescription;
    private int normalPrice;
    private int discountPrice;
    private String category;
    private int hallId;
    private int hallOwnerIndex;
    public Events(String theEventsName,String theHallName,String theEventsDes,int theNorPrice,int discountPrice,String theCat,int hallId,int hallOwnerIndex)
    {
        this.eventsName = theEventsName;
        this.hallName = theHallName;
        this.eventsDescription = theEventsDes;
        this.normalPrice = theNorPrice;
        this.discountPrice = discountPrice;
        this.category = theCat;
        this.hallId = hallId;
        this.hallOwnerIndex = hallOwnerIndex;
    }

    public int getHallId()
    {
        return hallId;
    }

    public void setHallId(int getHallId)
    {
        this.hallId = hallId;
    }

    public int getHallOwnerIndex()
    {
        return hallOwnerIndex;
    }

    public void setHallOwnerIndex(int hallOwnerIndex)
    {
        this.hallOwnerIndex = hallOwnerIndex;
    }

    public String getEventsName()
    {
        return eventsName;
    }

    public String getHallName()
    {
        return hallName;    
    }

    public String getEventsDes()
    {
        return eventsDescription;
    }

    public int getNorPrice()
    {
        return normalPrice;
    }

    public int getDisPrice()
    {
        return discountPrice;
    }

    public String getCat()
    {
        return category;
    }

    public void setEventsName(String theEventsName)
    {
        eventsName = theEventsName;
    }

    public void setHallName(String theHallName)
    {
        hallName = theHallName;
    }

    public void setEventsDes(String theEventsDes)
    {
        eventsDescription = theEventsDes;
    }

    public void setNorPrice(int theNorPrice)
    {
        normalPrice = theNorPrice;
    }

    public void setDisPrice(int theDisPrice)
    {
        discountPrice = theDisPrice;
    }

    public void setCat(String theCat)
    {
        category = theCat;
    }    

    /**
     * check the category of events, if it matches the parameter, return true, otherwise, return false.
     * @param param 
     * @return give back the check result
     */
    public boolean checkIfCategoryIs(String param)
    {
        String cate = param;
        if (category.equalsIgnoreCase(cate))
        {
            return true;
        }
        return false;
    }    
}