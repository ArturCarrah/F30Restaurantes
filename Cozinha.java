package trabalhotrinta;

import java.util.ArrayList;
import java.util.List;

public class Cozinha {
    private List<Pedido> pedidosSendoPreparados;
    private List<Cozinheiro> cozinheiros;

    public Cozinha() {
        this.pedidosSendoPreparados = new ArrayList<>();
        this.cozinheiros = new ArrayList<>();
    }

    public List<Pedido> getPedidosSendoPreparados() {
        return pedidosSendoPreparados;
    }

    public List<Cozinheiro> getCozinheiros() {
        return cozinheiros;
    }
}