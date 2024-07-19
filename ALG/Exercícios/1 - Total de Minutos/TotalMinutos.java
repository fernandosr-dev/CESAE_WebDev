import java.util.Scanner;

// 1 - Total de Minutos 
// Objetivo: Desenvolver um programa que transforme um determinado número de dias em 
// minutos. 
// Requisitos: 
// • Pedir ao utilizador que forneça um determinado número de dias. Para este exercício não 
// serão necessárias validações. Assuma que o utilizador vai fornecer um número inteiro 
// positivo. 
// • Em seguida, o programa deverá apresentar o número total de minutos que todos esses 
// dias têm. 

class TotalMinutos
{
    Scanner scanNumeroDias = new Scanner(System.in);
    
    TotalMinutos()
    {
        System.out.println("Seja bem vindo ao conversor de dias para minutos");
        System.out.println("Informe o número de dias que deseja converter para minutos");
        int valorUtilizadorGuardado = scanNumeroDias.nextInt();
        int minutos = valorUtilizadorGuardado * 1440;
        System.out.println(minutos);      
    }
}