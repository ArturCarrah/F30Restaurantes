package F30Restaurantes.cozinha;

import F30Restaurantes.atendimento.Pedido;
import F30Restaurantes.funcionario.Funcionario;

public class Cozinheiro extends Funcionario {
    protected int habilidade;
    protected boolean preparandoPedido;
    protected boolean ehChefe;

    public void prepararPedido(Pedido pedido){
        preparandoPedido = true;
    }

    @Override
    public double calcularSalario() {
        double bonusHabilidade = habilidade * 50.0; // Exemplo: cada nível de habilidade adiciona R$50
        // Se for chefe, recebe um bônus fixo
        double bonusChefe;
        if (ehChefe) {
            bonusChefe = 500.0;
        } else {
            bonusChefe = 0.0;
        }

        return salario + bonusHabilidade + bonusChefe;
    }

    public Cozinheiro(String nome, double salario, int habilidade, boolean preparandoPedido, boolean ehChefe){
        super(nome, salario);
        this.habilidade = habilidade;
        this.preparandoPedido = preparandoPedido;
        this.ehChefe = ehChefe;
    }
    public int getHabilidade() {
        return this.habilidade;
    }
    public void setHabilidade(int habilidade) {
        this.habilidade = habilidade;
    }
    public boolean getPreparandoPedido() {
        return this.preparandoPedido;
    }
    public void setPreparandoPedido(boolean preparandoPedido) {
        this.preparandoPedido = preparandoPedido;
    }
    public boolean getChefe() {
        return this.ehChefe;
    }
    public void setChefe(boolean chefe) {
        this.ehChefe = ehChefe;
    }
}