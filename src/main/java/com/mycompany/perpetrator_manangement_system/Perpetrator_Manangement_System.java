
package com.mycompany.perpetrator_manangement_system;

import database_controllers.DatabaseConnection;
import views.LoginActivity;

public class Perpetrator_Manangement_System {

    public static void main(String[] args) {
        LoginActivity loginActivity = new LoginActivity();
        loginActivity.setVisible(true);
        
        DatabaseConnection connect = new DatabaseConnection();
    }
}