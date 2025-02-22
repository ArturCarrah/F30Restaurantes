package F30Restaurantes.funcionario;

public abstract class Funcionario {

    protected final String nome;
    protected double salario;
    private static int contadorFuncionarios = 0;

    
    public Funcionario(String nome, double salario) {
        if (salario < 1500) {
            throw new IllegalArgumentException("O salário não pode ser menos que um salário mínimo.");
        }
        else{
        this.nome = nome;
        this.salario = salario;
        contadorFuncionarios++; //Toda vez que o construtor for acionado corretamente a quantidade de funcionários
                                //vai aumentar em 1
        }
    }

    public static int getContadorFuncionarios() {
        return contadorFuncionarios;
    }

    public void setSalario(double salario) {
        if (salario < 1500) {
            throw new IllegalArgumentException("O salário não pode ser menos que um salário mínimo.");
        }
        else{
        this.salario = salario;
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nSalario: " + salario;
    }

    //Cada classe vai implementar seu próprio método de calcular o salário.
    public abstract double calcularSalario();
}