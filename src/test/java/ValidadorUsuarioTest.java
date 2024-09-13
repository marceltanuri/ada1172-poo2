import br.com.mtanuri.ada.t1172.poo2.aula2.user.DadosUsuarioInvalidosException;
import br.com.mtanuri.ada.t1172.poo2.aula2.user.UsuarioDTO;
import br.com.mtanuri.ada.t1172.poo2.aula2.user.ValidadorUsuario;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ValidadorUsuarioTest {

    @Test
    public void test_cpf_invalido_se_usuario_brasileiro() {
        UsuarioDTO usuarioDTO = new UsuarioDTO.Builder()
                .nome("Carlos Souza")
                .dataNascimento(LocalDate.of(1985, 3, 10))
                .email("carlos.souza@gmail.com")
                .pais("Brasil")
                .documento("a123.456.789-00")  // CPF
                .telefone("+55 11 91234-5678")  // Telefone brasileiro
                .build();

        try {
            ValidadorUsuario.getInstance().validar(usuarioDTO);
            fail("Deveria ter lançado uma DadosUsuarioInvalidosException");
        } catch (DadosUsuarioInvalidosException ex) {
            assertEquals("O CPF é inválido.", ex.getMessage());
        }

        usuarioDTO = new UsuarioDTO.Builder()
                .nome("Isabella Rossi")
                .dataNascimento(LocalDate.of(1995, 2, 12))
                .email("isabella.rossi@libero.it")
                .pais("Itália")
                .documento("CF ROS12345L98")  // Documento fictício da Itália (Codice Fiscale)
                .telefone("+39 06 1234 5678")  // Telefone da Itália
                .build();

        try {
            ValidadorUsuario.getInstance().validar(usuarioDTO);
        } catch (DadosUsuarioInvalidosException ex) {
            fail("Não deveria ter lançado uma DadosUsuarioInvalidosException");
        }

    }

    @Test
    public void deve_ter_pelo_menos_um_nome_e_um_sobre_nome_com_no_minimo_uma_letra_cada_um() {
        UsuarioDTO usuarioDTO = new UsuarioDTO.Builder()
                .nome("Juan Carlos")
                .dataNascimento(LocalDate.of(1985, 11, 3))
                .email("juan.carlos@correo.com")
                .pais("Espanha")
                .documento("DNI 12345678X")  // Documento fictício da Espanha (DNI)
                .telefone("+34 91 123 4567")  // Telefone da Espanha
                .build();
        try {
            ValidadorUsuario.getInstance().validar(usuarioDTO);
        } catch (DadosUsuarioInvalidosException ex) {
            fail("Não deveria ter lançado uma DadosUsuarioInvalidosException");
        }

        usuarioDTO = new UsuarioDTO.Builder()
                .nome("Juan")
                .dataNascimento(LocalDate.of(1985, 11, 3))
                .email("juan.carlos@correo.com")
                .pais("Espanha")
                .documento("DNI 12345678X")  // Documento fictício da Espanha (DNI)
                .telefone("+34 91 123 4567")  // Telefone da Espanha
                .build();
        try {
            ValidadorUsuario.getInstance().validar(usuarioDTO);
            fail("Deveria ter lançado uma DadosUsuarioInvalidosException");
        } catch (DadosUsuarioInvalidosException ex) {
            assertEquals("Deve ter pelo menos 1 nome e 1 sobrenome com pelo menos 1 letra em cada um.", ex.getMessage());
        }

    }

    @Test
    public void deve_ter_telefone_celular_valido_no_padrao_brasileiro_se_for_brasileiro() {
        UsuarioDTO usuarioDTO = new UsuarioDTO.Builder()
                .nome("Mariana Santos")
                .dataNascimento(LocalDate.of(1989, 8, 5))
                .email("mariana.santos@gmail.com")
                .pais("Brasil")
                .documento("456.789.123-00")  // CPF
                .telefone("+55 31 92345-6789")  // Telefone brasileiro
                .build();
        try {
            ValidadorUsuario.getInstance().validar(usuarioDTO);
        } catch (DadosUsuarioInvalidosException ex) {
            fail("Não deveria ter lançado uma DadosUsuarioInvalidosException");
        }

        usuarioDTO = new UsuarioDTO.Builder()
                .nome("Emma Watson")
                .dataNascimento(LocalDate.of(1990, 4, 15))
                .email("emma.watson@mail.com")
                .pais("Reino Unido")
                .documento("UKNIN 987654321")  // Documento fictício do Reino Unido
                .telefone("+44 20 7946 0958")  // Telefone do Reino Unido
                .build();
        try {
            ValidadorUsuario.getInstance().validar(usuarioDTO);
        } catch (DadosUsuarioInvalidosException ex) {
            fail("Não deveria ter lançado uma DadosUsuarioInvalidosException");
        }

        usuarioDTO = new UsuarioDTO.Builder()
                .nome("Mariana Santos")
                .dataNascimento(LocalDate.of(1989, 8, 5))
                .email("mariana.santos@gmail.com")
                .pais("Brasil")
                .documento("456.789.123-00")  // CPF
                .telefone("+44 20 7946 0958")  // Telefone do Reino Unido
                .build();
        try {
            ValidadorUsuario.getInstance().validar(usuarioDTO);
            fail("Deveria ter lançado uma DadosUsuarioInvalidosException");
        } catch (DadosUsuarioInvalidosException ex) {
            assertEquals("Telefone é inválido.", ex.getMessage());
        }

    }

    @Test
    public void deve_ser_maior_de_18_anos() {
        UsuarioDTO usuarioDTO = new UsuarioDTO.Builder()
                .nome("Hans Müller")
                .dataNascimento(LocalDate.of(1979, 10, 10))
                .email("hans.mueller@mail.de")
                .pais("Alemanha")
                .documento("IDNR 1234567890")  // Documento fictício da Alemanha
                .telefone("+49 30 123456")  // Telefone da Alemanha
                .build();
        try {
            ValidadorUsuario.getInstance().validar(usuarioDTO);
        } catch (DadosUsuarioInvalidosException ex) {
            fail("Não deveria ter lançado uma DadosUsuarioInvalidosException");
        }

        usuarioDTO = new UsuarioDTO.Builder()
                .nome("Isabella Rossi")
                .dataNascimento(LocalDate.of(2020, 2, 12))
                .email("isabella.rossi@libero.it")
                .pais("Itália")
                .documento("CF ROS12345L98")  // Documento fictício da Itália (Codice Fiscale)
                .telefone("+39 06 1234 5678")  // Telefone da Itália
                .build();
        try {
            ValidadorUsuario.getInstance().validar(usuarioDTO);
            fail("Deveria ter lançado uma DadosUsuarioInvalidosException");
        } catch (DadosUsuarioInvalidosException ex) {
            assertEquals("Usuário deve ter idade igual ou maior que 18 anos.", ex.getMessage());
        }
    }
}
