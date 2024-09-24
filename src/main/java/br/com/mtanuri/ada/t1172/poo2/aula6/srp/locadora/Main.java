package br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora;

import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.model.Cliente;
import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.model.Devolucao;
import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.model.Locacao;
import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.repository.pf.DescontosPessoaFisicaRepository;
import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.repository.pf.TaxasPessoaFisicaRepository;
import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.repository.pj.DescontosPessoaJuridicaRepository;
import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.repository.pj.TaxasPessoaJuridicaRepository;
import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.service.CalculadoraDeDistanciaService;
import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.service.DevolucaoFactory;
import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.service.DevolucaoService;
import br.com.mtanuri.ada.t1172.poo2.aula6.srp.locadora.service.impl.CalculadoraDeDistanciaImpl;

public class Main {

    public static void main(String[] args) {

        TaxasPessoaFisicaRepository taxasPessoaFisicaRepository = null;
        DescontosPessoaFisicaRepository descontosPessoaFisicaRepository = null;
        TaxasPessoaJuridicaRepository taxasPessoaJuridicaRepository = null;
        DescontosPessoaJuridicaRepository descontosPessoaJuridicaRepository = null;
        CalculadoraDeDistanciaService calculadoraDeDistanciaService = new CalculadoraDeDistanciaImpl();
        Cliente cliente = new Cliente();
        Locacao locacao = new Locacao();

        DevolucaoService devolucaoService = DevolucaoFactory.getInstance(taxasPessoaFisicaRepository, descontosPessoaFisicaRepository, taxasPessoaJuridicaRepository, descontosPessoaJuridicaRepository, calculadoraDeDistanciaService).getDevolucaoService(cliente);

        Devolucao devolucao = devolucaoService.realizarDevolucao(locacao);

    }
}
