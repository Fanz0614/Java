import java.util.*;
/**
 * HallManageSystem class is one of controllers, which provides functionality of searching hall
 * and display result of searching.
 * @author (Fan Zhang) 
 * @version (2019.10.16)
 */
public class HallManageSystem
{ 
    private ArrayList<Hall> hallList; 

    public HallManageSystem()
    {
        this.hallList = new ArrayList<Hall>();
    }

    public ArrayList<Hall> getHallList()
    {
        return hallList;
    }

    public int getHallListSize()
    {
        int size = hallList.size();
        return size;
    }

    public void setHallList(ArrayList<Hall> hallList) 
    {
        this.hallList = hallList;
    } 

    public void registerHallIntoSystem(Hall hall) 
    { 
        hallList.add(hall);
    } 

    public void removeHallFromSystem(int index)
    {
        hallList.remove(index);
    }

    public Hall createHall(int index,int hallId,String hallName,String hallAddress,String phoneNumber, String suburb, String function)
    {
        Hall myRes = new Hall(index,hallId,hallName,hallAddress,phoneNumber,suburb,function);
        return myRes;
    }

    /**
     * find all the result accrouding to the searching keyword and store it into arrayList.
     * @return give back ArrayList<String> which contain all the hall names matching to search keyword.
     */
    private ArrayList<String> createListFunction()
    {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < hallList.size(); i++)
        {
            Hall res = hallList.get(i);
            if (!checkIfExists(list,res.getFunction()))
            {
                list.add(res.getFunction());                
            }            
        }  
        return list;
    }

    /**
     * find all the result accrouding to the searching keyword and store it into arrayList.
     * @return give back ArrayList<String> which contain all the hall names matching to search keyword.
     */
    private ArrayList<String> createListSuburb()
    {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < hallList.size(); i++)
        {
            Hall res = hallList.get(i);
            if (!checkIfExists(list,res.getSuburb()))
            {
                list.add(res.getSuburb());                
            }            
        }  
        return list;
    }

    private boolean checkIfExists(ArrayList<String> list,String name)
    {
        for (int i = 0; i < list.size(); i++)
        {   
            String string = list.get(i);
            if (string.equalsIgnoreCase(name))
            { 
                return true;
            }	        
        } 
        return false;
    }

    private void displayArrayList(ArrayList<String> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            int temp = i + 1;
            String str = list.get(i);
            System.out.println(temp + "." + str);
        }
    }

    private boolean IfNoMatchingResult(ArrayList<Hall> list)
    {
        if (list.size() == 0)
        {
            return true;
        } 
        return false;
    }

    public void displayNoMachingError()
    {
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");        
        System.out.println("There are no maching halls in the system.");
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");        
    }

    public void hintOfSearchableFunction()
    {
        ArrayList<String> list = createListFunction();
        displayArrayList(list);
    }

    public void hintOfSearchableSuburb()
    {
        ArrayList<String> list = createListSuburb();
        displayArrayList(list);
    }

    /**
     * search hall by function
     * @return give back ArrayList<Hall> which contains all the hall matches the keyword.
     */
    public ArrayList<Hall> searchByFunction(String function) 
    {
        ArrayList<Hall> list = new ArrayList<Hall>();
        for (int i = 0; i < hallList.size(); i++)
        {
            Hall res = hallList.get(i);
            if (res.getFunction().equalsIgnoreCase(function))
            {
                list.add(res);
            }
        }

        if (IfNoMatchingResult(list))
        {
            displayNoMachingError();
            return null;
        }
        return list;
    } 

    /**
     * search hall by function
     * @return give back ArrayList<Hall> which contains all the halls matche the keyword.
     */
    public ArrayList<Hall> searchBySuburb(String suburb) 
    { 
        ArrayList<Hall> list = new ArrayList<Hall>();
        for (int i = 0; i < hallList.size(); i++)
        {
            Hall res = hallList.get(i);
            if (res.getSuburb().equalsIgnoreCase(suburb))
            {
                list.add(res);
            }
        }
        if (IfNoMatchingResult(list))
        {
            displayNoMachingError();
            return null;
        }
        return list;
    } 

    /**
     * display the searching result
     * @param list contain the corresponding hall information
     */
    public void displaySearchingResult(ArrayList<Hall> list)
    { 
        System.out.print('\u000c');
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");        
        System.out.println("About " + list.size() + " results: ");
        for (int i = 0; i < list.size(); i++)
        {
            int temp = i + 1;
            Hall res = list.get(i);
            System.out.println(temp + "." + res.getHallName() + "   @@   " + "Function: " + res.getFunction() + "   @@   " + "Suburb: " + res.getSuburb());
        }        
        System.out.println("");
        System.out.println("Please Enter the Index to view the menu of the selected hall");
        System.out.println("                   " + "Press Enter To Continue......" );                
    }

    public Hall selectHallByIndex(int index) 
    { 
        return hallList.get(index);
    } 

    public void displayHallList()
    {
        for (int i = 0; i < hallList.size(); i++)
        {
            int temp = i + 1;
            Hall res = hallList.get(i);
            System.out.println(temp + "." + res.getHallName());
        }           
    }

    public void display(Hall rest)
    {
        System.out.print('\u000c');
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");        
        System.out.println("                      " + "Hall Inforamtion: ");             
        System.out.println("                      " + "Hall Name: " + rest.getHallName());
        System.out.println("                      " + "Index: " + rest.getIndex());
        System.out.println("                      " + "Hall Id: " + rest.getHallId());
        System.out.println("                      " + "Hall Address: " + rest.getHallAddress());        
        System.out.println("                      " + "Phone Number: " + rest.getPhoneNumber());
        System.out.println("                      " + "Suburb: " + rest.getSuburb());
        System.out.println("                      " + "Function: " + rest.getFunction());
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");  
        System.out.println("                      " + "Press Enter To Continue......" );        
    }
} 

