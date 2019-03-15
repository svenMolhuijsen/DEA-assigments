package nl.han.ica.oose;

public class EmployeeCSV{
    private int ID;
    private String surname;
    private String givenname;
    private String mail;

    public EmployeeCSV(int identifier, String surname, String givenname, String mail) {
        this.ID = ID;
        this.surname = surname;
        this.givenname = givenname;
        this.mail = mail;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGivenname() {
        return givenname;
    }

    public void setGivenname(String givenname) {
        this.givenname = givenname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

}
