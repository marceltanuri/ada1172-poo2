package br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.model;

public record Devolucao (Locacao locacao, double desconto, double taxaDeslocamento){

    public double getValorFinal(){
        return (this.locacao.calculaValorPorDiasDeUso() * desconto) + taxaDeslocamento;
    }

}
