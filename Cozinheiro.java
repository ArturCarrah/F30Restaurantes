package trabalhotrinta;

public class Cozinheiro extends Funcionario{
    protected int habilidade;
    protected boolean preparandoPedido;
    protected boolean chefe;

    public void prepararPedido(Pedido pedido){
        preparandoPedido = true;
    }

    @Override
    public double calcularSalario() {
        return 0;
    }

    public Cozinheiro(String name, double salario, int habilidade, boolean preparandoPedido, boolean chefe){
        super(name, salario);
        this.habilidade = habilidade;
        this.preparandoPedido = preparandoPedido;
        this.chefe = chefe;
    }
    public int getHabilidade() {
        return this.habilidade;
    }
    public void setHabilidade(int habilidade) {
        this.habilidade = habilidade;
    }
    public boolean getPreparandoPedido() {
        return this.preparandoPedido;
    }
    public void setPreparandoPedido(boolean preparandoPedido) {
        this.preparandoPedido = preparandoPedido;
    }
    public boolean getChefe() {
        return this.chefe;
    }
    public void setChefe(boolean chefe) {
        this.chefe = chefe;
    }
}
