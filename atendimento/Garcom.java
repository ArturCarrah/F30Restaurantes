package F30Restaurantes.atendimento;

import F30Restaurantes.funcionario.Funcionario;

public class Garcom extends Funcionario implements Pedido{
    
    
    protected int mesasServidas;

    
    public Garcom(String nome, double salario) {
        super(nome, salario);
    }

    
    public double calcularSalario() {
        //O Salário do garçom vai ser igual ao seu salário inicial mais um bonus por mesas servidas.
        double bonusPorMesa = 10.0;
        return salario + (mesasServidas * bonusPorMesa);
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

    
    @Override
    public double calculateSalary() {
        
    }

    
    //vai pegar um objeto do tipo cardapio e vai jogar pra cozinha, informando se é especial ou nn
    @Override
    public Pedido fazerPedido() {
        
    }

    
    @Override
    public double getPreco(Cardapio prato) {
        prato.getPratoPreco();
    }

    
    @Override
    public Cardapio consultarPrato(Cardapio prato) {
        prato.mostrarPrato(prato.getPratoCodigo());
    }

    
    public int getCodigo(Cardapio prato) {
        prato.getPratoCodigo();
    }
    
}
