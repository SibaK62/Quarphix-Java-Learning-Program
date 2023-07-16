// Fig2. 3.5: Account.java
//Account class with a constructor that initializes  the name.

public class Account2
{
    private String name; // instance variable
    
    // constructor initializes name wwith parameter name
    public Account2(String name) // constructor name is class name
    {
        this.name = name;
    }

    //method to set the name
    public void setName(String name)
    {
        this.name = name;
    }

    //method to retrieve the name
    public String getName()
    {
        return name;
    }
} // end class Account

