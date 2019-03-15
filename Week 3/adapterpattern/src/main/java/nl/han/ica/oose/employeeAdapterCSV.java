package nl.han.ica.oose;

public class employeeAdapterCSV implements Employee{

    private EmployeeCSV instance;

    public employeeAdapterCSV(EmployeeCSV instance) {
        this.instance = instance;
    }

    @Override
    public String getID() {
        return instance.getID() +"";
    }

    @Override
    public String getFirstNAme() {
        return instance.getGivenname();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }
}
