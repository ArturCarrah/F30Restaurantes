package trabalhotrinta;

public enum Cardapio {
    ARROZ(10.0, 1), 
    BATATA_FRITA(15.0, 2), 
    PIZZA(30.0, 3), 
    COCA_COLA(5.0, 4);

    //atributos
    private double precoPrato;
    private int pratoCodigo;

    //construtor
    Cardapio(double precoPrato, int pratoCodigo) {
        this.precoPrato = precoPrato;
        this.pratoCodigo = pratoCodigo;
    }

    //útil para quando um prato for pedido, enviar o preço dele para a conta, fazendo assim a soma do que foi pedido ao total da mesa
    public double getPrecoPrato() {
        return precoPrato;
    }

    //útil para quando um determinado prato for pedido, enviar o código dele para a cozinha para que esta manipule da forma que for necessário
    public int getPratoCodigo() {
        return pratoCodigo;
    }

    //coloquei caso queira percorrer a lista de pratos
    /*
    public static Cardapio getPlate(int plateCode) {
        for (Cardapio plate : Cardapio.values()) {
            if (plate.getPratoCodigo() == pratoCodigo) {
                return dish
            }
        }
        return null; // Prato não encontrado
    }
    */
}
