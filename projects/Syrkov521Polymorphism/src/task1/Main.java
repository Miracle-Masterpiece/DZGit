package task1;

public class Main {
    public static void main(String[] args) {
        Contact personal = new PersonalContact(79212725729L, "anything@gmail.com", "Miracle", "Vinewood-Hills");
        Contact business = new BusinessContact(32357823L, "securoserv@gmail.com", "Assistant", "SecuroServ");
        personal.displayInfo();
        business.displayInfo();
    }
}