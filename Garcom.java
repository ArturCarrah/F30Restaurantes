package trabalhotrinta;

public class Garcom extends Funcionario{
    
    
    protected int tablesServed;

    
    public Garcom(String name, double salary) {
        super(name, salary);
    }

    
    @Override
    public double calculateSalary() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    //here we search for a dish using its code to scroll through the list of dishes
    public void placeOrder(int dishCode){
        for (Cardapio plate : Cardapio.values()) {
            if (plate.getDishCode() == dishCode) {
                //we must elaborate the logic: take the dish and send to kitchen
            }
        }
        System.out.println("Código inválido!! Não há prato com esse código");
    }
    
}
