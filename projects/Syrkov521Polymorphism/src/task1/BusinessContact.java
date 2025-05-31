package task1;

public class BusinessContact extends Contact {
    private String companyName;

    public BusinessContact(long number, String email, String name, String companyName) {
        super(number, email, name);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void displayInfo() {
        System.out.println("[Company name: " + getCompanyName() + ", name: " + getName() + ", email: " + getEmail() + ", number: " + getNumber() + "]");
    }
}
