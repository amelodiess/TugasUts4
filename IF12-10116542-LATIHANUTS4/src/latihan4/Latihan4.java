/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author Amelia
 */
public class Latihan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ModelDesigner designer = new ModelDesigner();
        ModelSystemAnalyst sa = new ModelSystemAnalyst();
        ModelProgrammer pr = new ModelProgrammer();
        
        designer.bonusDesigner();
        sa.bonusSystemAnalyst();
        pr.bonusProgrammer();
        
            
        
    }
    
}
