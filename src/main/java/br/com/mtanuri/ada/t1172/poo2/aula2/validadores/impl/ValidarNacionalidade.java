package br.com.mtanuri.ada.t1172.poo2.aula2.validadores.impl;

import br.com.mtanuri.ada.t1172.poo2.aula2.user.DadosUsuarioInvalidosException;
import br.com.mtanuri.ada.t1172.poo2.aula2.user.UsuarioDTO;

public class ValidarNacionalidade {

    public void validar(UsuarioDTO usuarioDTO) throws DadosUsuarioInvalidosException {

        boolean paisValido = switch (usuarioDTO.pais()){
            case "Brasil" -> true;
            case "UK" -> true;
            case "Portugal" -> true;
            case "Índia" -> true;
            case "Colombia" -> true;
            default -> false;
        };

        if(!paisValido){
            throw new DadosUsuarioInvalidosException("O país é inválido para esse cadastrado.");
        }

    }
}
