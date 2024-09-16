package br.com.mtanuri.ada.t1172.poo2.aula2.user;

import java.util.Locale;
import java.util.ResourceBundle;

public class DadosUsuarioInvalidosException extends Exception {

    private final String messageKey;

    public DadosUsuarioInvalidosException(String messageKey) {
        super(messageKey);
        this.messageKey = messageKey;
    }

    public String getLocalizedMessage(Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("ValidationMessages", locale);
        return bundle.getString(messageKey);
    }

    public String getLocalizedMessage() {
        ResourceBundle bundle = ResourceBundle.getBundle("ValidationMessages", Locale.of("pt", "BR"));
        return bundle.getString(messageKey);
    }

}
