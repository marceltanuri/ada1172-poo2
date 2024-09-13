package br.com.mtanuri.ada.t1172.poo2.aula2.user;

import java.time.LocalDate;

public record UsuarioDTO(
        String nome,
        LocalDate dataNascimento,
        String email,
        String pais,
        String documento,
        String telefone
) {

    public static class Builder {
        private String nome;
        private LocalDate dataNascimento;
        private String email;
        private String pais;
        private String documento;
        private String telefone;

        // Métodos setters fluentes para cada campo
        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder dataNascimento(LocalDate dataNascimento) {
            this.dataNascimento = dataNascimento;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder pais(String pais) {
            this.pais = pais;
            return this;
        }

        public Builder documento(String documento) {
            this.documento = documento;
            return this;
        }

        public Builder telefone(String telefone) {
            this.telefone = telefone;
            return this;
        }

        // Método de construção que retorna um novo UsuarioDTO
        public UsuarioDTO build() {
            return new UsuarioDTO(nome, dataNascimento, email, pais, documento, telefone);
        }
    }
}
