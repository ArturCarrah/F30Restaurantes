package trabalhotrinta;

public enum Cardapio {
    ARROZ(10.0), 
    BATATA_FRITA(15.0), 
    PIZZA(30.0), 
    COCA_COLA(8.0);

    private double price;

    Cardapio(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
