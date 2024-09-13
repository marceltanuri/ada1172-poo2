package br.com.mtanuri.ada.t1172.poo2.aula1.parte2;

public class CalculadoraCientifica implements Calculadora{
    @Override
    public int soma(int[] nums) {
        int soma = 0;
        for(int n : nums){
            soma += n;
        }
        return soma;
    }

    @Override
    public int divisao(int num1, int num2) {
        return 0;
    }

    @Override
    public int subtracao(int num1, int num2) {
        return 0;
    }
}
