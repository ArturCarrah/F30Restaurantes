package F30Restaurantes.cozinha;

import F30Restaurantes.Restaurante;
import F30Restaurantes.atendimento.Cardapio;
import F30Restaurantes.excecoes.CozinheiroIndisponivelException;
import F30Restaurantes.funcionario.Funcionario;

public class Cozinheiro extends Funcionario {
    protected int habilidade;
    protected boolean preparandoPedido;
    protected boolean ehChefe;
    protected double bonusHabilidade = habilidade * 50.0; // Cada nível de habilidade adiciona R$50 ao salário
    protected double bonusChefe = ehChefe ? 500.0 : 0.0; // Bônus adicional se for chefe
    protected static final double SALARIO_BASE_COZINHEIRO = 3000.0;

    public Cozinheiro(String nome, int habilidade, int funcaoNumero, boolean ehChefe) {
        super(nome, 0, 2); // Salário será calculado com base nas habilidades
        this.habilidade = habilidade;
        this.preparandoPedido = false; // Inicialmente, o cozinheiro não está preparando nenhum pedido
        this.ehChefe = ehChefe;
        this.salario = calcularSalario();
        Restaurante.getCozinha().getCozinheiros().add(this);
    }

    public void prepararPedido(Cardapio pedido) throws CozinheiroIndisponivelException {
        if (!preparandoPedido) {
            setPreparandoPedido(true); // Marca o cozinheiro como ocupado
            Restaurante.getCozinha().getPedidosSendoPreparados().add(pedido); // Adiciona o pedido à lista de pedidos sendo preparados
            setPreparandoPedido(false); // Marca o cozinheiro como disponível novamente
        } else {
            throw new CozinheiroIndisponivelException("O cozinheiro não está disponível.");
        }
    }

    @Override
    public double calcularSalario() {
        return SALARIO_BASE_COZINHEIRO + bonusHabilidade + bonusChefe;
    }

    // Getters e Setters
    public int getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(int habilidade) {
        this.habilidade = habilidade;
    }

    public boolean getPreparandoPedido() {
        return preparandoPedido;
    }

    public void setPreparandoPedido(boolean preparandoPedido) {
        this.preparandoPedido = preparandoPedido;
    }

    public boolean getChefe() {
        return ehChefe;
    }

    public void setChefe(boolean ehChefe) {
        this.ehChefe = ehChefe;
    }
}