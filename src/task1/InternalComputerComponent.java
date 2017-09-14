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
public class InternalComputerComponent extends ComputerComponent{

    private boolean workingProperly;
    private String color;
    
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
