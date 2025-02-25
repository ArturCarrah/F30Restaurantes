package F30Restaurantes.cozinha;

import F30Restaurantes.Restaurante;
import F30Restaurantes.atendimento.Cardapio;
import F30Restaurantes.excecoes.CozinheiroIndisponivelException;
import F30Restaurantes.excecoes.ParametroNegativoException;

public class CozinheiroEspecial extends Cozinheiro {
    private int especialidade;

    public CozinheiroEspecial(String nome, int habilidade, int funcaoNumero, boolean ehChefe, int especialidade) throws ParametroNegativoException {
        super(nome, habilidade, funcaoNumero, ehChefe);
        if (especialidade < 0) {
            throw new ParametroNegativoException("A especialidade do cozinheiro não pode ser negativa.");
        }
        this.especialidade = especialidade;
        this.salario = calcularSalario();
    }

    public void prepararPedidoEspecial(Cardapio pedido) throws CozinheiroIndisponivelException {
        if (!preparandoPedido) {
            preparandoPedido = true; // Marca o cozinheiro como ocupado
            Restaurante.getCozinha().getPedidosSendoPreparados().add(pedido); // Adiciona o pedido à lista de pedidos sendo preparados
            preparandoPedido = false; // Marca o cozinheiro como disponível novamente
        } else {
            throw new CozinheiroIndisponivelException("O cozinheiro especial não está disponível.");
        }
    }

    @Override
    public double calcularSalario() {
        double bonusEspecialidade = especialidade * 75.0; // Bônus adicional por especialidade
        return super.calcularSalario() + bonusEspecialidade;
    }

    // Getters e Setters
    public int getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(int especialidade) {
        this.especialidade = especialidade;
    }
}