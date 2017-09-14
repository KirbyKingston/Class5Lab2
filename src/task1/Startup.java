/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author Mitch
 */
public class Startup {
    
    public static void main(String[] args) {
        CPU cpu1 = new CPU();
        
        cpu1.setBuildYear("2017");
        cpu1.setManufacturer("Intel");
        cpu1.setWorkingProperly(true);
        cpu1.setClockRate(5.8);
        cpu1.setSerialNumber("abc123");
        
        System.out.println(cpu1.componentStatus());
    }
    
}
