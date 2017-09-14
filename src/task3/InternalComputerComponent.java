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
public InternalComputerComponent implements ComputerComponent {

    public static String REQUIRED_MSG = "This is a required field.";

    private String manufacturer; 
    private String buildYear;
    private boolean workingProperly;
    private String color;

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
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean isWorkingProperly() {
        return workingProperly;
    }
    public void setWorkingProperly(boolean workingProperly) {
        this.workingProperly = workingProperly;
    }
    @Override
    public String buildComponentStatus(){
        return "\n" + "This component was built in " + this.getBuildYear() + " by " +  this.getManufacturer()+".\n"
                + "Its working status is " + workingProperly + " and it is the color " + color + ".";
    }

    
}
