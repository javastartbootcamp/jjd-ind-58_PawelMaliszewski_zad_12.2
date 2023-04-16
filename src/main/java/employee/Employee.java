package employee;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String pesel;
    private double wages;

    public Employee(String firstName, String lastName, String pesel, double wages) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.wages = wages;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel='" + pesel + '\'' +
                ", department='" + getClass().getSimpleName() + '\'' +
                ", wages=" + wages +
                '}';
    }
}
