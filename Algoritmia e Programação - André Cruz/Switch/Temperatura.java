import java.util.Random;

class Temperatura
{   
    int numeroAleatorio = new Random().nextInt(0,41);
    Temperatura()
    {
        System.out.println("A temperatura atual é de: " + numeroAleatorio + " graus.");
        
        switch (numeroAleatorio)
        {   
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Muito frio!!");
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:                
                System.out.println("Temperatura moderada!!");
                break;
                
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:                
                System.out.println("Está quente!!");
                break;
                
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:                
                System.out.println("Que calor dos diabos!!");
                break;
        }       
    }
}
