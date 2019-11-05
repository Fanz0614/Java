import java.util.*;
/**
 * AccountManageSystem is one of the controllers, which provide the functionality of validating users(login), 
 * register users.
 * @author (Fan Zhang) 
 * @version (2019.10.16)
 */
public class AccountManageSystem
{
    private ArrayList<User> listOfUser;
    private ArrayList<Owner> listOfOwner;
     private ArrayList<Customer> listOfCustomer;
    public AccountManageSystem()
    {
        this.listOfUser = new ArrayList<User>();
        this.listOfOwner = new ArrayList<Owner>();
        this.listOfCustomer = new ArrayList<Customer>();
    }

    private ArrayList<User> getListOfUser()
    {
        return this.listOfUser;
    }

    private ArrayList<Customer> getListOfCustomer()
    {
        return this.listOfCustomer;
    }

    private ArrayList<Owner> getListOfOwner()
    {
        return this.listOfOwner;
    }

    private void setListOfUser(ArrayList<User> listOfUser)
    {
        this.listOfUser = listOfUser;
    }

    private void setListOfCustomer(ArrayList<Customer> listOfCustomer)
    {
        this.listOfCustomer = listOfCustomer;
    }

    private void setListOfOwner(ArrayList<Owner> listOfOwner)
    {
        this.listOfOwner = listOfOwner;
    }

    private Customer createNormalCustomer(int index,String name,String address,String email,String password,String phoneNumber,boolean ifItIsUser,boolean ifPreferredPaymentIsCash)
    {
        ifItIsUser = true;
        Customer normalCustomer = new Customer(index,name,address,email,password,phoneNumber,ifItIsUser,ifPreferredPaymentIsCash);
        return normalCustomer;
    }

    private Customer createNonNormalCustomer(int index,String name,String address,String email,String password,String phoneNumber,boolean ifItIsUser,boolean ifPreferredPaymentIsCash)
    {
        ifItIsUser = false;
        Customer nonNormalCustomer = new Customer(index,name,address,email,password,phoneNumber,ifItIsUser,ifPreferredPaymentIsCash);
        return nonNormalCustomer;
    }

    public Owner createOwner(int index,String name,String address,String email,String password,String phoneNumber)
    {
        Owner owner = new Owner(index,name,address,email,password,phoneNumber);
        return owner;
    }

    private void addCustomerIntoCustomerArray(Customer customer)
    {
        listOfCustomer.add(customer);
    }

    public void addOwnerIntoOwnerArray(Owner owner)
    {
        listOfOwner.add(owner);
    }

    public void addUserIntoUserArray(User user)
    {
        listOfUser.add(user);
    }

    private void addUserAsCustomer(Customer userCust)
    {
        addCustomerIntoCustomerArray(userCust);
        addUserIntoUserArray(userCust);
    }

    private void addUserAsOwner(Owner userOwn)
    {
        addOwnerIntoOwnerArray(userOwn);
        addUserIntoUserArray(userOwn);
    }

    public void registerUserAsCustomer(int index,String name,String address,String email,String password,String phoneNumber,boolean ifItIsUser,boolean ifPreferredPaymentIsCash)
    {
        if (ifItIsUser == true)
        {
            Customer cust = createNormalCustomer(index,name,address,email,password,phoneNumber,ifItIsUser,ifPreferredPaymentIsCash);
            addUserAsCustomer(cust);
        }
        else
        {
            Customer cust = createNonNormalCustomer(index,name,address,email,password,phoneNumber,ifItIsUser,ifPreferredPaymentIsCash);
            addUserAsCustomer(cust);
        }
    }

    public void registerUserAsOwner(int index,String name,String address,String email,String password,String phoneNumber)
    {
        Owner usOwn = createOwner(index,name,address,email,password,phoneNumber);
        addUserAsOwner(usOwn);
    }

    public boolean checkCustomer(String email, String password)
    {
        for (int i = 0; i < listOfCustomer.size(); i++)
        {
            Customer temp = listOfCustomer.get(i);
            if (temp.getEmail().equals(email) && temp.getPassword().equals(password))
            {
                return true;
            }
        }
        return false;
    }

    public Customer getCustomer(String email, String password)
    {
        for (int i = 0; i < listOfCustomer.size(); i++)
        {
            Customer temp = listOfCustomer.get(i);
            if (temp.getEmail().equals(email) && temp.getPassword().equals(password))
            {
                return temp;
            }
        }
        return null;
    }

    public boolean checkOwner(String email, String password)
    {
        for (int i = 0; i < listOfOwner.size(); i++)
        {
            Owner temp = listOfOwner.get(i);
            if (temp.getEmail().equals(email) && temp.getPassword().equals(password))
            {
                return true;
            }
        }
        return false;
    }

    public Owner getOwner(String email, String password)
    {
        for (int i = 0; i < listOfOwner.size(); i++)
        {
            Owner temp = listOfOwner.get(i);
            if (temp.getEmail().equals(email) && temp.getPassword().equals(password))
            {
                return temp;
            }
        }
        return null;
    }

    public void display(User user)
    {
        System.out.print('\u000c');
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+Welcome to Prime Events+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");        
        System.out.println("                      " + "User Inforamtion: ");       
        System.out.println("                      " + "Index: " + user.getIndex());
        System.out.println("                      " + "Name: " + user.getName());
        System.out.println("                      " + "Address: " + user.getAddress());
        System.out.println("                      " + "Email: " + user.getEmail());
        System.out.println("                      " + "Password: " + "###############");
        System.out.println("                      " + "Phone Number: "  + user.getPhoneNumber());
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");        
        System.out.println("             " + "Hello, " + "@" + user.getName() + "@" + ", Welcome to Prime Events!" + " ");
        System.out.println("                      " + "Press Enter To Continue......" );
    }    

    public Owner getOwner(int index)
    {
        for (int i = 0; i < listOfOwner.size(); i++)
        {
            Owner temp = listOfOwner.get(i);
            if (temp.getIndex() == index)
            {
                return temp;
            }
        }
        return null;
    }
}

