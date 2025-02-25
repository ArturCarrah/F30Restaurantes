package F30Restaurantes.excecoes;

public class ParametroNegativoException extends RuntimeException {
    public ParametroNegativoException(String message) {
        super(message);
    }
}