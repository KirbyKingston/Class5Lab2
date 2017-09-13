/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author Mitch
 */
public class ComputerComponent {
    
    private int serialNumber;
    private String manufacturer; 

    public ComputerComponent(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    public String ComputerInfo(){
        return this.getManufacturer() + this.getSerialNumber();
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    
    
}
