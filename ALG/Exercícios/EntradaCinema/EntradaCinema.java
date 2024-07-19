// 2 - Entrada no Cinema 
// Objetivo: Desenvolver um programa que pergunte a idade e verifique se a pessoa pode entrar no 
// cinema. 
// Requisitos: 
// • Pedir ao utilizador que forneça a sua idade. Para este exercício não serão necessárias 
// validações. Assuma que o utilizador vai fornecer um número inteiro positivo. 
// • No caso da sua idade ser menor que 18 anos, forneça a mensagem de “Proibido Entrar!”. 
// • Caso a sua idade seja maior ou igual que 18 anos, forneça a mensagem “Permitida a Entr 
// ada!”. 

import java.util.Scanner;

class EntradaCinema
{
    Scanner scanIdadeUtilizador = new Scanner(System.in);
    EntradaCinema()
    {   
        System.out.println("Este cinema é para maiores de 18 anos. Por favor, informe sua idade");
        int idadeUtilizador = scanIdadeUtilizador.nextInt();
        
        if(idadeUtilizador < 18 == true)
        {
            System.out.println("Proibido Entrar!");
        }
        else
        {
            System.out.println("Entrada permitida!");
        }
    }
}