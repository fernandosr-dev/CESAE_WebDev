// 3 - Conversão de Euros para Reais 
// Objetivo: Desenvolver um programa que converta um determinado número de euros para reais. 
// Informação adicional: 1 euro equivale a 6.04 reais neste momento. 
// Para este exercício, não é para fazer arredondamentos de valores. 
// Requisitos: 
// • Pedir ao utilizador que forneça um determinado número de euros. Para este 
// exercício não serão necessárias validações. Assuma que o utilizador vai fornecer um 
// número real positivo. 
// • Em seguida, o programa deverá apresentar o número de reais respetivo. 
import java.util.Scanner;

class ConversaoValores
{   Scanner valorUtilizador = new Scanner(System.in);
    
    ConversaoValores()
    {
        System.out.println("Bem vindo ao conversor de moedas de Euros para Reais.");
        System.out.println("Por favor, informe o valor em Euros que deseja converter para reais.");
        
        float valorUtilizadorGuardado = valorUtilizador.nextFloat();        
        float resultado = valorUtilizadorGuardado * 6.04F;
        System.out.println("O valor em reais corresponde a R$ " + resultado);
        
        
    }
    
    // float conversor()
    // {
        // float valorUtilizadorGuardado = valorUtilizador.nextFloat();
        // float resultado = valorUtilizadorGuardado * 6.04F;
        // return resultado;
        
    // }
}