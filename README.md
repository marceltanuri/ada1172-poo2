# ada1172-poo2

Rquisitos para aula 2

* Fazer passar todos os testes da classe ValidadorUsuarioTest
* Para isso vocês vão precisar:
1. Criar no pacote `br.com.mtanuri.ada.t1172.poo2.aula2.validadores.impl` pelo menos uma classe que implemente a interface ValidacaoUsuario
2. No método validar, vocês deverão lidar com a lógica para validar os dados do usuário seguindo os requisitos a seguir
   - O nome do usuário deve ter pelo menos 1 nome e 1 sobrenome, com pelo menos 1 letra em cada
   - O usuário deve ser maior de idade, considere 18 anos como maioridade
   - O usuário, se for brasileiro, deve ter o CPF válido. exemplo de CPF válido nesse caso: 456.789.123-00. Já um inválido seria 123456789.
   - O usuário, se for brasileiro, deve ter número de telefone válido: Por exemplo, +44 20 7946 0958

Dica: 
* O ideal, pensando nos conceitos de Single Responsability que vocês vão aprender mais adiante, é que cada regra de validação fique em uma classe separada, que implemente a interface ValidacaoUsuario. Embora fazer uma única classe também funcione, mas o que queremos é seguir as boas práticas de arquitetura de software :) 
