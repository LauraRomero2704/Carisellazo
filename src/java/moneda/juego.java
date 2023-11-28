
package moneda;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Laura Romero
 */

public class juego 
{
    public static void main(String[] args) throws Exception
    {
        // Declaracion de Variables
        int contador = 0,
            creditos,
            recarga = 0,
            jugar = 1, 
            apuesta;
        
        String nombre =  ("");
        
        try (Scanner lectura = new Scanner(System.in)) 
        {
            System.out.println("\n ¡BIENVENIDO AL CARISELLAZO!");
            nombre =  JOptionPane.showInputDialog(" ¿Cuál es su nombre?");
            System.out.println("");
            
            System.out.println ("\n " + nombre + " digite la cantidad de creditos que quiere ingresar");
            creditos = lectura.nextInt();
         
            do 
            {
                
                System.out.println("\n ¿Cuánto quisiera apostar?");
                apuesta = lectura.nextInt();
                
                if(creditos >= apuesta)
                {
                    
                    System.out.println("\n " + nombre + ", ¿Por cuál desea apostar? \n 1. Sello \n 2. Cara");
                    int opcionUsuario = lectura.nextInt();

                    int opcion = (int)(Math.random() * 2) + 1;
                    System.out.println("\n La moneda se esta lanzando... \n");
                
                    // GANAR
                    if(opcionUsuario == opcion)
                    {
                        System.out.println(" ¡Felicidades, ha ganado! ");
                        contador = contador + 1;
                    
                        System.out.println(" Ganó: " + apuesta);
                        creditos = creditos + apuesta;
                        System.out.println(" Total de creditos: " + creditos);
                    }

                    // PERDER
                    else
                    {
                        System.out.println("\n Lo sentimos, ha perdido");
                        contador = contador + 1;
                    
                        System.out.println(" Perdió: " + apuesta);
                        creditos = creditos - apuesta;
                        System.out.println(" Total de creditos: " + creditos);
                    }
                    
                    System.out.println("\n Si desea seguir jugando digite 1, si desea salir digite 2");
                    jugar = lectura.nextInt();
                    System.out.println("");
                    
                }
                
                else
                {
                    System.out.println("\n Lo sentimos, no tiene los suficientes creditos para poder apostar");
                    System.out.println("Si desea recargar creditos digite 1, si desea salir del juego digite 2");
                    recarga = lectura.nextInt();
                    
                    if (recarga == 1){
                        System.out.println ("\n " + nombre + " digite la cantidad de creditos que quiere recargar");
                        creditos = lectura.nextInt();
                    }
                }
            }
            
            while (jugar!=2);
        }
        
        System.out.println("\n ¡Muchas gracias por haber jugado");
        System.out.println("  Jugó: " + contador + " veces, y acúmulo " + creditos + " creditos \n");
        System.out.println(" ¡Lo esperamos pronto! \n\n");
        
    }
}
