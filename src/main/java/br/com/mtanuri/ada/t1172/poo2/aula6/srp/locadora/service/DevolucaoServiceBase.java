package br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.service;

import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.model.Devolucao;
import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.model.Locacao;

public abstract class DevolucaoServiceBase implements DevolucaoService{

    private CalculadoraDeDistanciaService calculadoraDeDistanciaService;

    public DevolucaoServiceBase(CalculadoraDeDistanciaService calculadoraDeDistanciaService) {
        this.calculadoraDeDistanciaService = calculadoraDeDistanciaService;
    }

    @Override
    public Devolucao realizarDevolucao(Locacao locacao) {

        int distanciaEmKm = 0;

        if(locacao.isMesmoLocalDeDevolucao()){
            distanciaEmKm = this.calculadoraDeDistanciaService.calcularDistanciaEmKm(locacao.getAgenciaRetirada().getLocalizacao(), locacao.getAgenciaDevolucao().getLocalizacao());
        }

        double taxaDeTransporteDeVeiculo = this.calcularTaxaDeTransporteDeVeiculo(distanciaEmKm);

        double desconto = this.calcularDescontoCliente(locacao);

        return new Devolucao(locacao, desconto, taxaDeTransporteDeVeiculo);
    }

    public abstract double calcularTaxaDeTransporteDeVeiculo(int kilometros);

    public abstract double calcularDescontoCliente(Locacao locacao);




}
