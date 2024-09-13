package br.com.mtanuri.ada.t1172.poo2.aula2.user;

import br.com.mtanuri.ada.t1172.poo2.aula2.validadores.ValidacaoUsuario;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ValidadorUsuario {

    // Instância única da classe
    private static ValidadorUsuario instancia;

    private List<ValidacaoUsuario> validadores = new ArrayList<>();

    // Construtor privado para evitar instânciação externa
    private ValidadorUsuario() {
        carregarValidadores();
        System.out.println(validadores.size());
    }

    private void carregarValidadores() {
        Reflections reflections = new Reflections("br.com.mtanuri.ada.t1172.poo2.aula2.validadores.impl");
        Set<Class<? extends ValidacaoUsuario>> classes = reflections.getSubTypesOf(ValidacaoUsuario.class);

        for (Class<? extends ValidacaoUsuario> clazz : classes) {
            try {
                validadores.add(clazz.getDeclaredConstructor().newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // Método público estático para obter a instância única
    public static synchronized ValidadorUsuario getInstance() {
        if (instancia == null) {
            instancia = new ValidadorUsuario();
        }
        return instancia;
    }

    public void validar(UsuarioDTO usuarioDTO) throws DadosUsuarioInvalidosException {
        for (ValidacaoUsuario validador : validadores) {
            validador.validar(usuarioDTO);
        }
    }
}