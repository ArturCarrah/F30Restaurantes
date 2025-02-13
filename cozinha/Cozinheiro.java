package trabalhotrinta.cozinha;

import trabalhotrinta.atendimento.Pedido;
import trabalhotrinta.funcionario.Funcionario;

public class Cozinheiro extends Funcionario {
    protected int habilidade;
    protected boolean preparandoPedido;
    protected boolean ehChefe;

    public void prepararPedido(Pedido pedido){
        preparandoPedido = true;
    }

    @Override
    public double calcularSalario() {
        return 0;
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
