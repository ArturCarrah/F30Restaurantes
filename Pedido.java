package trabalhotrinta;
        
public class Pedido {
    
    private int orderNumber = 0;
    private Cardapio dish;
    
    public Pedido(Cardapio dish) {
        orderNumber++;
        this.orderNumber = orderNumber;
        this.dish = dish;
    }

    //abre brecha para o cliente perguntar o preço
    public double getOrderPrice() {
        return dish.getDishPrice();
    }

    //
    public Cardapio getItem() {
        return dish;
    }

    //da p pensar em algo na cozinha que siga a ordem de preferencia baseado nisso aq
    public int getOrderNumber() {
        return orderNumber;
    }

    public void shorOrder() {
        System.out.println("Pedido #" + orderNumber);
        System.out.println("Prato: " + dish);
        System.out.println("Preço: R$" + dish.getDishPrice());
    }
}
