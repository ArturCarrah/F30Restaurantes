package trabalhotrinta;

public abstract class Funcionarios {
    protected String name;
    protected double salary;
    private static int employersCounter = 0;

    public Funcionarios(String name, double salary) {
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
    
    public abstract void showInfo();
    //cada subclasse implementa por meio de um @Override 
}
