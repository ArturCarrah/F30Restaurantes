package F30Restaurantes.excecoes;

import F30Restaurantes.Restaurante;
import F30Restaurantes.atendimento.Garcom;
import F30Restaurantes.cozinha.Cozinheiro;
import F30Restaurantes.cozinha.CozinheiroEspecial;

public class ValidarFuncionario {
    public void validarFuncionarios(Restaurante restaurante) {
        for (Garcom garcom : restaurante.getListaGarcons()) {
            if (garcom.getNome() == null || garcom.getNome().isEmpty()) {
                throw new NomeInvalidoException("Nome inválido para o garçom.");
            }
            if (garcom.calcularSalario() < 0) {
                throw new SalarioInvalidoException("Salário inválido para o garçom: " + garcom.getNome());
            }
        }

        for (Cozinheiro cozinheiro : restaurante.getCozinha().getCozinheiros()) {
            if (cozinheiro.getNome() == null || cozinheiro.getNome().trim().isEmpty()) {
                throw new NomeInvalidoException("Nome inválido para o cozinheiro.");
            }
            if (cozinheiro.calcularSalario() < 0) {
                throw new SalarioInvalidoException("Salário inválido para o cozinheiro: " + cozinheiro.getNome());
            }
            if (cozinheiro.getHabilidade() < 0) {
                throw new ParametroNegativoException("Habilidade inválida para o cozinheiro: " + cozinheiro.getNome());
            }

            if(cozinheiro instanceof CozinheiroEspecial){
                if (((CozinheiroEspecial)cozinheiro).getEspecialidade() < 0) {
                    throw new ParametroNegativoException("Especialidade inválida para o cozinheiro especial: " + cozinheiro.getNome());
                }
            }

        }
    }
}
