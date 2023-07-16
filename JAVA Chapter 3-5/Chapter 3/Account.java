// Fig. 3.1 Account.java
// Account class that contains a name intance variable
// and method to set and get its value

public class Account
{
    private String name; // intance variable

    //method to set tha name in the objet
    public void setName(String name)
    {
        this.name = name; //store the name
    }
    
    // method to retrieve the name from the object
    public String getName()
    {
        return name; // return value of the name caller
    }
} // end class account