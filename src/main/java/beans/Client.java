package beans;

public class Client {

    private String ID;

    private String fullName;

    public Client() {
    }

    public Client(String ID, String fullName) {
        this.ID = ID;
        this.fullName = fullName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
