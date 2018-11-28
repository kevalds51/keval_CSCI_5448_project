package Models;

/**
 * The abstract class Person to be extended by the staff or customers
 */
public abstract class Person implements  Login{

    /**
     * Default constructor
     */
    public Person(){
    }

    public Person(String name, Integer userID, Integer age, String address, String password) {
        this.name = name;
        this.userID = userID;
        this.address = address;
        this.age = age;
        this.password = password;
    }

    /**
     * The name of the person
     */
    private String name;

    /**
     * The unique ID assigned to each person
     */
    private Integer userID;

    /**
     * The age of the person
     */
    private Integer age;

    /**
     * The address of the person
     */
    private String address;

    /**
     * The password that they use for creating accounts
     */
    private String password;

    /**
     * This method returns the person details as a single string
     * @return
     */
    public String printPersonDetails() {
        System.out.println("User ID: ("+this.getUserID()+") Name: ("+this.getName()+") Age: ("+this.getAge()+") Address: ("+this.getAddress()+")\n");
        return "";
    }

    /**
     * This method is used to login the person into the Museum system.
     * @param userID
     * @param pass
     * @return
     */
    public String loginUser(Integer userID, String pass) {
        if (this.getUserID().equals(userID) && this.getPassword().equals(pass))
        {
            return this.name+" Login Successful";
        }

        return "Incorrect UserID/Password";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}