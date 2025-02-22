package F30Restaurantes.cozinha;


public class CozinheiroEspecial extends Cozinheiro {
    private int especialidade;

    public CozinheiroEspecial(String nome, int habilidade, boolean ehChefe, int especialidade) {
        super(nome, habilidade, ehChefe);
        this.especialidade = especialidade;
    }

    @Override
    public double calcularSalario() {
        // Exemplo: cada nível de especialidade dá R$75 extras
        double bonusEspecialidade = especialidade * 75.0;
        return super.calcularSalario() + bonusEspecialidade;
    }

    public void prepararPedidoEspecial(int codigoPrato) {

    }

    public int getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(int especialidade) {
        this.especialidade = especialidade;
    }
}