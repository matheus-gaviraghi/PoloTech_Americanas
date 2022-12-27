package aula3_Herança_CodigosProfessor;
import java.time.LocalDateTime;

public class CarroJaEstaParadoException extends Exception {

    private LocalDateTime horaDoErro;
    public CarroJaEstaParadoException(String mensagem) {
        super(mensagem);
    }
}