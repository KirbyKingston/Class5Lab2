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
    
    public static String REQUIRED_MSG = "This is a required field.";
    
    public String getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(String buildYear) {
        if(buildYear == null || buildYear.isEmpty()) {
            throw new IllegalArgumentException(REQUIRED_MSG);
        }
        this.buildYear = buildYear;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        if(manufacturer == null || manufacturer.isEmpty()) {
            throw new IllegalArgumentException(REQUIRED_MSG);
        }
        this.manufacturer = manufacturer;
    }
    
    public String buildComponentStatus(){
        return "\n" + "This component was built in " + buildYear + " by " +  manufacturer;
    }
    
}
