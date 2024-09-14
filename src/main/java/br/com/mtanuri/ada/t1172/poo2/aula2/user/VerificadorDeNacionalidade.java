package br.com.mtanuri.ada.t1172.poo2.aula2.user;

public class VerificadorDeNacionalidade {

    public static boolean isBrasileiro(UsuarioDTO dto){
        return dto.pais().equals("Brasil");
    }

}
