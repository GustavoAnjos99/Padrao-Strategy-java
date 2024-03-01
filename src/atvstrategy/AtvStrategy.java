/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atvstrategy;

/**
 *
 * @author Gustavo Campos
 */
public class AtvStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contexto c = new Contexto();
        EstrategiaConcreta strategy = new EstrategiaConcreta();
        
        System.out.println(c.mensagemDoDia(strategy));
    }
    
}
