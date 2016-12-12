/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;
import java.time.Duration;
import java.time.Instant;
import javax.swing.JOptionPane;
/**
 *
 * @author Adri
 */
public class time {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        String entrada = "";
        
       /* long principio = System.currentTimeMillis();
        entrada = JOptionPane.showInputDialog("A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática .");
        double fin = System.currentTimeMillis();
        JOptionPane.showMessageDialog(null, "Tiempo: " + ((fin - principio)/1000) + " segundos." );*/
        Instant ahora = Instant.now();
        String entrada2 = JOptionPane.showInputDialog("Hola");
        Instant despues = Instant.now();
        Duration.between(ahora, despues).getSeconds();
        //JOptionPane.showMessageDialog(null, Duration.between(ahora, despues));
        System.out.println(Duration.between(ahora, despues).getSeconds());
        
        
            
    }
    
}
