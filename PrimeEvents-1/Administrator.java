/**
 * Administrator class is an entity class as well as the sub class of user.
 * @author (Fan Zhang) 
 * @version (2019.10.16)
 */
public class Administrator extends User
{

    public Administrator(int index,String name,String address,String email,String password,String phoneNumber)
    {
        super(index,name,address,email,password,phoneNumber);
    }
}
