package trabalhotrinta;

public abstract class Funcionario {
    
    
    //once you create an employer he can't change his name -> fuck LGBT people
    protected final String name;
    protected double salary;
    private static int employersCounter = 0;

    
    //create treatment for supplying invalid parameters
    public Funcionario (String name, double salary) {
        this.name = name;
        this.salary = salary;
        employersCounter++;
    }

    
    public static int getEmployersCounter() {
        return employersCounter;
    }
    
    
    public void setSalary (double salary) {
        this.salary = salary;
    }

    //we use override to reuse the object class's toString method, instead of creating a showInfo() method
    @Override
    public String toString() {
        return "Name: " + name + "\nSalary: " + String.valueOf(salary);
    }


    //each subclass must define its own way of calculating salary based on the employer's role
    public abstract double calculateSalary();
}
