package atendimento;
        
public interface Pedido {
    //private int orderNumber;
    //private Cardapio plate;
    
    //ver de automatizar esse input do pedido -> só fazer ele iterar automaticamente qnd for usar 
    public Pedido(int orderNumber, Cardapio plate) {
        this.orderNumber = orderNumber;
        this.plate = plate;
    }

    public Pedido fazerPedido();

    public double getPreco() {
        return plate.getPrice();  // O preço vem direto do enum
    }

    public Cardapio getItem() {
        return plate;
    }

    public int getCodigo() {
        return codigo;
    }

    public void exibirPedido() {
        System.out.println("Pedido #" + orderNumber);
        System.out.println("Prato: " + plate);
        System.out.println("Preço: R$" + plate.getPrice());
    }
}
