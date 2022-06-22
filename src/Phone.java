import java.util.ArrayList;
import java.util.Scanner;

public class Phone {
    private String brand;
    private int year;
    private String color;
    private String ScreenSize;
    private String DisplayType;
    private int storageCapacity;

    private ArrayList<Contact> contacts = new ArrayList<>();

    public Phone(String brand, int year, String color, String screenSize, String displayType, int storageCapacity) {
        this.brand = brand;
        this.year = year;
        this.color = color;
        ScreenSize = screenSize;
        DisplayType = displayType;
        this.storageCapacity = storageCapacity;
    }

    public Phone(){

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getScreenSize() {
        return ScreenSize;
    }

    public void setScreenSize(String screenSize) {
        ScreenSize = screenSize;
    }

    public String getDisplayType() {
        return DisplayType;
    }

    public void setDisplayType(String displayType) {
        DisplayType = displayType;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
    public void makeCall(String phoneNumber){
        for(Contact c: contacts){
            if(c.getNumber().equalsIgnoreCase(phoneNumber)){
                phoneNumber=c.getFname();
            }
        }
        System.out.println("Calling "+phoneNumber);
    }
    public void endCall(){
        System.out.println("Call ended");
    }
    public void addContact(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String fname = scn.next();
        System.out.println("Enter Last Name: ");
        String lname = scn.next();
        System.out.println("Enter Phone Number: ");
        String number = scn.next();
        Contact a = new Contact(fname,lname,number);
        contacts.add(a);
    }
    public void searchContact(String number){

        for(Contact c: contacts){
            if(c.getNumber().equalsIgnoreCase(number)){
                System.out.println("Contact found!");
            }
            else{
                System.out.println("Contact not found");
            }
        }
    }
    public void viewContacts(){
        if(contacts.isEmpty()){
            System.out.println("No Contacts");
        }
        for(Contact s: contacts){
            System.out.println(s.getFname() +" "+s.getLname()+" "+s.getNumber());
        }
    }
    public void deleteContact(String ID){
        int index=0;
        int i=0; //counter
        boolean found = false;
        for(Contact c: contacts){
            if(ID.equalsIgnoreCase(c.getNumber())){
               index=i;
               found =true;
            }
        }
        if (found){
        contacts.remove(index);
        }
    }
}
