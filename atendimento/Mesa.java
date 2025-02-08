package atendimento;

public class Mesa implements Pedido{
    private double totalGasto;
    private int numeroMesa;
    private boolean isOcupada;
    
    
    public Mesa(int numeroMesa, boolean isOcupada) {
        this.numeroMesa = numeroMesa;
        this.isOcupada = isOcupada; 
        this.totalGasto = 0;
    }
    

    public void fazerPedido(Pedido pedido){
        
    }

    public int getNumeroMesa(){
        return this.numeroMesa;
    }
    
    //retorna o quanto deve ser pago e "limpa" a mesa
    public double pagarConta(double totalGasto) {
        System.out.println("O total pago pela mesa " + this.getNumeroMesa() + " foi:"  + totalGasto);
        totalGasto = 0;
        isOcupada = false;
        return 0;
    }
}
