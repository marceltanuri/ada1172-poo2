package br.com.mtanuri.ada.t1172.poo2.aula2.validadores.impl;

import br.com.mtanuri.ada.t1172.poo2.aula2.user.DadosUsuarioInvalidosException;
import br.com.mtanuri.ada.t1172.poo2.aula2.user.UsuarioDTO;
import br.com.mtanuri.ada.t1172.poo2.aula2.user.VerificadorDeNacionalidade;
import br.com.mtanuri.ada.t1172.poo2.aula2.validadores.ValidacaoUsuario;

public class CPFValidador implements ValidacaoUsuario {

    @Override
    public void validar(UsuarioDTO usuarioDTO) throws DadosUsuarioInvalidosException {

        if (VerificadorDeNacionalidade.isBrasileiro(usuarioDTO)) {
            String cpf = usuarioDTO.documento().replace(".", "").replace("-", "");

            if (cpf.length() != 11) {
                throw new DadosUsuarioInvalidosException("document.brazilian.invalid");
            }

            try {
                Long.valueOf(cpf);
            } catch (Exception e) {
                e.printStackTrace();
                throw new DadosUsuarioInvalidosException("document.brazilian.invalid");
            }
        }


    }
}
