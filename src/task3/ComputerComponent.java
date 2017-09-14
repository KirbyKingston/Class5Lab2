/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author Mitch
 */
public interface ComputerComponent {
      
    public static String REQUIRED_MSG = "This is a required field.";
    
    
    public abstract String getManufacturer(); 
    
    public abstract void setManufacturer(String manufacturer);
    
    public abstract String getBuildYear();
    
    public abstract void setBuildYear(String buildYear);

    
    public abstract String componentStatus();
    
}
