// 5 -Índice de Massa Corporal 
// Objetivo: Desenvolver um programa que apresente o índice de massa corporal em função do peso 
// e altura fornecidos. 
// Informação adicional: O índice de massa corporal é calculado através da divisão do peso de uma 
// pessoa pelo quadrado da sua altura, ou seja, peso / (altura * altura). 
// Requisitos: 
// • Pedir ao utilizador que forneça o seu peso em quilogramas e em seguida a sua altura em 
// metros. Para este exercício não serão necessárias validações. Assuma que o utilizador vai 
// fornecer números reais positivos. 
// • Em seguida, o programa deverá apresentar o cálculo final do índice de massa corporal. 

import java.util.Scanner;

class IndiceMassaCorporal
{   
    Scanner scanPesoUtilizador = new Scanner(System.in);
    Scanner scanAlturaUtilizador = new Scanner(System.in);
    IndiceMassaCorporal()
    {
        mensagemInicial();
    }
    
    void CalculoImc()
    {
                
    }
    
    void mensagemInicial()
    {
        System.out.println("Bem vindo! Vamos calcular o seu Índice de Massa Corporal!");
        System.out.println("Por favor informe seu peso em KGs: ");
        
        System.out.println("Por favor informe sua altura: ");
    }
}