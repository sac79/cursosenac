Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 17/04/2024
Var
// Se��o de Declara��es das vari�veis 
salarioatual: real;
salarionovo: real;
aumento: real;

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
               Escreva ("Qual o valor do seu sal�rio ?")
               Leia (salarioatual)
               aumento<-(salarioatual*(25/100))
               salarionovo<-salarioatual+aumento
               
               Escreva ("Seu novo sal�rio ser� de", salarionovo)

Fimalgoritmo