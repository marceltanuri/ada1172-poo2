package br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.model;

import java.time.LocalDateTime;

public class Locacao {

    private Cliente cliente;

    private Veiculo veiculo;

    private Agencia agenciaRetirada;

    private Agencia agenciaDevolucao;

    private LocalDateTime dataHoraInicio;

    private LocalDateTime dataHoraFim;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public LocalDateTime getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public LocalDateTime getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(LocalDateTime dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }

    public Agencia getAgenciaRetirada() {
        return agenciaRetirada;
    }

    public void setAgenciaRetirada(Agencia agenciaRetirada) {
        this.agenciaRetirada = agenciaRetirada;
    }

    public Agencia getAgenciaDevolucao() {
        return agenciaDevolucao;
    }

    public void setAgenciaDevolucao(Agencia agenciaDevolucao) {
        this.agenciaDevolucao = agenciaDevolucao;
    }

    public double calculaValorPorDiasDeUso(){
        return this.veiculo.getValorDiaria() * this.calculaDiasDeUso();
    }

    public double calculaDiasDeUso() {
        return 0.0;
    }


    public boolean isMesmoLocalDeDevolucao(){
        return this.agenciaRetirada.equals(agenciaDevolucao);
    }
}
