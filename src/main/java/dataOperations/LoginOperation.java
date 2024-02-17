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
