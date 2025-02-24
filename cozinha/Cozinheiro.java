package F30Restaurantes.cozinha;

import F30Restaurantes.Restaurante;
import F30Restaurantes.atendimento.Cardapio;
import F30Restaurantes.funcionario.Funcionario;
import F30Restaurantes.excecoes.NomeInvalidoException;
import F30Restaurantes.excecoes.CozinheiroIndisponivelException;

public class Cozinheiro extends Funcionario {
    protected int habilidade;
    protected boolean preparandoPedido;
    protected boolean ehChefe;
    protected static final double SALARIO_BASE_COZINHEIRO = 3000.0;

    public Cozinheiro(String nome, int habilidade, boolean ehChefe) {
        super(nome, 0);     //O salário do cozinheiro vai ser calculado com base nas suas habilidades
        this.habilidade = habilidade;
        this.preparandoPedido = false;  //Ao se criar o cozinheiro ele não está preparando nenhum pedido, afinal, acabou de chegar
        this.ehChefe = ehChefe;
        this.salario = calcularSalario();
    }

    public void prepararPedido(Cardapio pedido) {
        if(preparandoPedido == false) {
            setPreparandoPedido(true);
            Restaurante.getCozinha().getPedidosSendoPreparados().add(pedido);
            setPreparandoPedido(false);
        }
        else{
            throw new CozinheiroIndisponivelException("O cozinheiro não está disponível");
        }

    }

    @Override
    public double calcularSalario() {
        double bonusHabilidade = habilidade * 50.0;
        double bonusChefe = ehChefe ? 500.0 : 0.0;
        return SALARIO_BASE_COZINHEIRO + bonusHabilidade + bonusChefe;
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
        this.ehChefe = chefe;
    }
}
