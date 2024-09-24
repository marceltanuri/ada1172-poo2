package br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.service.impl;

import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.model.Locacao;
import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.repository.pj.DescontosPessoaJuridicaRepository;
import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.repository.pj.TaxasPessoaJuridicaRepository;
import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.service.CalculadoraDeDistanciaService;
import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.service.DevolucaoServiceBase;

public class DevolucaoPJServiceImpl extends DevolucaoServiceBase {

    private TaxasPessoaJuridicaRepository taxasRepository;
    private DescontosPessoaJuridicaRepository descontosRepository;

    public DevolucaoPJServiceImpl(CalculadoraDeDistanciaService calculadoraDeDistanciaService, TaxasPessoaJuridicaRepository taxasRepository, DescontosPessoaJuridicaRepository descontosRepository) {
        super(calculadoraDeDistanciaService);
        this.taxasRepository = taxasRepository;
        this.descontosRepository = descontosRepository;
    }

    @Override
    public double calcularTaxaDeTransporteDeVeiculo(int kilometros) {
        //outras regras especificas de PJ
        return taxasRepository.getTaxaDeslocamento();
    }

    @Override
    public double calcularDescontoCliente(Locacao locacao) {
        //outras regras especificas de PJ
        if (locacao.calculaDiasDeUso() > descontosRepository.getDiasDeUsoNecessarios()) {
            return descontosRepository.getDesconto();
        }
        return 1;
    }
}
