package F30Restaurantes.cozinha;

import F30Restaurantes.atendimento.Cardapio;

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

    public void adicionarPedidoCozinha(Cardapio pedido){
        if(pedido.getEhEspecial() == true){
            for(Cozinheiro cozinheiro : getCozinheiros()){
                if(cozinheiro instanceof CozinheiroEspecial && cozinheiro.getPreparandoPedido() == false){
                    ((CozinheiroEspecial)cozinheiro).prepararPedidoEspecial(pedido);
                    break;
                }
            }
        }
        else{
        for(Cozinheiro cozinheiro : getCozinheiros()){
            if(cozinheiro.getPreparandoPedido() == false){
                cozinheiro.prepararPedido(pedido);
            }
            
        }

        }
    }

}