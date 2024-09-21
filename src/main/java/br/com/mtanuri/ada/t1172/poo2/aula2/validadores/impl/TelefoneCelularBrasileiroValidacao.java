package br.com.mtanuri.ada.t1172.poo2.aula2.validadores.impl;

import br.com.mtanuri.ada.t1172.poo2.aula2.user.DadosUsuarioInvalidosException;
import br.com.mtanuri.ada.t1172.poo2.aula2.user.UsuarioDTO;
import br.com.mtanuri.ada.t1172.poo2.aula2.user.VerificadorDeNacionalidade;
import br.com.mtanuri.ada.t1172.poo2.aula2.validadores.ValidacaoUsuario;

public class TelefoneCelularBrasileiroValidacao implements ValidacaoUsuario {
    @Override
    public void validar(UsuarioDTO usuarioDTO) throws DadosUsuarioInvalidosException {

        if(VerificadorDeNacionalidade.isBrasileiro(usuarioDTO)){
            String telefone = usuarioDTO.telefone().replace(" ", "").replace("+","").replace("-", "");

            if(telefone.length()!=13){
                throw new DadosUsuarioInvalidosException("Telefone é inválido.");
            }

            try {
                Long.valueOf(telefone);
            }
            catch (Exception e){
                throw new DadosUsuarioInvalidosException("Telefone é inválido.");
            }
        }

     }
}
