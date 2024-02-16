package dataOperations;

import database_controllers.DatabaseConnection;


public class LoginOperation {
    
    DatabaseConnection connection;
    String loginOperation;

    public LoginOperation() {     
        
    }
    
    public boolean isUserAccessible(String username, String password){
        loginOperation = DatabaseConnection.getDbConnection().getLoginDetails(username);
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
