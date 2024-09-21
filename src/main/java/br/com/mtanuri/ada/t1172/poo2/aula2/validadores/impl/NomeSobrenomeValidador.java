package br.com.mtanuri.ada.t1172.poo2.aula2.validadores.impl;

import br.com.mtanuri.ada.t1172.poo2.aula2.user.DadosUsuarioInvalidosException;
import br.com.mtanuri.ada.t1172.poo2.aula2.user.UsuarioDTO;
import br.com.mtanuri.ada.t1172.poo2.aula2.validadores.ValidacaoUsuario;

public class NomeSobrenomeValidador implements ValidacaoUsuario {
    @Override
    public void validar(UsuarioDTO usuarioDTO) throws DadosUsuarioInvalidosException {

        String[] nomeSobrenome = usuarioDTO.nome().split(" ");

        if(nomeSobrenome.length<2){
            throw new DadosUsuarioInvalidosException("Deve ter pelo menos 1 nome e 1 sobrenome com pelo menos 1 letra em cada um.");
        }

        if(nomeSobrenome[0].length()<1 || nomeSobrenome[1].length()<1){
            throw new DadosUsuarioInvalidosException("Deve ter pelo menos 1 nome e 1 sobrenome com pelo menos 1 letra em cada um.");
        }

    }
}
