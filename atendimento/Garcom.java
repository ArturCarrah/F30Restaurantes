package F30Restaurantes.atendimento;

import F30Restaurantes.funcionario.Funcionario;
import F30Restaurantes.Restaurante;
import F30Restaurantes.excecoes.NomeInvalidoException;
import F30Restaurantes.excecoes.PedidoInvalidoException;

public class Garcom extends Funcionario implements Pedido {
    private int mesasServidas;
    private static final double SALARIO_BASE_GARCOM = 2000.0;
    private static final double BONUS_POR_MESA = 10.0;

    public Garcom(String nome) {
        super(nome, 0);

        this.salario = SALARIO_BASE_GARCOM;
        this.mesasServidas = 0;
    }

    @Override
    public double calcularSalario() {
        return SALARIO_BASE_GARCOM + (mesasServidas * BONUS_POR_MESA);
    }

    public void fazerPedido(Cardapio pratoSolicitado) {
        boolean pedidoValido = false;

        for (Cardapio prato : Cardapio.values()) {
            if (pratoSolicitado.getCodigo() == prato.getCodigo()) {
                Restaurante.getCozinha().adicionarPedidoCozinha(pratoSolicitado);
                mesasServidas++;
                pedidoValido = true;
                break;
            }
        }

        if (!pedidoValido) {
            throw new PedidoInvalidoException("Código inválido! Não há prato com esse código.");
        }
    }
}
