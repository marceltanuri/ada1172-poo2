package br.com.mtanuri.ada.t1172.poo2.aula1.parte2;

public class Aplicacao {

    private Calculadora calculadora;

    public Aplicacao(Calculadora c) {
        this.calculadora = c;
    }

    public void executar(){
        int[] numeros = {2,5,10,16};
        System.out.println(calculadora.soma(numeros));
    }
}
