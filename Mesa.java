package trabalhotrinta;

public class Mesa {
    protected double totalSpent;
    protected int tableNumber = 0;
    protected boolean isOcuppied;
    
    public Mesa (double totalSpent, boolean isOcuppied) {
        tableNumber++;
        this.tableNumber = tableNumber;
        this.totalSpent = totalSpent;
        this.isOcuppied = isOcuppied;
    }
    
    //
    public void setOrder(Pedido pedido){
        
    }
    
    //retorna o quanto deve ser pago e "limpa" a mesa
    public double payBill(double totalSpent) {
        System.out.println("O total a ser pago é: " + totalSpent);
        totalSpent = 0;
        isOcuppied = false;
        return 0;
    }
}
