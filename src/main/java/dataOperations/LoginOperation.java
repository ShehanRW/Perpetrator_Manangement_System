package dataOperations;

import database_controllers.DatabaseConnection;
import views.AdminsView;


public class LoginOperation {
    
    AdminsView adminsView;
    DatabaseConnection connection;
    String loginOperation;

    public LoginOperation() {     
        //constructor
    }
    
    public boolean isUserAccessible(String username, String password){
        loginOperation = DatabaseConnection.getDbConnection().getLoginDetails(username);
        
        // most important line which set the user name and it will track all the time when peticular user logged.
        DatabaseConnection.getDbConnection().setUsername(username);
        
        boolean userValidation;
        if(loginOperation.equals(password) ){
            userValidation = true;
        }
        else{
            userValidation = false;
        }
        
        return userValidation;
    }
    
}
