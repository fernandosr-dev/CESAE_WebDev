import java.util.Scanner;

class Operadores
{
    Operadores()
    {
        int valorX = 6;
        int valorY = 3;
        int valorZ = 3 * (valorY -1) + valorX;
        
        //float valorReal = 8.3F;
        
        //float valorReal = valorX; => inteiro converte automaticamente para float.
        
        float valorReal = 6.2f / 3; //=> não converte aumaticamente float para inteiro
        
        int numeroInteiro = (int)valorReal; //=> força a conversão de float para inteiro mas perde decimal
        
        System.out.println(numeroInteiro);
        
        Scanner scanFloat = new Scanner(System.in);
        float teste = scanFloat.nextFloat();
        
        // Incremento em 1: += (++)
        
        int contador = 0;
        //int contador = ++; => 1
        
        contador = contador + 1; //=> 1
        
        //Incremento em N
        contador += 7; //=> 5
        contador = contador + 4;
        
        // -= Decremento em 1
        contador --;
        
        // -= Decremento em N
        contador -= 5;
        contador = contador - 2;
        
        
        

    }
}