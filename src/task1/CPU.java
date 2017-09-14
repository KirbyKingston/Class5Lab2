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
public class CPU extends InternalComputerComponent {
    
    private double clockRate;
    private String serialNumber;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getClockRate() {
        return clockRate;
    }

    public void setClockRate(double clockRate) {
        this.clockRate = clockRate;
    }
    
    @Override
    public String componentStatus(){
        return "\n" + "This CPU was built in " + this.getBuildYear() + " by " +  this.getManufacturer()+".\n"
                + "Its working status is " + this.isWorkingProperly() + ". \n"
                + "This CPU has a standard clockrate of " + clockRate + "GHz and its serial number is " + serialNumber + ".";
    }
    
}
