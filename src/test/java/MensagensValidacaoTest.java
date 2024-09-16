import br.com.mtanuri.ada.t1172.poo2.aula2.user.DadosUsuarioInvalidosException;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MensagensValidacaoTest {

    @Test
    public void deve_obter_mensagem_por_chave_de_acesso_mais_locale(){
        String mensagem = new DadosUsuarioInvalidosException("document.brazilian.invalid").getLocalizedMessage(Locale.of("pt", "BR"));
        assertEquals("O CPF é inválido.", mensagem);
    }
}
