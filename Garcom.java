package atendimento;

import F30Restaurante.Restaurante;
import excecoes.*;
import funcionario.Funcionario;

public class Garcom extends Funcionario implements Pedido {
    private int mesasServidas;
    private static final double SALARIO_BASE_GARCOM = 2000.0;
    private static final double BONUS_POR_MESA = 10.0;

    public Garcom(String nome) throws NomeInvalidoException, SalarioInvalidoException {
        super(nome, SALARIO_BASE_GARCOM, 1); // Salário base do garçom
        this.mesasServidas = 0;
        Restaurante.getListaGarcoms().add(this);
    }

    @Override
    public double calcularSalario() {
        return SALARIO_BASE_GARCOM + (mesasServidas * BONUS_POR_MESA);
    }

    public void fazerPedido(Cardapio pratoSolicitado) throws PedidoInvalidoException {
    if (pratoSolicitado == null) {
        throw new PedidoInvalidoException("Pedido inválido! O prato solicitado não pode ser nulo.");
    }

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