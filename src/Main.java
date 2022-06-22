public class Main {
    public static void main(String[] args) {
    Phone p = new Phone();
    p.addContact();
    p.makeCall("4866195");
    p.searchContact("8449867");
    p.viewContacts();
    p.deleteContact("4866195");
    p.viewContacts();

    }
}
