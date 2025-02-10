package trabalhotrinta;

import java.util.ArrayList;
import java.util.List;

public class Cozinha {
    //PedidosSendoPrepados é um ArrayList de Pedido
    private List<Pedido> pedidosSendoPreparados;
    //Cozinheiros é um ArrayList de Pedido
    private List<Cozinheiro> cozinheiros;

    //Construtor
    public Cozinha() {
        this.pedidosSendoPreparados = new ArrayList<>();
        this.cozinheiros = new ArrayList<>();
    }

    //Getters
    public List<Pedido> getPedidosSendoPreparados() {
        return pedidosSendoPreparados;
    }

    public List<Cozinheiro> getCozinheiros() {
        return cozinheiros;
    }



}