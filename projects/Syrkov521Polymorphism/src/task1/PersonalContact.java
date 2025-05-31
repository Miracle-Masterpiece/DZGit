package task1;

public class PersonalContact extends Contact {
    private String address;

    public PersonalContact(long number, String email, String name, String address) {
        super(number, email, name);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void displayInfo() {
        System.out.println("[Name: " + getName() + ", email: " + getEmail() + ", number: " + getNumber() + "]");
    }

}
