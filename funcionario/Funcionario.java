package F30Restaurantes.funcionario;

import F30Restaurantes.excecoes.NomeInvalidoException;
import F30Restaurantes.excecoes.SalarioInvalidoException;

public abstract class Funcionario {
    protected final String nome;
    protected double salario;
    private static int contadorFuncionarios = 0;

    public Funcionario(String nome, double salario) throws NomeInvalidoException, SalarioInvalidoException {
        if (nome == null || nome.trim().isEmpty() ) {
            throw new NomeInvalidoException("O nome do funcionário não pode ser vazio ou nulo.");
        }
        if (salario < 0) {
            throw new SalarioInvalidoException("O salário não pode ser menos que um salário mínimo.");
        }

        this.nome = nome;
        this.salario = salario;
        //Toda vez que o construtor for acionado corretamente a quantidade de funcionário, vai aumentar em 1
        contadorFuncionarios++;
    }

    public static int getContadorFuncionarios() {
        return contadorFuncionarios;
    }

    public void setSalario(double salario) throws SalarioInvalidoException {
        if (salario < 0) {
            throw new SalarioInvalidoException("O salário não pode ser menos que um salário mínimo.");
        }
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nSalario: " + salario;
    }

    //Cada classe vai implementar seu próprio método de calcular o salário.
    public abstract double calcularSalario();
}
