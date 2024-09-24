package br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.service.impl;

import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.repository.pf.DescontosPessoaFisicaRepository;
import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.model.Locacao;
import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.repository.pf.TaxasPessoaFisicaRepository;
import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.service.CalculadoraDeDistanciaService;
import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.service.DevolucaoServiceBase;

public class DevolucaoPFServiceImpl extends DevolucaoServiceBase {

    private TaxasPessoaFisicaRepository taxasRepository;
    private DescontosPessoaFisicaRepository descontosRepository;

    public DevolucaoPFServiceImpl(CalculadoraDeDistanciaService calculadoraDeDistanciaService, TaxasPessoaFisicaRepository taxasRepository, DescontosPessoaFisicaRepository descontosRepository) {
        super(calculadoraDeDistanciaService);
        this.taxasRepository = taxasRepository;
        this.descontosRepository = descontosRepository;
    }

    @Override
    public double calcularTaxaDeTransporteDeVeiculo(int kilometros) {
        //outras regras especificas de PF
        return taxasRepository.getTaxaDeslocamento();
    }

    @Override
    public double calcularDescontoCliente(Locacao locacao) {
        //outras regras especificas de PF
        if (locacao.calculaDiasDeUso() > descontosRepository.getDiasDeUsoNecessarios()) {
            return descontosRepository.getDesconto();
        }
        return 1;
    }
}
