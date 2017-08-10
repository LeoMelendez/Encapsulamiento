/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Public;

/**
 *
 * @author Español
 */
import javax.swing.JOptionPane;
public class Persona {
    
     public int altura = 10;
    public int Largo = 30;
    final int ojos = 2;
    
    
    public static void main(String[] args){
        
        Persona Juan = new Persona();
        Juan.altura = 20;
        System.out.println("la altura de juan es :"+Juan.altura);
        System.out.println ("Juan tiene "+Juan.ojos+" ojos");
        
        Persona Pedro = new Persona();
        
        JOptionPane.showMessageDialog(null,"la altura de juan es "+Juan.altura+"\njuan tiene "+Juan.ojos+" ojos");
        JOptionPane.showMessageDialog(null,"la altura de juan es "+Pedro.altura+"\njuan tiene "+Pedro.ojos+" ojos");
    }
}
