package trabalhotrinta;

public abstract class Funcionario {
    protected String name;
    protected double salary;
    private static int employersCounter = 0;

    //criar tratamento para fornecimento de parâmetros inválidos
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

    //preferir a formatação toString
    public abstract void showInfo();
    //cada subclasse implementa por meio de um @Override 
}
