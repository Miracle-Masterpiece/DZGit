package task1;

public class Contact {
    private String name;
    private String email;
    private long number;

    public Contact(long number, String email, String name) {
        this.number = number;
        this.email = email;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void displayInfo() {}
}
