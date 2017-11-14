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
public class ModelProgrammer extends ModelEmployee{
    
    public int  bonus;
    
    public ModelProgrammer(){
        this.bonus=60000;
    }
    
    
    public void bonusProgrammer(){
        System.out.println("Salary Employee Programmer = " + super.salary); 
        System.out.println("Bonus Programmer = " + this.bonus); 
    }
    
}
