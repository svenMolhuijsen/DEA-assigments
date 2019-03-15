package nl.han.ica.oose;

public class EmployeeLdap {

    private String identifier;
    private String surname;
    private String givenname;
    private String mail;

    public EmployeeLdap(String identifier, String surname, String givenname, String mail) {
        this.identifier = identifier;
        this.surname = surname;
        this.givenname = givenname;
        this.mail = mail;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
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
