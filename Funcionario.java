package funcionario;

import excecoes.NomeInvalidoException;
import excecoes.SalarioInvalidoException;
import excecoes.FuncaoInvalidaException;

public abstract class Funcionario {
    protected final String nome;
    protected double salario;
    protected int funcaoNumero;
    protected String funcaoString;
    private static int contadorFuncionarios = 0;

    public Funcionario(String nome, double salario, int funcaoNumero) throws NomeInvalidoException, SalarioInvalidoException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new NomeInvalidoException("O nome do funcionário não pode ser vazio ou nulo.");
        }
        if (salario < 0) {
            throw new SalarioInvalidoException("O salário não pode ser negativo.");
        }
        if (funcaoNumero == 1) {
            this.funcaoString = "Garçom";
        } else if (funcaoNumero == 2) {
            this.funcaoString = "Cozinheiro";
        } else {
            throw new FuncaoInvalidaException("A função deve ser 1 (Garçom) ou 2 (Cozinheiro).");
        }

        this.nome = nome;
        this.salario = salario;
        this.funcaoNumero = funcaoNumero;
        //Toda vez que o construtor for acionado corretamente a quantidade de funcionário, vai aumentar em 1
        contadorFuncionarios++;
    }

    public static int getContadorFuncionarios() {
        return contadorFuncionarios;
    }

    public void setSalario(double salario) throws SalarioInvalidoException {
        if (salario < 0) {
            throw new SalarioInvalidoException("O salário não pode ser negativo.");
        }
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcaoString;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nFunção: " + funcaoString + "\nSalario: " + salario;
    }

    //Cada classe vai implementar seu próprio método de calcular o salário.
    public abstract double calcularSalario();
}
