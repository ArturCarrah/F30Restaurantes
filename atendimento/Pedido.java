package F30Restaurantes.atendimento;

public interface Pedido {
    // Isso aqui não precisa pq já tá no enum
    //private int orderNumber;
    //private Cardapio plate;
    
    // Na interface vamos declarar apenas os esqueletos
    // dos métodos a serem implementados
    public Pedido fazerPedido();

    public double getPreco();

    public Cardapio consultarPrato();

    public int getCodigo();

    
}
