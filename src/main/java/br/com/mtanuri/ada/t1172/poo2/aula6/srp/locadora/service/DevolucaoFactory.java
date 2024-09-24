package br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.service;

import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.model.Cliente;
import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.model.TipoCliente;
import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.repository.pf.DescontosPessoaFisicaRepository;
import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.repository.pf.TaxasPessoaFisicaRepository;
import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.repository.pj.DescontosPessoaJuridicaRepository;
import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.repository.pj.TaxasPessoaJuridicaRepository;
import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.service.impl.DevolucaoPFServiceImpl;
import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.service.impl.DevolucaoPJServiceImpl;

public class DevolucaoFactory {

    private final CalculadoraDeDistanciaService calculadoraDeDistanciaService;
    private final TaxasPessoaFisicaRepository taxasPessoaFisicaRepository;
    private final DescontosPessoaFisicaRepository descontosPessoaFisicaRepository;
    private final TaxasPessoaJuridicaRepository taxasPessoaJuridicaRepository;
    private final DescontosPessoaJuridicaRepository descontosPessoaJuridicaRepository;

    private static DevolucaoFactory instance;

    private DevolucaoFactory(TaxasPessoaFisicaRepository taxasPessoaFisicaRepository, DescontosPessoaFisicaRepository descontosPessoaFisicaRepository, TaxasPessoaJuridicaRepository taxasPessoaJuridicaRepository, DescontosPessoaJuridicaRepository descontosPessoaJuridicaRepository, CalculadoraDeDistanciaService calculadoraDeDistanciaService) {
        this.taxasPessoaFisicaRepository = taxasPessoaFisicaRepository;
        this.descontosPessoaFisicaRepository = descontosPessoaFisicaRepository;
        this.taxasPessoaJuridicaRepository = taxasPessoaJuridicaRepository;
        this.descontosPessoaJuridicaRepository = descontosPessoaJuridicaRepository;
        this.calculadoraDeDistanciaService = calculadoraDeDistanciaService;
    }

    public static DevolucaoFactory getInstance(TaxasPessoaFisicaRepository taxasPessoaFisicaRepository, DescontosPessoaFisicaRepository descontosPessoaFisicaRepository, TaxasPessoaJuridicaRepository taxasPessoaJuridicaRepository, DescontosPessoaJuridicaRepository descontosPessoaJuridicaRepository, CalculadoraDeDistanciaService calculadoraDeDistanciaService){
        if(instance==null){
            instance = new DevolucaoFactory(taxasPessoaFisicaRepository, descontosPessoaFisicaRepository, taxasPessoaJuridicaRepository, descontosPessoaJuridicaRepository, calculadoraDeDistanciaService);
        }
        return instance;
    }

    public DevolucaoService getDevolucaoService(Cliente cliente){
        return switch (cliente.getTipo()){
            case TipoCliente.PESSOA_FISICA ->  new DevolucaoPFServiceImpl(calculadoraDeDistanciaService, taxasPessoaFisicaRepository, descontosPessoaFisicaRepository);
            case TipoCliente.PESSOA_JURIDICA ->  new DevolucaoPJServiceImpl(calculadoraDeDistanciaService, taxasPessoaJuridicaRepository, descontosPessoaJuridicaRepository);
            default -> null;
        };
    }

}
