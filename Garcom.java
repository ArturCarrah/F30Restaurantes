package trabalhotrinta;

public class Garcom extends Funcionario{
    
    
    protected int mesasServidas;

    
    public Garcom(String nome, double salario) {
        super(nome, salario);
    }

    
    @Override
    public double calcularSalario() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    //here we search for a dish using its code to scroll through the list of dishes
    public void fazerPedido(int pratoCodigo){
        for (Cardapio prato : Cardapio.values()) {
            if (prato.getPratoCodigo() == pratoCodigo) {
                //we must elaborate the logic: take the dish and send to kitchen
            }
        }
        System.out.println("Código inválido!! Não há prato com esse código");
    }
    
}
