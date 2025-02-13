package trabalhotrinta;

public class CozinheiroEspecial extends Cozinheiro {
    private int especialidade;

    public CozinheiroEspecial(String nome, double salario, int habilidade, boolean ehChefe, int especialidade) {
        super(nome, salario, habilidade, preparandoPedido, ehChefe);
        this.especialidade = especialidade;
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

