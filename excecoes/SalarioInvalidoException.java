package F30Restaurantes.excecoes;

public class SalarioInvalidoException extends RuntimeException {
  public SalarioInvalidoException(String message) {
    super(message);
  }
}
