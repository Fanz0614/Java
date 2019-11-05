/**
 * The user class is an entity class
 * super class of customer class, owner class, administrator class.
 * @author (Fan Zhang) 
 * @version (2019.10.16)
 */
public class User
{
    private final int index;
    private String name;
    private String address;
    private String email;
    private String password;
    private String phoneNumber;    

    public User(int index,String name,String address,String email,String password,String phoneNumber)
    {
        this.index = index;
        this.name = name;
        this.address = address;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public int getIndex() 
    {
        return index;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }

    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() 
    {
        return phoneNumber;
    }	    
}