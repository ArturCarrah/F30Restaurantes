package trabalhotrinta;

public abstract class Funcionario {

    protected final String nome;
    protected double salario;
    private static int contadorFuncionarios = 0;


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

    @Override
    public String toString() {
        return "Nome: " + nome + "\nSalario: " + String.valueOf(salario);
    }


    public abstract double calcularSalario(){

    }
}
