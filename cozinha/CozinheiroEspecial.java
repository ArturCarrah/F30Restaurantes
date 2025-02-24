package F30Restaurantes.cozinha;

import F30Restaurantes.Restaurante;
import F30Restaurantes.atendimento.Cardapio;
import F30Restaurantes.excecoes.NomeInvalidoException;
import F30Restaurantes.excecoes.ParametroNegativoException;

public class CozinheiroEspecial extends Cozinheiro {
    private int especialidade;

    public CozinheiroEspecial(String nome, int habilidade, boolean ehChefe, int especialidade) throws ParametroNegativoException {
        super(nome, habilidade, ehChefe);
        if(especialidade < 0){
            throw new ParametroNegativoException("A Especialidade do cozinheiro não pode ser negativa.");
        }
        this.especialidade = especialidade;
        this.salario = calcularSalario();
    }

    @Override
    public double calcularSalario() {
        double bonusEspecialidade = especialidade * 75.0;
        return super.calcularSalario() + bonusEspecialidade;
    }

    public void prepararPedidoEspecial(Cardapio pedido) {
        preparandoPedido = true;
        Restaurante.getCozinha().getPedidosSendoPreparados().add(pedido);
    }

    public int getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(int especialidade) {
        this.especialidade = especialidade;
    }
}
