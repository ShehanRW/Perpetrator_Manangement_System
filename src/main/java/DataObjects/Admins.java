package DataObjects;

public class Admins {
    
    private int id;
    private String username;
    private String adminName;
    private String position;
    private String adminType;

    public Admins() {
        //constructor
    }

    public Admins(String username, String adminName, String position, String adminType) {
        this.username = username;
        this.adminName = adminName;
        this.position = position;
        this.adminType = adminType;
    }
    
    public Admins(String username){
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAdminType() {
        return adminType;
    }

    public void setAdminType(String adminType) {
        this.adminType = adminType;
    }
        
}
