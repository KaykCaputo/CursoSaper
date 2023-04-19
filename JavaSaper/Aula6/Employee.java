package Aula6;

public class Employee {
    private String firstName, lastName;
    private double salary;

    public  Employee(String _firstName, String _lastName, double _salary){
        if(_firstName!=null && _lastName!=null && _salary>=0){
            this.firstName = _firstName;
            this.lastName = _lastName;
            this.salary = _salary;
        }
        else{
            this.salary=0;
        }
    }

    public void setFirstName(String _firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String _lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }
}
