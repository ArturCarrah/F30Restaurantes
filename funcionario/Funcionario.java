package F30Restaurantes.funcionario;

import F30Restaurantes.excecoes.NomeInvalidoException;
import F30Restaurantes.excecoes.SalarioInvalidoException;

public abstract class Funcionario {
    protected final String nome;
    protected double salario;
    private static int contadorFuncionarios = 0;

    public Funcionario(String nome, double salario) {
        if (nome == null || nome.trim().isEmpty() ) {
            throw new NomeInvalidoException("O nome do funcionário não pode ser vazio ou nulo.");
        }
        if (salario < 0) {
            throw new SalarioInvalidoException("O salário não pode ser menos que um salário mínimo.");
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
            throw new SalarioInvalidoException("O salário não pode ser menos que um salário mínimo.");
        }
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nSalario: " + salario;
    }

    public abstract double calcularSalario();
}
