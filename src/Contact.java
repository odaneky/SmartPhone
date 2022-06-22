public class Contact {
    private String Fname;
    private String Lname;
    private String Number;

    public Contact(String fname, String lname, String number) {
        Fname = fname;
        Lname = lname;
        Number = number;
    }
    public Contact(Contact con){
        Fname = con.getFname();
        Lname = con.getLname();
        Number = con.getNumber();
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }
}
