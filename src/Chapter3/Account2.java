package Chapter3;
// Fig 3.5
// Account class with a constructor that initializes the name
public class Account2 {
    private String name; //instance variable
    // Constructor initializes name with parameters name
    public Account2 (String name) // Constructor name is class name
    {
        this.name = name;
    }
    // method to set the same
    public void setName(String name)
    {
        this.name = name;
    }
    // method to retrieve the name


    public String getName() {
        return name;
    }

}
