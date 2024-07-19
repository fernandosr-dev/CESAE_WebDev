// 4 - Aventura 
// Objetivo: Desenvolver um programa que apresente uma breve história de uma personagem num 
// local e que permita o utilizador escolher uma direção, descrevendo o que acontece a seguir a essa 
// escolha. 
// Requisitos: 
// • Logo desde início, apresentar um texto descritivo de uma personagem e do local onde esta 
// se encontra. Utilize a sua vasta imaginação! 
// • Pedir ao utilizador que escolha uma das seguintes opções: “norte”, “sul”, “este” ou 
// “oeste”. Para este exercício não serão necessárias validações. Assuma que o utilizador vai 
// escrever corretamente uma destas opções. 
// • O programa deverá estar preparado para apresentar uma narrativa diferente para cada 
// opção. Em função da escolha do utilizador, apresente o texto respetivo. 

import java.util.Scanner;

class Aventura
{   
    Scanner scanEscolhaUtilizador = new Scanner (System.in);
    
    Aventura()
    {   
        mensagemInicial();
        historiasPossiveis();
        
        
    }
    
    void mensagemInicial()
    {
        System.out.println("Olá! Está é a história da personagem...");
        System.out.println("Você deve escolher uma direção para que a história continue");
        System.out.println("Escolha uma das seguintes opções: “norte”, “sul”, “este” ou oeste");
        System.out.println("Norte para que tal coisa aconteça...");
        System.out.println("Sul para que tal coisa aconteça...");
        System.out.println("Este para que tal coisa aconteça...");
        System.out.println("Oeste para que tal coisa aconteça...");
        
    }
    
    void historiasPossiveis()
    {
        String EscolhaUtilizadorGuardado = scanEscolhaUtilizador.equalsIgnoreCase();
        
        String norte = "Historia norte...";
        String sul = "Historia sul...";
        String este = "Historia este...";
        String oeste = "Historia oeste...";
        
    
        
        if(EscolhaUtilizadorGuardado == norte)
        {
            System.out.println(norte);
        }
        else
        {
            
        }
    }
    
}