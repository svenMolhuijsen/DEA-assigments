package nl.han.ica.oose;

public class EmployeeDB implements Employee {

    private String id;
    private String lastName;
    private String firstName;
    private String email;

    public EmployeeDB(String id, String lastName, String firstName, String email) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public String getFirstNAme() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
