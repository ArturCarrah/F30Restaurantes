package trabalhotrinta;
        
public class Pedido {
    
    private int numeroPedido = 0;
    private Cardapio prato;
    
    public Pedido(Cardapio prato) {
        numeroPedido++;
        this.numeroPedido = numeroPedido;
        this.prato = prato;
    }

    //abre brecha para o cliente perguntar o preço
    public double getPrecoPedido() {
        return prato.getPrecoPedido();
    }

    //
    public Cardapio getItem() {
        return prato;
    }

    //da p pensar em algo na cozinha que siga a ordem de preferencia baseado nisso aq
    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void shorOrder() {
        System.out.println("Pedido #" + orderNumber);
        System.out.println("Prato: " + dish);
        System.out.println("Preço: R$" + dish.getDishPrice());
    }
}
