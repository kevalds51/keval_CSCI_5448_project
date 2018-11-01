
import java.util.*;

/**
 * 
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
     * 
     */
    private String name;

    /**
     * 
     */
    private Integer userID;

    /**
     * 
     */
    private Integer age;

    /**
     * 
     */
    private String address;

    /**
     * 
     */
    private String password;

    /**
     * @return
     */
    public String printPersonDetails() {
        // TODO implement here
        return "";
    }

    /**
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