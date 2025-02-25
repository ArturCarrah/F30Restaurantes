package cozinha;

import atendimento.Cardapio;
import excecoes.CozinheiroIndisponivelException;

import java.util.ArrayList;
import java.util.List;

public class Cozinha {
    //PedidosSendoPrepados é um ArrayList de Pedido
    private List<Cardapio> pedidosSendoPreparados;
    //Cozinheiros é um ArrayList de Cozinheiro
    private List<Cozinheiro> cozinheiros;

    //Construtor
    public Cozinha() {
        this.pedidosSendoPreparados = new ArrayList<>();
        this.cozinheiros = new ArrayList<>();
    }

    //Getters
    public List<Cardapio> getPedidosSendoPreparados() {
        return pedidosSendoPreparados;
    }

    public List<Cozinheiro> getCozinheiros() {
        return cozinheiros;
    }

    public void adicionarPedidoCozinha(Cardapio pedido) {
    if (pedido.getEhEspecial()) {
        for (Cozinheiro cozinheiro : getCozinheiros()) {
            if (cozinheiro instanceof CozinheiroEspecial && !cozinheiro.getPreparandoPedido()) {
                ((CozinheiroEspecial) cozinheiro).prepararPedidoEspecial(pedido);
                return;
            }
        }
    } else {
        for (Cozinheiro cozinheiro : getCozinheiros()) {
            if (!cozinheiro.getPreparandoPedido()) {
                cozinheiro.prepararPedido(pedido);
                return;
            }
        }
    }
    throw new CozinheiroIndisponivelException("Nenhum cozinheiro disponível para preparar o pedido.");
}

}