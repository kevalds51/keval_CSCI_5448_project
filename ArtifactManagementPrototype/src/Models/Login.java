package Models;

import java.util.*;

/**
 *  The Login interface
 */
public interface Login {

    /**
     * @param userID 
     * @param pass 
     * @return
     */
    public String loginUser(Integer userID, String pass);

}