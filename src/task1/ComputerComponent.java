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
public class ComputerComponent {
    
    private String manufacturer; 
    private String buildYear;
    
    
    public String ComputerInfo(){
        return this.getManufacturer();
    }
    public String getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(String buildYear) {
        this.buildYear = buildYear;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    public String componentStatus(){
        return "\n" + "This component was built in " + buildYear + " by " +  manufacturer;
    }
    
}
