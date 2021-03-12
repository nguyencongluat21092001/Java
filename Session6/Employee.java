package Session6;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstname,String lastName) {
        this.id = id;
        this.firstName = firstname;
        this.lastName = lastName;
    }

    public Employee(int id, String firstName, String lastName,int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLassName() {
        return lastName;
    }

    public String getName() {
        return getLassName() + getFirstName();
    }
    public int getSalary(){
        return salary;
    }
}
