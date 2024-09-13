package br.com.mtanuri.ada.t1172.poo2.aula2.user;

public class DadosUsuarioInvalidosException extends Exception{
    public DadosUsuarioInvalidosException() {
    }

    public DadosUsuarioInvalidosException(String message) {
        super(message);
    }

    public DadosUsuarioInvalidosException(String message, Throwable cause) {
        super(message, cause);
    }

    public DadosUsuarioInvalidosException(Throwable cause) {
        super(cause);
    }

    public DadosUsuarioInvalidosException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
