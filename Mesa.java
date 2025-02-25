package atendimento;
import F30Restaurante.Restaurante;
import excecoes.PedidoInvalidoException;


import java.util.Collections;
import java.util.Random;

public class Mesa implements Pedido{
    private double totalGasto;
    private int numeroMesa;
    private boolean isOcupada;
    

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

    public Cardapio getPrato(Cardapio prato){
        return prato;
    }
    

    public void fazerPedido(Cardapio prato) {
        if (!this.isOcupada) {
            this.isOcupada = true;
        }

        this.totalGasto += prato.getPreco();

        // Verifica se há garçons disponíveis
        if (Restaurante.getListaGarcons().isEmpty()) {
            throw new IllegalStateException("Nenhum garçom disponível para atender a mesa.");
        }

        // Escolhe um garçom aleatório
        Random random = new Random();
        int indiceGarcom = random.nextInt(Restaurante.getListaGarcons().size());
        Garcom garcomAtendendo = Restaurante.getListaGarcons().get(indiceGarcom);

        // Garçom anota o pedido
        try {
            garcomAtendendo.fazerPedido(prato);
        } catch (PedidoInvalidoException e) {
            System.out.println("Erro ao fazer pedido: " + e.getMessage());
        }
    }


    public int getNumeroMesa(){
        return this.numeroMesa;
    }
    
    // retorna o quanto deve ser pago e "limpa" a mesa
    public void pagarConta(double totalGasto) {
        System.out.println("O total pago pela mesa " + this.getNumeroMesa() + " foi:"  + totalGasto + "R$");
        this.totalGasto = 0;
        this.isOcupada = false;
        Restaurante.setCaixaRestaurante(Restaurante.getCaixaRestaurante() + totalGasto);
    }

}