/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AreaAndVolumeCalculator;

/**
 *
 * @author Duncan
 */
public class Square extends Rectangle implements Shape{
    
    public double calculateArea(){
        return super.calculateArea();
    }
    
    public void setWidth(double width){
        super.setLength(width);
        super.setWidth(width);
    }
    
    public void setLength(double length){
        super.setLength(length);
        super.setWidth(length);
    }
    

}
