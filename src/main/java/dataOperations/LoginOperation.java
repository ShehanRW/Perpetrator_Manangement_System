package dataOperations;

import database_controllers.DatabaseConnection;


public class LoginOperation {
    
    DatabaseConnection connection;
    String loginOperation;

    private final String query = "SELECT userName, adminPassword FROM perpetratordb.admins";

    public LoginOperation() {     
        loginOperation = DatabaseConnection.getDbConnection().getLoginDetails(query);
    }
    
    public boolean isUserAccessible(String username, String password){
        
        boolean userValidation;
        userValidation = loginOperation == null ? username+password == null : loginOperation.equals(username+password);
        
        return userValidation;
    }
    
}
