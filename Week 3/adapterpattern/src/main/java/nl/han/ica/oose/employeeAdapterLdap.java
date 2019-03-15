package nl.han.ica.oose;

public class employeeAdapterLdap implements Employee {
    private EmployeeLdap instance;

    public employeeAdapterLdap(EmployeeLdap instance) {
        this.instance = instance;
    }

    @Override
    public String getID() {
        return instance.getIdentifier();
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
