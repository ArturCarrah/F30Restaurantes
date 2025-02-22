public abstract class Funcionario {

    protected final String nome;
    protected double salario;
    private static int contadorFuncionarios = 0;

    public Funcionario(String nome, double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("O salário não pode ser negativo.");
        }
        this.nome = nome;
        this.salario = salario;
        contadorFuncionarios++;
    }

    public static int getContadorFuncionarios() {
        return contadorFuncionarios;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("O salário não pode ser negativo.");
        }
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nSalario: " + salario;
    }

    //Cada classe vai implementar seu próprio método de calcular o salário.
    public abstract double calcularSalario();
}