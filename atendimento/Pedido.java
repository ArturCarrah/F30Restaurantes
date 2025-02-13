package trabalhotrinta.atendimento;

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

    public void apresentarPedido() {
        System.out.println("Pedido #" + numeroPedido);
        System.out.println("Prato: " + prato);
        System.out.println("Preço: R$" + prato.getPratoPedido());
    }
}
