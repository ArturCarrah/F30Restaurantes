package trabalhotrinta;

public class Mesa {
    protected double totalGasto;
    protected int numeroMesa = 0;
    protected boolean estaOcupada;
    
    public Mesa (double totalGasto, boolean estaOcupada) {
        numeroMesa++;
        this.numeroMesa = numeroMesa;
        this.totalGastot = totalGasto;
        this.estaOcupada = estaOcupada;
    }
    
    //
    public void setPedido(Pedido pedido){
        
    }
    
    //retorna o quanto deve ser pago e "limpa" a mesa
    public double realizarPagamento(double totaGasto) {
        System.out.println("O total a ser pago é: " + totalGasto);
        totalGasto = 0;
        estaOcupado = false;
        return 0;
    }
}
