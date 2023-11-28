
package moneda;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Laura Romero
 */

public class moneda 
{
    public static void main(String[] args) throws Exception
    {
        int jugar = 1,
            contadorP = 0,
            contadorN = 0;
        
        String nombre =  ("");
        
        try (Scanner lectura = new Scanner(System.in))
        {
            System.out.println("\n ¡BIENVENIDO AL CARISELLAZO!");
            nombre =  JOptionPane.showInputDialog(" ¿Cuál es su nombre?");
         
            do 
            {  
                System.out.println("\n " + nombre + ", ¿Por cuál desea apostar? \n 1. Sello \n 2. Cara");
                int opcionUsuario = lectura.nextInt();
                
                int opcion = (int)(Math.random() * 2) + 1;
                System.out.println("\n La moneda se esta lanzando... \n");

                // GANA
                if(opcionUsuario == opcion)
                {
                    contadorP = contadorP + 1;
                    
                    System.out.println(" ¡Felicidades, ha ganado! \n");
                }
                 
                // PIERDE
                else
                {
                    contadorN = contadorN + 1;
                    
                    System.out.println(" ¡Ha perdido, siga intentando! \n");
                }
                
                // GANA
                if(contadorP == 1)
                {
                    System.out.println(" Ha ganado: " + contadorP + " vez");
                }
                else
                {
                    System.out.println(" Ha ganado: " + contadorP + " veces");
                }
                
                // PIERDE
                if(contadorN == 1)
                {
                    System.out.println(" Ha perdido: " + contadorN + " vez");
                }
                else
                {
                    System.out.println(" Ha perdido: " + contadorN + " veces");
                }
                
                System.out.println("\n Si desea seguir jugando digite 1, si desea salir digite 2");
                jugar = lectura.nextInt();
                System.out.println("");
            }
            
            while (jugar != 2);
        }

        System.out.println("\n ¡Muchas gracias por haber jugado!");
        
        // GANÓ
        if(contadorP == 1)
        {
            System.out.println("  Ganó: " + contadorP + " vez");
        }
        else
        {
            System.out.println("  Ganó: " + contadorP + " veces");
        }
        
        // PERDIÓ
        if(contadorN == 1)
        {
            System.out.println("  Perdió: " + contadorN + " vez");
        }
        else
        {
            System.out.println("  Perdió: " + contadorN + " veces");
        }
        
        System.out.println(" ¡Lo esperamos pronto! \n\n");
        
    }         
}
