package trabalhotrinta.atendimento;

public enum Cardapio {
    ARROZ("Arroz", 10.0, 1),
    BATATA_FRITA("Batata Frita", 15.0, 2), 
    PIZZA("Pizza", 30.0, 3),
    COCA_COLA("Coca-Cola", 5.0, 4);

    // Atributos
    private final String pratoNome;
    private final double precoPrato;
    private final int pratoCodigo;

    
    //construtor
    Cardapio(String pratoNome, double precoPrato, int pratoCodigo) {
        this.pratoNome = pratoNome;
        this.precoPrato = precoPrato;
        this.pratoCodigo = pratoCodigo;
    }

    
    //útil para quando um prato for pedido, enviar o preço dele para a conta, fazendo assim a soma do que foi pedido ao total da mesa
    public double getPratoPreco() {
        return precoPrato;
    }

    
    //útil para quando um determinado prato for pedido, enviar o código dele para a cozinha para que esta manipule da forma que for necessário
    public int getPratoCodigo() {
        return pratoCodigo;
    }

    
    public String getPratoNome() {
        return pratoNome;
    }
    
    
    //coloquei caso queira percorrer a lista de pratos
    public static Cardapio mostrarPrato(int pratoCodigo) {
        for (Cardapio prato : Cardapio.values()) {
            if (prato.getPratoCodigo() == pratoCodigo) {
                System.out.println("Prato: " + prato.getPratoNome());
                System.out.println("Preço: " + prato.getPratoPreco());
            }
        }
        return null; // Prato não encontrado
    }
}
