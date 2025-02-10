package trabalhotrinta;

public abstract class Funcionario {

    protected final String nome;
    protected double salario;
    private static int contadorFuncionarios = 0;

    
    //create treatment for supplying invalid parameters
    public Funcionario (String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        contadorFuncionarios;
    }

    
    public static int getContadorFuncionarios() {

        return contadorFuncionarios;
    }
    
    
    public void setSalario(double salario) {
        this.salario = salario;
    }

    //we use override to reuse the object class's toString method, instead of creating a showInfo() method
    @Override
    public String toString() {
        return "Nome: " + nome + "\nSalario: " + String.valueOf(salario);
    }


    //each subclass must define its own way of calculating salary based on the employer's role
    public abstract double calcularSalario();
}
