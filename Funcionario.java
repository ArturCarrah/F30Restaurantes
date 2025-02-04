package trabalhotrinta;

public class Funcionarios {
    protected String name;
    protected double salary;
    protected String turn;
    private static int employersCounter = 0;

    public Funcionarios(String name, double salary, String turn) {
        this.name = name;
        this.salary = salary;
        this.turn = turn;
        employersCounter++;
    }

    public static int getEmployersCounter() {
        return employersCounter;
    }
    
    public void setSalary (double salary) {
        this.salary = salary;
    }
    
    public void setTurn (String turn) {
        this.turn = turn;
    }
    
    public void showInfo() {
        System.out.println("Nome: " + name);
        System.out.println("Salário: R$" + salary);
        System.out.println("Turno: " + turn);
    }
}
