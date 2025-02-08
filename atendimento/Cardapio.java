package atendimento;

public enum Cardapio {
    ARROZ(10.0, 1), 
    BATATA_FRITA(15.0, 2), // Caralho batatinha é realmente 15 conto?
    PIZZA(30.0, 3), 
    COCA_COLA(5.0, 4);

    // atributos
    private double preco;
    private int codigo;

    // construtor do enum
    Cardapio(double preco, int codigo) {
        this.preco = preco;
        this.codigo = codigo;
    }

    
    public double getPreco() {
        return preco;
    }

    
    public int getCodigo() {
        return codigo;
    }

    // coloquei caso queira percorrer a lista de pratos
    /*
    public static Cardapio getPlate(int codigo) {
        for (Cardapio plate : Cardapio.values()) {
            if (plate.getcodigo() == codigo) {
                return plate;
            }
        }
        return null; // Prato não encontrado
    }
    */
}
