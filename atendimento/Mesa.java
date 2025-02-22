package F30Restaurantes.atendimento;

public class Mesa implements Pedido{
    private double totalGasto;
    private int numeroMesa;
    private boolean isOcupada;
    
    // TO DO: implementar os métodos abstratos da interface Pedido

    public Mesa(int numeroMesa, boolean isOcupada) {
        this.numeroMesa = numeroMesa;
        this.isOcupada = isOcupada; 
        this.totalGasto = 0;
    }
    

    public void listarCardapio(){
        System.out.println("Peça ao garçom o prato pelo nome ou pelo código!");
        System.out.println("\n========CARDÁPIO RESTAURANTE F30=========\n");
        System.out.println("Código");
        for(Cardapio prato : Cardapio.values()){
            System.out.println(prato.getCodigo() + " ....... " + prato.name() + " " + prato.getPreco() + "R$");
        }
    }
    

    public void fazerPedido(Cardapio prato){
        if(this.isOcupada == false){
            this.isOcupada = true;
            // Se o pedido foi feito, então alguém está ocupando a mesa
        }
        this.totalGasto = this.totalGasto + prato.getPreco();

        // TO DO: Implementar um jeito de passar o prato pro garçom
        // O pedido tem que ir Mesa -> Garçom -> Cozinha

    }


    public int getNumeroMesa(){
        return this.numeroMesa;
    }
    
    // retorna o quanto deve ser pago e "limpa" a mesa
    public void pagarConta(double totalGasto) {
        System.out.println("O total pago pela mesa " + this.getNumeroMesa() + " foi:"  + totalGasto + "R$");
        totalGasto = 0;
        this.isOcupada = false;
    }
    
    @Override
    public double getPreco(Cardapio prato) {
        return prato.getPratoPreco();
    }

    @Override
    public Cardapio consultarPrato(Cardapio prato) {
        return prato.mostrarPrato(prato.getPratoCodigo());
    }

    @Override
    public int getCodigo(Cardapio prato) {
        return prato.getPratoCodigo();
    }
}
