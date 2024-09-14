package br.com.mtanuri.ada.t1172.poo2.aula2.validadores.impl;

import br.com.mtanuri.ada.t1172.poo2.aula2.user.DadosUsuarioInvalidosException;
import br.com.mtanuri.ada.t1172.poo2.aula2.user.UsuarioDTO;
import br.com.mtanuri.ada.t1172.poo2.aula2.user.ValidadorUsuario;
import br.com.mtanuri.ada.t1172.poo2.aula2.validadores.ValidacaoUsuario;

import java.time.LocalDate;
import java.time.temporal.TemporalUnit;

public class MaioridadeValidador implements ValidacaoUsuario {
    @Override
    public void validar(UsuarioDTO usuarioDTO) throws DadosUsuarioInvalidosException {

        long idade = usuarioDTO.dataNascimento().until(LocalDate.now()).getYears();
        if(idade<18){
            throw new DadosUsuarioInvalidosException("Usuário deve ter idade igual ou maior que 18 anos.");
        }


    }
}
