package funcionario;

public abstract class Funcionario {
    protected String nome;
    protected double salario;
    private static int quantidadeFuncionarios = 0;

    //criar tratamento para fornecimento de parâmetros inválidos
    public Funcionario (String nome, double salario) {
        //if nome == "" || salario <= 0 throw new ParametroInvalidoException
        this.nome = nome;
        this.salario = salario;
        quantidadeFuncionarios++;
    }

    public static int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }
    
    public void setSalario (double salario) {
        this.salario = salario;
    }

    public double getSalario(){
        return this.salario;
    }

    public String getNome(){
        return this.nome;
    }

    //preferir a formatação toString
    public abstract void showInfo();
    //cada subclasse implementa por meio de um @Override 
}
