/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_5_captura;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_5_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        
        
        
        do {            
            try {
                Scanner input=new Scanner(System.in);
                System.out.println("Introduce valor (entero) de x");
                x=input.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("No se introdujo valor valido, vuelve a capturar");
            }
            
        } while (true);
        System.out.println("Valor de x: "+x);
        
    }
    
}
