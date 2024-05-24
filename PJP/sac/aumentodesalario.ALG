Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 17/04/2024
Var
// Seção de Declarações das variáveis 
salarioatual: real;
salarionovo: real;
aumento: real;
variacao: real;

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
               Escreva ("Qual o valor do seu salário ?")
               Leia (salarioatual)
               Escreva ("Qual o valor do aumento")
               Leia (variacao)
               aumento<-(salarioatual*(variacao/100))
               salarionovo<-salarioatual+aumento
               
               Escreva ("Seu novo salário será de", salarionovo)

Fimalgoritmo