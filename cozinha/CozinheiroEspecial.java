package F30Restaurantes.cozinha;

import F30Restaurantes.atendimento.Pedido;

public class CozinheiroEspecial extends Cozinheiro {
    private int especialidade;

    public CozinheiroEspecial(String nome, double salario, int habilidade, boolean preparandoPedido , boolean ehChefe, int especialidade) {
        super(nome, salario, habilidade, preparandoPedido, ehChefe);
        this.especialidade = especialidade;
    }

    @Override
    public double calcularSalario() {
        // Exemplo: cada nível de especialidade dá R$75 extras
        double bonusEspecialidade = especialidade * 75.0;
        return super.calcularSalario() + bonusEspecialidade;
    }

    public void prepararPedidoEspecial(Pedido pedidoEspecial) {

    }

    public int getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(int especialidade) {
        this.especialidade = especialidade;
    }
}