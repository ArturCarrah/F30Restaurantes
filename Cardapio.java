package trabalhotrinta;

public enum Cardapio {
    ARROZ(10.0, 1), 
    BATATA_FRITA(15.0, 2), 
    PIZZA(30.0, 3), 
    COCA_COLA(5.0, 4);

    //atributos
    private double price;
    private int plateNumber;

    //construtor
    Cardapio(double price, int plateNumber) {
        this.price = price;
        this.plateNumber = plateNumber;
    }

    //útil para quando um prato for pedido, enviar o preço dele para a conta, fazendo assim a soma do que foi pedido ao total da mesa
    public double getPrice() {
        return price;
    }

    //útil para quando um determinado prato for pedido, enviar o código dele para a cozinha para que esta manipule da forma que for necessário
    public int getPlateNumber() {
        return plateNumber;
    }

    //coloquei caso queira percorrer a lista de pratos
    public static Cardapio getPlate(int plateNumber) {
        for (Cardapio plate : Cardapio.values()) {
            if (plate.getPlateNumber == plateNumber) {
                return plate;
            }
        }
        return null; // Prato não encontrado
    }
}
}
