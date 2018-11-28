package Models;

import java.util.*;

/**
 *  The Login interface
 */
public interface Login {

    /**
     * @param userID the unique login ID for a user
     * @param pass the password for that userID
     * @return
     */
    public String loginUser(Integer userID, String pass);

}